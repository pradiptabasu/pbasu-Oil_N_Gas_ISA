
package com.oracle.xmlns.scheduler.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestExecutionContext complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="requestExecutionContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="requestHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pausedState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resumed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestExecutionContext", propOrder = { "requestId", "requestHandle", "pausedState", "resumed" })
public class RequestExecutionContext {

    protected long requestId;
    @XmlElement(required = true)
    protected String requestHandle;
    @XmlElement(required = true)
    protected String pausedState;
    protected boolean resumed;

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
     * Gets the value of the requestHandle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestHandle() {
        return requestHandle;
    }

    /**
     * Sets the value of the requestHandle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestHandle(String value) {
        this.requestHandle = value;
    }

    /**
     * Gets the value of the pausedState property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPausedState() {
        return pausedState;
    }

    /**
     * Sets the value of the pausedState property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPausedState(String value) {
        this.pausedState = value;
    }

    /**
     * Gets the value of the resumed property.
     *
     */
    public boolean isResumed() {
        return resumed;
    }

    /**
     * Sets the value of the resumed property.
     *
     */
    public void setResumed(boolean value) {
        this.resumed = value;
    }

}
