
package com.oracle.xmlns.scheduler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.scheduler.types.NlsOptions;
import com.oracle.xmlns.scheduler.types.RequestParameters;


/**
 * <p>Java class for setNLSOptions complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="setNLSOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestParameters" type="{http://xmlns.oracle.com/scheduler/types}requestParameters" form="qualified"/>
 *         &lt;element name="nlsOptions" type="{http://xmlns.oracle.com/scheduler/types}nlsOptions" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setNLSOptions", propOrder = { "requestParameters", "nlsOptions" })
public class SetNLSOptions {

    @XmlElement(required = true)
    protected RequestParameters requestParameters;
    @XmlElement(required = true)
    protected NlsOptions nlsOptions;

    /**
     * Gets the value of the requestParameters property.
     *
     * @return
     *     possible object is
     *     {@link RequestParameters }
     *
     */
    public RequestParameters getRequestParameters() {
        return requestParameters;
    }

    /**
     * Sets the value of the requestParameters property.
     *
     * @param value
     *     allowed object is
     *     {@link RequestParameters }
     *
     */
    public void setRequestParameters(RequestParameters value) {
        this.requestParameters = value;
    }

    /**
     * Gets the value of the nlsOptions property.
     *
     * @return
     *     possible object is
     *     {@link NlsOptions }
     *
     */
    public NlsOptions getNlsOptions() {
        return nlsOptions;
    }

    /**
     * Sets the value of the nlsOptions property.
     *
     * @param value
     *     allowed object is
     *     {@link NlsOptions }
     *
     */
    public void setNlsOptions(NlsOptions value) {
        this.nlsOptions = value;
    }

}
