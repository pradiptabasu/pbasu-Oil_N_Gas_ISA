
package com.pradipta.hsf.customwebservices;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.pradipta.hsf.customwebservices package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pradipta.hsf.customwebservices
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEntityDataCellsRequest }
     *
     */
    public GetEntityDataCellsRequest createGetEntityDataCellsRequest() {
        return new GetEntityDataCellsRequest();
    }

    /**
     * Create an instance of {@link GetEntityDataCellsResponse }
     *
     */
    public GetEntityDataCellsResponse createGetEntityDataCellsResponse() {
        return new GetEntityDataCellsResponse();
    }

    /**
     * Create an instance of {@link GetEntityDataCellsRequest.HSFFetchParameters }
     *
     */
    public GetEntityDataCellsRequest.HSFFetchParameters createGetEntityDataCellsRequestHSFFetchParameters() {
        return new GetEntityDataCellsRequest.HSFFetchParameters();
    }

    /**
     * Create an instance of {@link GetEntityDataCellsFault }
     *
     */
    public GetEntityDataCellsFault createGetEntityDataCellsFault() {
        return new GetEntityDataCellsFault();
    }

    /**
     * Create an instance of {@link GetEntityDataCellsRequest.HSFConnectParameters }
     *
     */
    public GetEntityDataCellsRequest.HSFConnectParameters createGetEntityDataCellsRequestHSFConnectParameters() {
        return new GetEntityDataCellsRequest.HSFConnectParameters();
    }

    /**
     * Create an instance of {@link GetEntityDataCellsResponse.DataCell }
     *
     */
    public GetEntityDataCellsResponse.DataCell createGetEntityDataCellsResponseDataCell() {
        return new GetEntityDataCellsResponse.DataCell();
    }

    /**
     * Create an instance of {@link GetEntityDataCellsRequest.HSFFetchParameters.ListOfTime }
     *
     */
    public GetEntityDataCellsRequest.HSFFetchParameters.ListOfTime createGetEntityDataCellsRequestHSFFetchParametersListOfTime() {
        return new GetEntityDataCellsRequest.HSFFetchParameters.ListOfTime();
    }

    /**
     * Create an instance of {@link GetEntityDataCellsRequest.HSFFetchParameters.ListOfAccounts }
     *
     */
    public GetEntityDataCellsRequest.HSFFetchParameters.ListOfAccounts createGetEntityDataCellsRequestHSFFetchParametersListOfAccounts() {
        return new GetEntityDataCellsRequest.HSFFetchParameters.ListOfAccounts();
    }

}
