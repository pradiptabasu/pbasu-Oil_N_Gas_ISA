package com.pradipta.pbcs;

/*
File: PBCSImport.java - Created on Jun 6, 2016
*/
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
/*
* PBCS Rest RESTCall.
*
*/
public class PBCSImport {
    private String userName; // PBCS user name
    private String password; // PBCS user password
    private String serverUrl; // PBCS server URL
    private String apiVersion; // Version of the PBCS API that you are developing/compiling with.
    private String applicationName; // PBCS application used in this sample

    public static void main(String[] args) {
        try {
            float num1 = (float) 20488949323.00;
            System.out.println("main");
            PBCSImport RESTCall =
                new PBCSImport("demoadmin", "Welcome1", "http://oa9092.us.oracle.com:9000", "v3", "OG_PBCS");
            // PBCSImport RESTCall =
            //new PBCSImport("demoadmin", "Welcome1", "http://unit48789.oracleads.com:9000", "v3", "OG_PBCS");
            System.out.println("constructor");
            RESTCall.HSFDataLoadToPBCS();
            System.out.println("main exit");
        } catch (Throwable x) {
            System.err.println("Error : " + x.getMessage());
        }
    }

    public PBCSImport(String userName, String password, String serverUrl, String apiVersion,
                      String applicationName) throws Exception {
        this.userName = userName;
        this.password = password;
        this.serverUrl = serverUrl;
        this.apiVersion = apiVersion;
        this.applicationName = applicationName;
    }
    //
    // BEGIN
    //
    public void HSFDataLoadToPBCS() throws Exception {
        //        // Delete the file before loading it
        //        deleteFile("HSFDataFile.csv");
        //        // Upload HSF data file for import to PBCS
        //        uploadFile("HSFDataFile.csv");
        //        //Call the Import Data job for importing HSF data
        //        executeJob("IMPORT_DATA", "DataLoadTesting","{importFileName:HSFDataFile.csv}");

        //        deleteFile("HSFDataFile.csv");
        //        uploadFile("D:\\ISA\\Oil_n_Gas\\","HSFDataFile.csv");
        //        executeJob("IMPORT_DATA", "DataLoadTesting","{importFileName:HSFDataFile.csv}");

        //        deleteFile("HSFDataFile_multiRow.csv");
        //        uploadFile("D:\\ISA\\Oil_n_Gas\\","HSFDataFile_multiRow.csv");
        //        executeJob("IMPORT_DATA", "DataLoadTesting","{importFileName:HSFDataFile_multiRow.csv}");

        //        System.out.println("call delete file");

        //        deleteFile("HSF_input_PBCS_set1_Budget_DataFile_Apr16.csv"); // Delete the file before loading it
        //        uploadFile("D:\\ISA\\Oil_n_Gas\\","HSF_input_PBCS_set1_Budget_DataFile_Apr16.csv");
        //        executeJob("IMPORT_DATA", "DataLoad_test1","{\"importFileName\":\"HSF_input_PBCS_set1_Budget_DataFile_Apr16.csv\"}");
        //
        //        deleteFile("HSF_input_PBCS_set1_Budget_DataFile_Apr16_multiRow.csv"); // Delete the file before loading it
        //        uploadFile("D:\\ISA\\Oil_n_Gas\\","HSF_input_PBCS_set1_Budget_DataFile_Apr16_multiRow.csv");
        //        executeJob("IMPORT_DATA", "DataLoad_test1","{\"importFileName\":\"HSF_input_PBCS_set1_Budget_DataFile_Apr16_multiRow.csv\"}");

        //        deleteFile("HSF_input_PBCS_set1_Budget_DataFile_Apr16.csv");
        //        deleteFile("HSF_input_PBCS_set1_Budget_DataFile_Apr16_multiRow.csv");
        //        deleteFile("HSF_input_PBCS_set1_Budget_DataFile_Apr16_TEST_PBASU.csv");
        //
        //        deleteFile("HSF_input_PBCS_set1_Budget_DataFile_timestamp.txt");
        //        deleteFile("HSF_input_PBCS_set1_Budget_testDataFile_FY16-test.txt");
        //        deleteFile("HSF_input_PBCS_set1_Budget_testDataFile_FY16.txt");

        //        deleteFile("HSF_input_PBCS_set1_Budget_testDataFile_FY16.txt");
        //        uploadFile("D:\\ISA\\Oil_n_Gas\\","HSF_input_PBCS_set1_Budget_testDataFile_FY16.txt");
        //        executeJob("IMPORT_DATA", "DataLoadTest","{\"importFileName\":\"HSF_input_PBCS_set1_Budget_testDataFile_FY16.txt\"}");

        //        deleteFile("HSF_input_PBCS_Budget_DataFile_160714100343._2328225.txt");
        //        uploadFile("D:\\ISA\\Oil_n_Gas\\PROD_Data_Files\\","HSF_input_PBCS_Budget_DataFile_160714100343._2328225.txt");
        //        System.out.println("starting import ");
        //        executeJob("IMPORT_DATA", "DataLoadTest","{\"importFileName\":\"HSF_input_PBCS_Budget_DataFile_160714100343._2328225.txt\"}");

        deleteFile("TotalEntityDataTestPayload.txt");
        uploadFile("D:\\ISA\\Oil_n_Gas\\", "TotalEntityDataTestPayload.txt");
        executeJob("IMPORT_DATA", "DataLoadTest", "{\"importFileName\":\"TotalEntityDataTestPayload.txt\"}");


    }

    // BEGIN - Methods that invoke REST API
    //
    //
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

    private String executeRequest(String urlString, String requestMethod, String payload,
                                  String contentType) throws Exception {
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

                return getStringFromInputStream(connection.getInputStream());
            }
            throw new Exception("Http status code: " + status);
        } finally {
            if (connection != null)
                connection.disconnect();
        }
    }

    private void getJobStatus(String pingUrlString, String methodType) throws Exception {
        boolean completed = false;
        while (!completed) {
            System.out.println("PingURLString : " + pingUrlString);
            String pingResponse = executeRequest(pingUrlString, methodType, null, "application/x-www-form-urlencoded");
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
                    System.out.println("Error occurred: " + json.getString("details"));

                    if (!(json.getString("details").contains("error"))) {
                        System.out.println("Error occurred: " + json.getString("details"));
                    } else {
                        throw new Exception(json.getString("details"));
                    }
                    //throw new Exception("Error occurred: " + json.getString("details"));
                } else {
                    System.out.println("Completed");
                }
                completed = true;
            }
        }
    }

    public String fetchPingUrlFromResponse(String response, String retValue) throws Exception {
        String pingUrlString = null;
        JSONObject jsonObj = new JSONObject(response);
        int resStatus = jsonObj.getInt("status");
        System.out.println("JOB ID : " + jsonObj.getInt("jobId"));
        System.out.println("JOB STATUS : " + jsonObj.getInt("status"));
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

    //
    // BEGIN - Delete a file in PBCS
    //
    public void deleteFile(String fileName) throws Exception {
        String urlString =
            String.format("%s/interop/rest/%s/applicationsnapshots/%s", serverUrl, "11.1.2.3.600",
                          fileName); //ApiVerion hardcoded as version: v3 doesn't work for delete and upload
        System.out.println("url string for delete : " + urlString);
        String response = executeRequest(urlString, "DELETE", null, "application/x-wwwform-urlencoded");
        JSONObject json = new JSONObject(response);
        int resStatus = json.getInt("status");
        if (resStatus == 0)
            System.out.println("File deleted successfully");
        else
            System.out.println("Error deleting file : " + json.getString("details"));
    }
    //
    // END - Delete a file in PBCS
    //

    // BEGIN - Upload a file to PBCS
    //
    public void uploadFile(String filePath, String fileName) throws Exception {
        final int DEFAULT_CHUNK_SIZE = 50 * 1024 * 1024;
        InputStream fis = null;
        byte[] lastChunk = null;
        long totalFileSize = new File(filePath + fileName).length(), totalbytesRead = 0;
        boolean isLast = false, status = true;
        Boolean isFirst = true;
        int packetNo = 1, lastPacketNo = (int) (Math.ceil(totalFileSize / (double) DEFAULT_CHUNK_SIZE));
        try {
            fis = new BufferedInputStream(new FileInputStream(filePath + fileName));
            while (totalbytesRead < totalFileSize && status) {
                int nextChunkSize = (int) Math.min(DEFAULT_CHUNK_SIZE, totalFileSize - totalbytesRead);
                if (lastChunk == null) {
                    lastChunk = new byte[nextChunkSize];
                    totalbytesRead += fis.read(lastChunk);
                    if (packetNo == lastPacketNo)
                        isLast = true;
                    status = sendFileContents(isFirst, isLast, lastChunk, fileName);
                    isFirst = false;
                    packetNo = packetNo + 1;
                    lastChunk = null;
                }
            }
            System.out.println("Uploaded successfully");
        } finally {
            if (fis != null)
                fis.close();
        }
    }

    private boolean sendFileContents(Boolean isFirst, boolean isLast, byte[] lastChunk,
                                     String fileName) throws Exception {
        HttpURLConnection connection = null;
        try {
            URL url =
                new URL(String.format("%s/interop/rest/%s/applicationsnapshots/%s/contents?q={chunkSize:%d,isFirst:%b,isLast:%b}",
                                      serverUrl, "11.1.2.3.600", fileName, lastChunk.length, isFirst,
                                      isLast)); //ApiVerion hardcoded as version: v3 doesn't work for delete and upload
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
            System.out.println("Status code  : " + statusCode);
            if (statusCode == 200 && status != null) {
                int commandStatus = getCommandStatus(status);
                if (commandStatus == 0) {
                    isFirst = false;
                    return true;
                } else if (commandStatus == -1 && isLast) {
                    String pingUrlString = fetchPingUrlFromResponse(status, "Job Status");
                    System.out.println("Original Ping URL : " + pingUrlString);
                    pingUrlString = serverUrl + pingUrlString.substring(pingUrlString.indexOf("/HyperionPlanning"));
                    System.out.println("Modified Ping URL : " + pingUrlString);
                    getJobStatus(pingUrlString, "GET");
                }
            }
            return false;
        } finally {
            if (connection != null)
                connection.disconnect();
        }
    }

    public int getCommandStatus(String response) throws Exception {
        JSONObject json = new JSONObject(response);
        if (!JSONObject.NULL.equals(json.get("status"))) {
            System.err.println(json.getInt("status"));
            return json.getInt("status");
        } else
            return Integer.MIN_VALUE;
    }

    //
    // BEGIN - Execute a Job (EXPORT_DATA, EXPORT_METADATA, IMPORT_DATA, IMPORT_METADATA,CUBE_REFRESH, ...)
    //
    public void executeJob(String jobType, String jobName,
                           String parameters) throws Exception {
        // String urlString = String.format("%s/HyperionPlanning/rest/%s/applications/%s/jobs", serverUrl, apiVersion, applicationName);
        String urlString =
            String.format("%s/HyperionPlanning/rest/%s/applications/%s/jobs", serverUrl, apiVersion, applicationName);
        JSONObject payload = new JSONObject();
        payload.put("jobName", jobName);
        payload.put("jobType", jobType);
        payload.put("parameters", new JSONObject(parameters));
        System.out.println("Job URL : " + urlString);
        String response = executeRequest(urlString, "POST", payload.toString(), "application/json");
        System.out.println("Job started successfully");
        String pingUrlString = fetchPingUrlFromResponse(response, "self");
        System.out.println("Original Ping URL : " + pingUrlString);
        pingUrlString = serverUrl + pingUrlString.substring(pingUrlString.indexOf("/HyperionPlanning"));
        System.out.println("Modified Ping URL : " + pingUrlString);
        getJobStatus(pingUrlString, "GET");
    }
    //
    // END - Execute a Job (EXPORT_DATA, EXPORT_METADATA, IMPORT_DATA, IMPORT_METADATACUBE_REFRESH, ...)
    //
}
