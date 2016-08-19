
package com.oracle.xmlns.scheduler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.scheduler.types.RequestExecutionContext;


/**
 * <p>Java class for getRequestExecutionContextResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getRequestExecutionContextResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestExecutionContext" type="{http://xmlns.oracle.com/scheduler/types}requestExecutionContext"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRequestExecutionContextResponse", propOrder = { "requestExecutionContext" })
public class GetRequestExecutionContextResponse {

    @XmlElement(namespace = "", required = true)
    protected RequestExecutionContext requestExecutionContext;

    /**
     * Gets the value of the requestExecutionContext property.
     *
     * @return
     *     possible object is
     *     {@link RequestExecutionContext }
     *
     */
    public RequestExecutionContext getRequestExecutionContext() {
        return requestExecutionContext;
    }

    /**
     * Sets the value of the requestExecutionContext property.
     *
     * @param value
     *     allowed object is
     *     {@link RequestExecutionContext }
     *
     */
    public void setRequestExecutionContext(RequestExecutionContext value) {
        this.requestExecutionContext = value;
    }

}
