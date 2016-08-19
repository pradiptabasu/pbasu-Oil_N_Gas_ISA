package com.pradipta.hsf.console;

import com.hyperion.hsf.common.DataCellInfo;

import java.util.Date;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("unused")
public class TestJavaAPICustom {
    static Vector<String> servers = null;
    static Vector<String> databases = null;
    static Vector<String> entities = null;

    String hostName = "oa8049.us.oracle.com";
    //String hostName = "oa8050.us.oracle.com";
    String portNumber = "12000";
    String userName = "greg";
    //String userName = "admin";
    String password = "Welcome1";
    String server = "HSFServer";
    //String database = "Oil_n_Gas";
    String database = "Oil_and_Gas_Production";
    //String entity = "Oil_n_Gas";
    String entity = "OnG_Consolidated_Monthly";

    public static void main(String[] args) {
        TestJavaAPICustom javaAPI = new TestJavaAPICustom();
        System.out.println("Running HSF Java APIs using the following parameters...");
        System.out.println("Host Name = " + javaAPI.hostName);
        System.out.println("Port Number = " + javaAPI.portNumber);
        System.out.println("User Name = " + javaAPI.userName);
        System.out.println("Password = " + javaAPI.password);
        javaAPI.Run(javaAPI.hostName, javaAPI.portNumber, javaAPI.userName, javaAPI.password);
    }

    public void Run(String hostName, String portNumber, String userName, String password) {
        boolean loggedIn = true;
        HSFJavaAPIConnector_custom connector = new HSFJavaAPIConnector_custom(hostName, portNumber);
        try {
            System.out.println("Calling Login().....");
            if (connector.Login(userName, password, "")) {
                System.out.println("Login Succeeded");
            } else {
                System.out.println("Login Failed");
                loggedIn = false;
                return;
            }
            System.out.println("Calling OpenServer() on " + server);
            if (connector.OpenServer(server)) {
                System.out.println("OpenServer Succeeded");
            } else {
                System.out.println("OpenServer Failed");
            }
            System.out.println("Calling OpenDatabase() on " + database);
            if (connector.OpenDatabase(database)) {
                System.out.println("OpenDatabase Succeeded");
            } else {
                System.out.println("OpenDatabase Failed");
                return;
            }

            System.out.println("Calling OpenEntity() on " + entity);
            if (connector.OpenEntity(entity, Boolean.valueOf(true))) {
                System.out.println("OpenEntity Succeeded");
            } else {
                System.out.println("OpenEntity Failed");
            }

            //            System.out.println("Calling EnumerateAccounts()......");


            //            Vector<Account> accounts = connector.EnumerateAccounts(entity);
            //            if ((accounts != null) && (accounts.size() > 0)) {
            //                System.out.println("EnumerateAccounts returned " + accounts.size() + " accounts");
            //                System.out.println("You need to navigate through each vector to print account details.");
            //            } else {
            //                System.out.println("There are no Accounts under " + entity);
            //            }


            System.out.println("Calling EnumerateScenarios()......");
            Vector<String> scenarios = connector.EnumerateScenarios(entity);
            if ((scenarios != null) && (scenarios.size() > 0)) {
                System.out.println("EnumerateScenarios returned " + scenarios.size() + " Scenarios");
                for (String scn : scenarios) {
                    System.out.println("\t" + scn);
                }
            } else {
                System.out.println("There are no Scenarios under " + entity);
            }


            System.out.println("Calling EnumerateTimePeriods()......");
            Vector<String> timePeriods = connector.EnumerateTimePeriods(entity);
            if ((timePeriods != null) && (timePeriods.size() > 0)) {
                System.out.println("EnumerateTimePeriods returned " + timePeriods.size() + " Time Periods");
                for (String tp : timePeriods) {
                    System.out.println("\t" + tp);
                }
            } else {
                System.out.println("There are no Time Periods under " + entity);
            }


            System.out.println("Calling GetEntityLockInfo() on " + entity);
            String lockInfo = connector.GetEntityLockInfo(entity);
            if (!lockInfo.isEmpty()) {
                System.out.println("GetEntityLockInfo returned " + lockInfo);
            }


            System.out.println("Calling GetEntityDataCells()......");
            String account = "1000.00.010";
            String time = "Jan16";
            String scenario = "Baseline";
            String measure = "Output";
            String value = connector.GetEntityDataCells(entity, account, time, scenario, measure);
            System.out.println("value " + value);
            //            connector.GetEntityDataCellsMultiple("Oil_n_Gas", account, time, scenario, measure);

            //            if (!value.isEmpty()) {
            //                System.out.println("GetEntityDataCells for \n\tAccount = " + account + "\n\tTime = " + time +
            //                                   "\n\tScenario = " + scenario + "\n\tmeasure = " + measure + " is " + value);
            //            } else {
            //                System.out.println("GetEntityDataCells is empty");
            //            }

            //            Date date = new Date();
            //            System.out.println("Start time 1 thread :  " + date.toString());
            //            for (int i = 0; i < 30; i++) {
            //                for (int j = 0; j < 12; j++) {
            //                    account = "100.00.000";
            //                    time = "2015";
            //                    scenario = "Base";
            //                    measure = "Input";
            //                    value = connector.GetEntityDataCells("Oil_n_Gas", account, time, scenario, measure);
            //                }
            //                date = new Date();
            //                System.out.println("End year 1 thread :  " + date.toString());
            //            }
            //            date = new Date();
            //            System.out.println("End time 1 thread :  " + date.toString());
            //
            //
            //            date = new Date();
            //            System.out.println("Start time 5 thread :  " + date.toString());
            //            ExecutorService executor = Executors.newFixedThreadPool(5);
            //            for (int i = 0; i < 30; i++) {
            //                for (int j = 0; j < 12; j++) {
            //                    account = "100.00.000";
            //                    time = "2015";
            //                    scenario = "Base";
            //                    measure = "Input";
            //                    value = connector.GetEntityDataCells("Oil_n_Gas", account, time, scenario, measure);
            //                    getEntityDataExecutorThread worker =
            //                        new getEntityDataExecutorThread(connector, account, time, scenario, measure);
            //                    executor.execute(worker);
            //                }
            //            }
            //            executor.shutdown();
            //            while (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
            //            }
            //            date = new Date();
            //            System.out.println("End time 5 thread :  " + date.toString());
            //
            //
            //            date = new Date();
            //            System.out.println("Start time 10 thread :  " + date.toString());
            //            executor = Executors.newFixedThreadPool(10);
            //            for (int i = 0; i < 30; i++) {
            //                for (int j = 0; j < 12; j++) {
            //                    account = "100.00.000";
            //                    time = "2015";
            //                    scenario = "Base";
            //                    measure = "Input";
            //                    value = connector.GetEntityDataCells("Oil_n_Gas", account, time, scenario, measure);
            //                    getEntityDataExecutorThread worker =
            //                        new getEntityDataExecutorThread(connector, account, time, scenario, measure);
            //                    executor.execute(worker);
            //                }
            //            }
            //            executor.shutdown();
            //            while (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
            //            }
            //            date = new Date();
            //            System.out.println("End time 10 thread :  " + date.toString());


            //            value = "11289";
            //            DataCellInfo[] dataCellArr = new DataCellInfo[4];
            //            dataCellArr[0] = new DataCellInfo("100.00.000", "2015", "Base", "Input", value);
            //            dataCellArr[1] = new DataCellInfo("315.00.000", "2016", "Base", "Input", "11389");
            //            dataCellArr[2] = new DataCellInfo("320.00.000", "2017", "Base", "Input", "11489");
            //            dataCellArr[3] = new DataCellInfo("325.00.000", "2018", "Base", "Input", "11589");
            //
            //            System.out.println("Calling SetEntityDataCells().....");
            //            if (connector.SetEntityDataCells(entity, dataCellArr)) {
            //                System.out.println("SetEntityDataCells Succeeded");
            //            } else {
            //                System.out.println("SetEntityDataCells Failed");
            //            }
            //
            //
            //            System.out.println("Verifying the value set by SetEntityDataCells....");
            //
            //            String newValue = connector.GetEntityDataCells(entity, account, time, scenario, measure);
            //            if ((!newValue.isEmpty()) && (newValue.equalsIgnoreCase(value))) {
            //                System.out.println("Verification Successful.");
            //            } else {
            //                System.out.println("Verification Failed.");
            //            }
            //            value = connector.GetEntityDataCells(entity, "315.00.000", time, scenario, measure);
            //            if (!value.isEmpty()) {
            //                System.out.println("GetEntityDataCells for Account 315.00.000 = " + value);
            //            }
            //            value = connector.GetEntityDataCells(entity, "320.00.000", time, scenario, measure);
            //            if (!value.isEmpty()) {
            //                System.out.println("GetEntityDataCells for Account 320.00.000 = " + value);
            //            }
            //            value = connector.GetEntityDataCells(entity, "325.00.000", time, scenario, measure);
            //            if (!value.isEmpty()) {
            //                System.out.println("GetEntityDataCells for Account 325.00.000 = " + value);
            //            }


            //			System.out.println("Calling CloseEntity()......");
            //			if (connector.CloseEntity(entity, Boolean.valueOf(true), Boolean.valueOf(true))) {
            //				System.out.porintln("CloseEntity Succeeded");
            //			} else {
            //				System.out.println("CloseEntity Failed");
            //			}


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (loggedIn) {
                System.out.println("Calling Logout().........");
                try {
                    if (connector.Logout()) {
                        System.out.println("Logout Succeeded");
                    } else {
                        System.out.println("Logout Failed");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
