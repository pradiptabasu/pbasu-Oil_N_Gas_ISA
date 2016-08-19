package com.pradipta.hsf.customwebservices;

import com.hyperion.hsf.client.javaAPI.HSFJavaAPIConnector;
import java.util.List;
import javax.jws.WebService;

@WebService(serviceName = "CustomHSFWebService", targetNamespace = "http://pradipta.com/hsf/customwebservices/",
            portName = "HSFWebServiceSoap11",
            endpointInterface = "com.pradipta.hsf.customwebservices.CustomHSFWebService",
            wsdlLocation = "/WEB-INF/wsdl/CustomHSFWebServices.wsdl")
public class CustomHSFWebServiceImpl {
    public CustomHSFWebServiceImpl() {
    }

    public GetEntityDataCellsResponse getEntityDataCells(GetEntityDataCellsRequest request) throws GetEntityDataCellsFault_Exception {
        GetEntityDataCellsResponse response = new GetEntityDataCellsResponse();
        List<GetEntityDataCellsResponse.DataCell> dataCellList = response.getDataCell();
        GetEntityDataCellsResponse.DataCell dataCell = new GetEntityDataCellsResponse.DataCell();
        
        String cellValue = null;
        HSFJavaAPIConnector connector = new HSFJavaAPIConnector(request.getHSFConnectParameters().getHostname(), request.getHSFConnectParameters().getPort());
        try {
            if (connector.Login(request.getHSFConnectParameters().getUsername(), request.getHSFConnectParameters().getPassword(), ""))  {
                if (connector.OpenServer(request.getHSFConnectParameters().getServer())) {
                    if (connector.OpenDatabase(request.getHSFConnectParameters().getDatabase())) {
                          if (connector.OpenEntity(request.getHSFConnectParameters().getEntity(), Boolean.valueOf(false))) {
                            List<String> accountList = request.getHSFFetchParameters().getListOfAccounts().getAccountNumber();
                            List<String> timeList = request.getHSFFetchParameters().getListOfTime().getTime();
            
                            for (String accountNumber : accountList) {
                                for(String time : timeList) {
                                    cellValue = connector.GetEntityDataCells(request.getHSFConnectParameters().getEntity(), accountNumber, time, request.getHSFFetchParameters().getScenario(), request.getHSFFetchParameters().getMeasure());
                                    dataCell = new GetEntityDataCellsResponse.DataCell();
                                    dataCell.setAccountNumber(accountNumber);
                                    dataCell.setMeasure(request.getHSFFetchParameters().getScenario());
                                    dataCell.setScenario(request.getHSFFetchParameters().getMeasure());
                                    dataCell.setTime(time);
                                    dataCell.setValue(cellValue);
                                    dataCellList.add(dataCell);
                                }
                            }
                            //2nd param ---> false ---> check-In set to false
                            //3rd param ---> true ---> release lock set to true
                            connector.CloseEntity(request.getHSFConnectParameters().getEntity(), false, true);
                        }
                        connector.CloseDatabase();
                    }
                    connector.CloseServer();
                }
                connector.Logout();
            }
            return response;
        } catch (Exception e) 
        {
            GetEntityDataCellsFault fault = new GetEntityDataCellsFault();
            fault.setFaultCode("401");
            fault.setFaultDetail(e.getStackTrace().toString());
            fault.setFaultString(e.getMessage());
            throw new GetEntityDataCellsFault_Exception("not able to fetch EntityDataCells",fault);
        }
    }
}
