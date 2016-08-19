package com.pradipta.pbcs;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import org.json.JSONArray;
import org.json.JSONObject;


public class ImportHSFdataImpl implements ImportHSFdata {

    public ImportHSFdataImpl() {
        super();
    }
    public Logger logger;

    @Override
    public String deleteFile(String userName, String password, String serverUrl, String apiVersion,
                             String applicationName, String fileName, String instanceId, String log4jLevel,
                             String log4jLogFileLocation) throws Exception {
        // TODO Implement this method
        logger = returnLog4jLogger(instanceId, log4jLevel, log4jLogFileLocation);
        logger.info("Parameters received from BPEL for DELETE FILE");
        logger.info("UserName for DELETE : " + userName);
        logger.info("password for DELETE : " + password);
        logger.info("serverUrl for DELETE : " + serverUrl);
        logger.info("apiVersion for DELETE : " + apiVersion);
        logger.info("applicationName for DELETE : " + applicationName);
        logger.info("fileName for DELETE : " + fileName);
        logger.info("instanceId for DELETE : " + instanceId);
        logger.info("Operation for DELETE : DELETE FILE");
        String urlString =
            String.format("%s/interop/rest/%s/applicationsnapshots/%s", serverUrl, "11.1.2.3.600",
                          fileName); //ApiVerion hardcoded as version: v3 doesn't work for delete and upload
        logger.info("URL String for DELETE : " + urlString);
        logger.info("Call REST service for DELETE FILE");
        String response =
            executeRequest(urlString, "DELETE", null, "application/x-wwwform-urlencoded", userName, password);
        JSONObject json = new JSONObject(response);

        int resStatus = json.getInt("status");
        logger.info("Status for DELETE : " + resStatus);
        if (resStatus == 0) {
            logger.info("File deleted successfully");
            return "File deleted successfully";
        } else {
            logger.error("Error deleting file : " + json.getString("details"));
            throw new Exception("Error deleting file : " + json.getString("details"));
        }
    }

    @Override
    @SuppressWarnings("oracle.jdeveloper.java.semantic-warning")
    public String uploadFile(String userName, String password, String serverUrl, String apiVersion,
                             String applicationName, String filePath, String fileName, String instanceId,
                             String log4jLevel, String log4jLogFileLocation) throws Exception {

        logger = returnLog4jLogger(instanceId, log4jLevel, log4jLogFileLocation);
        logger.info("Parameters received from BPEL for UPLOAD FILE");
        logger.info("UserName for UPLOAD : " + userName);
        logger.info("password for UPLOAD : " + password);
        logger.info("serverUrl for UPLOAD : " + serverUrl);
        logger.info("apiVersion for UPLOAD : " + apiVersion);
        logger.info("applicationName for UPLOAD : " + applicationName);
        logger.info("filePath for UPLOAD : " + filePath);
        logger.info("fileName for UPLOAD : " + fileName);
        logger.info("instanceId for UPLOAD : " + instanceId);
        logger.info("Operation for UPLOAD : Upload FILE");

        final int DEFAULT_CHUNK_SIZE = 50 * 1024 * 1024;
        InputStream fis = null;
        byte[] lastChunk = null;
        File hsfDumpFile = new File(filePath + fileName);
        if (!(hsfDumpFile.exists())) {
            logger.error("File has already been moved : " + filePath + fileName);
            throw new Exception("File has already been moved : " + filePath + fileName);
        }
        long totalFileSize = hsfDumpFile.length(), totalbytesRead = 0;
        boolean isLast = false, status = true;
        Boolean isFirst = true;
        int packetNo = 1, lastPacketNo = (int) (Math.ceil(totalFileSize / (double) DEFAULT_CHUNK_SIZE));
        try {
            logger.info("Starting file read operation for UPLOAD ");
            fis = new BufferedInputStream(new FileInputStream(filePath + fileName));
            while (totalbytesRead < totalFileSize && status) {
                int nextChunkSize = (int) Math.min(DEFAULT_CHUNK_SIZE, totalFileSize - totalbytesRead);
                if (lastChunk == null) {
                    lastChunk = new byte[nextChunkSize];
                    totalbytesRead += fis.read(lastChunk);
                    if (packetNo == lastPacketNo)
                        isLast = true;
                    logger.info("Read Chunk for UPLOAD " + packetNo);
                    status = sendFileContents(isFirst, isLast, lastChunk, fileName, userName, password, serverUrl);
                    isFirst = false;
                    packetNo = packetNo + 1;
                    lastChunk = null;
                }
            }
        } finally {
            if (fis != null)
                fis.close();
            if (status == true) {
                logger.info("Uploaded successfully");
                return "Uploaded successfully";
            } else {
                logger.error("Error Uploading file : " + filePath + fileName);
                throw new Exception("Error Uploading file : " + filePath + fileName);
            }
        }
    }


    private String executeRequest(String urlString, String requestMethod, String payload, String contentType,
                                  String userName, String password) throws Exception {
        HttpURLConnection connection = null;
        try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(requestMethod);
            connection.setInstanceFollowRedirects(false);
            connection.setDoOutput(true);
            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setRequestProperty("Authorization",
                                          "Basic " +
                                          new sun.misc.BASE64Encoder().encode((userName + ":" + password).getBytes()));
            connection.setRequestProperty("Content-Type", contentType);
            if (payload != null) {
                OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
                writer.write(payload);
                writer.flush();
            }
            int status = connection.getResponseCode();
            if (status == 200 || status == 201) {
                logger.info("Http status code: " + status);
                return getStringFromInputStream(connection.getInputStream());
            }
            logger.error("Http status code: " + status);
            throw new Exception("Http status code: " + status);
        } finally {
            if (connection != null)
                connection.disconnect();
        }
    }

    @SuppressWarnings("oracle.jdeveloper.java.nested-assignment")
    private String getStringFromInputStream(InputStream is) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    private boolean sendFileContents(Boolean isFirst, boolean isLast, byte[] lastChunk, String fileName,
                                     String userName, String password, String serverUrl) throws Exception {
        HttpURLConnection connection = null;
        try {
            URL url =
                new URL(String.format("%s/interop/rest/%s/applicationsnapshots/%s/contents?q={chunkSize:%d,isFirst:%b,isLast:%b}",
                                      serverUrl, "11.1.2.3.600", fileName, lastChunk.length, isFirst,
                                      isLast)); //ApiVerion hardcoded as version: v3 doesn't work for delete and upload
            logger.info("URL String : " + url.toString());
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setInstanceFollowRedirects(false);
            connection.setDoOutput(true);
            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setRequestProperty("Authorization",
                                          "Basic " +
                                          new sun.misc.BASE64Encoder().encode((userName + ":" + password).getBytes()));
            connection.setRequestProperty("Content-Type", "application/octet-stream");
            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.write(lastChunk);
            wr.flush();
            int statusCode = connection.getResponseCode();
            String status = getStringFromInputStream(connection.getInputStream());
            if (statusCode == 200 && status != null) {
                int commandStatus = getCommandStatus(status);
                if (commandStatus == 0) {
                    isFirst = false;
                    return true;
                } else if (commandStatus == -1 && isLast) {
                    String pingUrlString = fetchPingUrlFromResponse(status, "Job Status");
                    logger.info("Original Ping URL : " + pingUrlString);
                    pingUrlString = serverUrl + pingUrlString.substring(pingUrlString.indexOf("/HyperionPlanning"));
                    logger.info("Modified Ping URL : " + pingUrlString);
                    getJobStatus(pingUrlString, "GET", -1, userName, password);
                }
            }
            return false;
        } finally {
            if (connection != null)
                connection.disconnect();
        }
    }

    private int getCommandStatus(String response) throws Exception {
        JSONObject json = new JSONObject(response);
        if (!JSONObject.NULL.equals(json.get("status"))) {
            return json.getInt("status");
        } else
            return Integer.MIN_VALUE;
    }

    private String fetchPingUrlFromResponse(String response, String retValue) throws Exception {
        String pingUrlString = null;
        JSONObject jsonObj = new JSONObject(response);
        int resStatus = jsonObj.getInt("status");
        if (resStatus == -1) {
            JSONArray lArray = jsonObj.getJSONArray("links");
            for (int i = 0; i < lArray.length(); i++) {
                JSONObject arr = lArray.getJSONObject(i);
                if (arr.get("rel").equals(retValue))
                    pingUrlString = (String) arr.get("href");
            }
        }
        return pingUrlString;
    }

    private String getJobStatus(String pingUrlString, String methodType, int jobId, String userName,
                                String password) throws Exception {
        boolean completed = false;
        String finalStatus = "invalid call";
        while (!completed) {
            String pingResponse =
                executeRequest(pingUrlString, methodType, null, "application/x-www-form-urlencoded", userName,
                               password);
            JSONObject json = new JSONObject(pingResponse);
            int status = json.getInt("status");
            if (status == -1) {
                try {
                    System.out.println("Please wait...");
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    completed = true;
                    throw e;
                }
            } else {
                if (status > 0) {
                    //System.out.println("Error occurred: " + json.getString("details"));
                    finalStatus = "Job ID : " + jobId + " Error occurred: " + json.getString("details");
                } else {
                    System.out.println("Completed");
                    finalStatus = "Job ID : " + jobId + " Completed";
                }
                completed = true;
            }
        }
        return finalStatus;
    }


    public String executeJob(String userName, String password, String serverUrl, String apiVersion,
                             String applicationName, String jobType, String jobName, String fileName, String instanceId,
                             String log4jLevel, String log4jLogFileLocation) throws Exception {

        logger = returnLog4jLogger(instanceId, log4jLevel, log4jLogFileLocation);
        logger.info("Parameters received from BPEL for IMPORT FILE");
        logger.info("UserName : " + userName);
        logger.info("password : " + password);
        logger.info("serverUrl : " + serverUrl);
        logger.info("apiVersion : " + apiVersion);
        logger.info("applicationName : " + applicationName);
        logger.info("jobType : " + jobType);
        logger.info("jobName : " + jobName);
        logger.info("fileName : " + fileName);
        logger.info("instanceId : " + instanceId);
        logger.info("Operation : IMPORT_FILE");

        String parameters = "{\"importFileName\":\"" + fileName + "\"}";
        logger.info("parameters : " + parameters);
        String urlString =
            String.format("%s/HyperionPlanning/rest/%s/applications/%s/jobs", serverUrl, apiVersion, applicationName);
        logger.info("URL String : " + urlString);
        JSONObject payload = new JSONObject();
        payload.put("jobName", jobName);
        payload.put("jobType", jobType);
        payload.put("parameters", new JSONObject(parameters));
        String response = executeRequest(urlString, "POST", payload.toString(), "application/json", userName, password);
        logger.info("IMPORT_FILE job started successfully");
        JSONObject jsonObj = new JSONObject(response);
        int jobId = jsonObj.getInt("jobId");
        logger.info("jobId : " + jobId);
        String selfPingUrlString = fetchPingUrlFromResponse(response, "self");
        logger.info("Original Ping URL : " + selfPingUrlString);
        selfPingUrlString = serverUrl + selfPingUrlString.substring(selfPingUrlString.indexOf("/HyperionPlanning"));
        logger.info("Modified Ping URL : " + selfPingUrlString);
        String jobStatus = getJobStatus(selfPingUrlString, "GET", jobId, userName, password);
        logger.error("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n\n\n"+jobStatus+"\n\n\n");
        if (! ( jobStatus.contains("error") || jobStatus.contains("Error") ) ){
            logger.info("Job Status : " + jobStatus);
            return jobStatus;
        } else {
            logger.error(jobStatus);
            throw new Exception(jobStatus);
        }
    }

    private Logger returnLog4jLogger(String instanceId, String log4jLevel, String log4jLogFileLocation) {
        Logger logger;
        Level level;

        logger = null;
        logger = Logger.getLogger(this.getClass());

        if (log4jLevel.equalsIgnoreCase("ALL")) {
            level = Level.ALL;
        } else if (log4jLevel.equalsIgnoreCase("DEBUG")) {
            level = Level.DEBUG;
        } else if (log4jLevel.equalsIgnoreCase("ERROR")) {
            level = Level.ERROR;
        } else if (log4jLevel.equalsIgnoreCase("FATAL")) {
            level = Level.FATAL;
        } else if (log4jLevel.equalsIgnoreCase("INFO")) {
            level = Level.INFO;
        } else if (log4jLevel.equalsIgnoreCase("OFF")) {
            level = Level.OFF;
        } else if (log4jLevel.equalsIgnoreCase("TRACE")) {
            level = Level.TRACE;
        } else if (log4jLevel.equalsIgnoreCase("WARN")) {
            level = Level.WARN;
        } else {
            level = Level.ALL;
        }

        FileAppender fileAppender = new FileAppender();
        fileAppender.setName("FileLogger");
        fileAppender.setFile(log4jLogFileLocation + "/" + instanceId + ".log");
        fileAppender.setLayout(new PatternLayout("%d %-5p [%c{1}] %m%n"));
        fileAppender.setImmediateFlush(true);
        fileAppender.setThreshold(Level.ALL);
        fileAppender.setAppend(true);
        fileAppender.activateOptions();

        logger.removeAllAppenders();
        logger.addAppender(fileAppender);
        //logger.setLevel(level);
        logger.setAdditivity(false);

        return logger;
    }


    @Override
    public String moveFile(String filePath, String fileName, String status, String instanceId, String log4jLevel,
                           String log4jLogFileLocation) throws Exception {
        // TODO Implement this method
        logger = returnLog4jLogger(instanceId, log4jLevel, log4jLogFileLocation);
        logger.info("Parameters received from BPEL for MOVE FILE");
        logger.info("filePath for MOVE : " + filePath);
        logger.info("fileName for MOVE : " + fileName);
        logger.info("status for MOVE : " + status);
        logger.info("instanceId for MOVE : " + instanceId);
        logger.info("Operation for MOVE : MOVE FILE");

        File archivefile;
        File unreadFile =
            new File(filePath + fileName);
        if(status.equalsIgnoreCase("SUCCESS"))
        {
            archivefile =
            new File(filePath + "../readDir/" + fileName.substring(0, fileName.indexOf(".txt") + 1) + "_" + instanceId +
                     ".txt");
        }
        else {
            archivefile =
            new File(filePath + "../errorDir/" + fileName.substring(0, fileName.indexOf(".txt") + 1) + "_" + instanceId +
                     ".txt");
        }
        InputStream inStream = new FileInputStream(unreadFile);
        OutputStream outStream = new FileOutputStream(archivefile);

        byte[] buffer = new byte[1024];

        int length = inStream.read(buffer);
        //copy the file content in bytes
        while ((length > 0)) {
            outStream.write(buffer, 0, length);
            length = inStream.read(buffer);
        }

        inStream.close();
        outStream.close();

        //delete the original file
        unreadFile.delete();
        
        return "moved file";
    }
}
