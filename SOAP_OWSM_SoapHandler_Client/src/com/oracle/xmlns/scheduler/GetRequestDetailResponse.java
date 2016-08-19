
package com.oracle.xmlns.scheduler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.scheduler.types.RequestDetail;


/**
 * <p>Java class for getRequestDetailResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getRequestDetailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestDetail" type="{http://xmlns.oracle.com/scheduler/types}requestDetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRequestDetailResponse", propOrder = { "requestDetail" })
public class GetRequestDetailResponse {

    @XmlElement(namespace = "", required = true)
    protected RequestDetail requestDetail;

    /**
     * Gets the value of the requestDetail property.
     *
     * @return
     *     possible object is
     *     {@link RequestDetail }
     *
     */
    public RequestDetail getRequestDetail() {
        return requestDetail;
    }

    /**
     * Sets the value of the requestDetail property.
     *
     * @param value
     *     allowed object is
     *     {@link RequestDetail }
     *
     */
    public void setRequestDetail(RequestDetail value) {
        this.requestDetail = value;
    }

}
