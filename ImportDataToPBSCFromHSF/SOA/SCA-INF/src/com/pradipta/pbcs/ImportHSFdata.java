package com.pradipta.pbcs;

public interface ImportHSFdata {
    String deleteFile(String userName, String password, String serverUrl, String apiVersion, String applicationName,
                      String fileName, String instanceId, String log4jLevel,
                      String log4jLogFileLocation) throws Exception; // Delete the file before loading it

    String uploadFile(String userName, String password, String serverUrl, String apiVersion, String applicationName,
                      String filePath, String fileName, String instanceId, String log4jLevel,
                      String log4jLogFileLocation) throws Exception; // Upload HSF data file for import to PBCS

    String executeJob(String userName, String password, String serverUrl, String apiVersion, String applicationName,
                      String jobType, String jobName, String fileName, String instanceId, String log4jLevel,
                      String log4jLogFileLocation) throws Exception;
    
    String moveFile(String filePath, String fileName, String status, String instanceId, String log4jLevel,
                             String log4jLogFileLocation) throws Exception;
}
