
package com.oracle.xmlns.scheduler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRequestExecutionContext complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getRequestExecutionContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestExecutionContext" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRequestExecutionContext", propOrder = { "requestExecutionContext" })
public class GetRequestExecutionContext {

    @XmlElement(required = true)
    protected String requestExecutionContext;

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

}
