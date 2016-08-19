
package com.pradipta.hsf.customwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "faultString", "faultCode", "faultDetail" })
@XmlRootElement(name = "getEntityDataCellsFault")
public class GetEntityDataCellsFault {

    @XmlElement(required = true)
    protected String faultString;
    @XmlElement(required = true)
    protected String faultCode;
    @XmlElement(required = true)
    protected String faultDetail;

    /**
     * Gets the value of the faultString property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFaultString() {
        return faultString;
    }

    /**
     * Sets the value of the faultString property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFaultString(String value) {
        this.faultString = value;
    }

    /**
     * Gets the value of the faultCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFaultCode() {
        return faultCode;
    }

    /**
     * Sets the value of the faultCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFaultCode(String value) {
        this.faultCode = value;
    }

    /**
     * Gets the value of the faultDetail property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFaultDetail() {
        return faultDetail;
    }

    /**
     * Sets the value of the faultDetail property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFaultDetail(String value) {
        this.faultDetail = value;
    }

}
