
package com.oracle.xmlns.scheduler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.scheduler.types.State;


/**
 * <p>Java class for onJobCompletion complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="onJobCompletion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="state" type="{http://xmlns.oracle.com/scheduler/types}state" minOccurs="0"/>
 *         &lt;element name="resultMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "onJobCompletion", propOrder = { "requestId", "state", "resultMessage" })
public class OnJobCompletion {

    @XmlElement(namespace = "")
    protected long requestId;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "string")
    protected State state;
    @XmlElement(namespace = "", required = true)
    protected String resultMessage;

    /**
     * Gets the value of the requestId property.
     *
     */
    public long getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     *
     */
    public void setRequestId(long value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return
     *     possible object is
     *     {@link State }
     *
     */
    public State getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link State }
     *
     */
    public void setState(State value) {
        this.state = value;
    }

    /**
     * Gets the value of the resultMessage property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultMessage() {
        return resultMessage;
    }

    /**
     * Sets the value of the resultMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultMessage(String value) {
        this.resultMessage = value;
    }

}
