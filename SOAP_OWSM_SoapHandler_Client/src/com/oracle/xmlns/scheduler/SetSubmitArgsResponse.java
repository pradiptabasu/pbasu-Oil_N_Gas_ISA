
package com.oracle.xmlns.scheduler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.scheduler.types.RequestParameters;


/**
 * <p>Java class for setSubmitArgsResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="setSubmitArgsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestParametersReturn" type="{http://xmlns.oracle.com/scheduler/types}requestParameters"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSubmitArgsResponse", propOrder = { "requestParametersReturn" })
public class SetSubmitArgsResponse {

    @XmlElement(namespace = "", required = true)
    protected RequestParameters requestParametersReturn;

    /**
     * Gets the value of the requestParametersReturn property.
     *
     * @return
     *     possible object is
     *     {@link RequestParameters }
     *
     */
    public RequestParameters getRequestParametersReturn() {
        return requestParametersReturn;
    }

    /**
     * Sets the value of the requestParametersReturn property.
     *
     * @param value
     *     allowed object is
     *     {@link RequestParameters }
     *
     */
    public void setRequestParametersReturn(RequestParameters value) {
        this.requestParametersReturn = value;
    }

}
