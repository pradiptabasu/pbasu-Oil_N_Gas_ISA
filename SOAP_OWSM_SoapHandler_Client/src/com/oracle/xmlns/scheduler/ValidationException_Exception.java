
package com.oracle.xmlns.scheduler;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140319.1121
 * Generated source version: 2.2
 *
 */
@WebFault(name = "ValidationException", targetNamespace = "http://xmlns.oracle.com/scheduler")
public class ValidationException_Exception extends Exception {

    /**
     * Java type that goes as soapenv:Fault detail element.
     *
     */
    private ValidationException faultInfo;

    /**
     *
     * @param message
     * @param faultInfo
     */
    public ValidationException_Exception(String message, ValidationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ValidationException_Exception(String message, ValidationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @return
     *     returns fault bean: com.oracle.xmlns.scheduler.ValidationException
     */
    public ValidationException getFaultInfo() {
        return faultInfo;
    }

}
