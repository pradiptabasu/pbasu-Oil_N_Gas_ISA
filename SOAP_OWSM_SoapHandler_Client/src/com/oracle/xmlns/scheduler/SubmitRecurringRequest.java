
package com.oracle.xmlns.scheduler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.oracle.xmlns.scheduler.types.MetadataObjectId;
import com.oracle.xmlns.scheduler.types.RequestParameters;


/**
 * <p>Java class for submitRecurringRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="submitRecurringRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="jobDefinitionId" type="{http://xmlns.oracle.com/scheduler/types}metadataObjectId" form="qualified"/>
 *         &lt;element name="scheduleId" type="{http://xmlns.oracle.com/scheduler/types}metadataObjectId" form="qualified"/>
 *         &lt;element name="triggerId" type="{http://xmlns.oracle.com/scheduler/types}metadataObjectId" form="qualified"/>
 *         &lt;element name="application" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="requestedStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/>
 *         &lt;element name="requestedEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/>
 *         &lt;element name="requestParameters" type="{http://xmlns.oracle.com/scheduler/types}requestParameters" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitRecurringRequest", propOrder = {
         "description", "jobDefinitionId", "scheduleId", "triggerId", "application", "requestedStartTime",
         "requestedEndTime", "requestParameters"
    })
public class SubmitRecurringRequest {

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected MetadataObjectId jobDefinitionId;
    @XmlElement(required = true)
    protected MetadataObjectId scheduleId;
    @XmlElement(required = true)
    protected MetadataObjectId triggerId;
    @XmlElement(required = true)
    protected String application;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedStartTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedEndTime;
    @XmlElement(required = true)
    protected RequestParameters requestParameters;

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the jobDefinitionId property.
     *
     * @return
     *     possible object is
     *     {@link MetadataObjectId }
     *
     */
    public MetadataObjectId getJobDefinitionId() {
        return jobDefinitionId;
    }

    /**
     * Sets the value of the jobDefinitionId property.
     *
     * @param value
     *     allowed object is
     *     {@link MetadataObjectId }
     *
     */
    public void setJobDefinitionId(MetadataObjectId value) {
        this.jobDefinitionId = value;
    }

    /**
     * Gets the value of the scheduleId property.
     *
     * @return
     *     possible object is
     *     {@link MetadataObjectId }
     *
     */
    public MetadataObjectId getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     *
     * @param value
     *     allowed object is
     *     {@link MetadataObjectId }
     *
     */
    public void setScheduleId(MetadataObjectId value) {
        this.scheduleId = value;
    }

    /**
     * Gets the value of the triggerId property.
     *
     * @return
     *     possible object is
     *     {@link MetadataObjectId }
     *
     */
    public MetadataObjectId getTriggerId() {
        return triggerId;
    }

    /**
     * Sets the value of the triggerId property.
     *
     * @param value
     *     allowed object is
     *     {@link MetadataObjectId }
     *
     */
    public void setTriggerId(MetadataObjectId value) {
        this.triggerId = value;
    }

    /**
     * Gets the value of the application property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the requestedStartTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getRequestedStartTime() {
        return requestedStartTime;
    }

    /**
     * Sets the value of the requestedStartTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setRequestedStartTime(XMLGregorianCalendar value) {
        this.requestedStartTime = value;
    }

    /**
     * Gets the value of the requestedEndTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getRequestedEndTime() {
        return requestedEndTime;
    }

    /**
     * Sets the value of the requestedEndTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setRequestedEndTime(XMLGregorianCalendar value) {
        this.requestedEndTime = value;
    }

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

}
