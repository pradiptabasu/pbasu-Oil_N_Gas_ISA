
package com.oracle.xmlns.scheduler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.scheduler.types.AsyncStatus;


/**
 * <p>Java class for setAsyncRequestStatus complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="setAsyncRequestStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestExecutionContext" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="status" type="{http://xmlns.oracle.com/scheduler/types}asyncStatus" form="qualified"/>
 *         &lt;element name="statusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setAsyncRequestStatus", propOrder = { "requestExecutionContext", "status", "statusMessage" })
public class SetAsyncRequestStatus {

    @XmlElement(required = true)
    protected String requestExecutionContext;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AsyncStatus status;
    protected String statusMessage;

    /**
     * Gets the value of the requestExecutionContext property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestExecutionContext() {
        return requestExecutionContext;
    }

    /**
     * Sets the value of the requestExecutionContext property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestExecutionContext(String value) {
        this.requestExecutionContext = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link AsyncStatus }
     *
     */
    public AsyncStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link AsyncStatus }
     *
     */
    public void setStatus(AsyncStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusMessage property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

}
