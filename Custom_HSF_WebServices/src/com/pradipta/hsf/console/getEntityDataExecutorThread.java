package com.pradipta.hsf.console;

import com.hyperion.hsf.excp.HSFException;

public class getEntityDataExecutorThread implements Runnable {
    HSFJavaAPIConnector_custom connector;
    String account = "100.00.000";
    String time = "2015";
    String scenario = "Base";
    String measure = "Input";
    
    public getEntityDataExecutorThread() {
        super();
    }

    public getEntityDataExecutorThread(HSFJavaAPIConnector_custom connector, String account, String time,
                                       String scenario, String measure) {
        super();
        this.connector = connector;
        this.account = account;
        this.time = time;
        this.scenario = scenario;
        this.measure = measure;
    }

    @Override
    public void run() {
        // TODO Implement this method
        try {
            String value = connector.GetEntityDataCells("Oil_n_Gas", account, time, scenario, measure);
        } catch (HSFException e) {
        }
    }
}
