
package com.oracle.xmlns.scheduler.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for requestDetail complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="requestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="actualStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="cause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="dispatcherNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="expirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="isCancellable" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *         &lt;element name="isHoldable" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *         &lt;element name="jobDefinitionId" type="{http://xmlns.oracle.com/scheduler/types}metadataObjectId" minOccurs="0" form="qualified"/>
 *         &lt;element name="parentRequestId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *         &lt;element name="processorNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *         &lt;element name="requestParameters" type="{http://xmlns.oracle.com/scheduler/types}requestParameters" minOccurs="0" form="qualified"/>
 *         &lt;element name="requestedEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="requestedStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="retried" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *         &lt;element name="scheduleId" type="{http://xmlns.oracle.com/scheduler/types}metadataObjectId" minOccurs="0" form="qualified"/>
 *         &lt;element name="scheduledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="state" type="{http://xmlns.oracle.com/scheduler/types}state" minOccurs="0" form="qualified"/>
 *         &lt;element name="errorType" type="{http://xmlns.oracle.com/scheduler/types}errorType" minOccurs="0" form="qualified"/>
 *         &lt;element name="stepId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="submissionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="submitter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="runAsUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="triggerId" type="{http://xmlns.oracle.com/scheduler/types}metadataObjectId" minOccurs="0" form="qualified"/>
 *         &lt;element name="workAssignmentId" type="{http://xmlns.oracle.com/scheduler/types}metadataObjectId" minOccurs="0" form="qualified"/>
 *         &lt;element name="workshiftId" type="{http://xmlns.oracle.com/scheduler/types}metadataObjectId" minOccurs="0" form="qualified"/>
 *         &lt;element name="requestType" type="{http://xmlns.oracle.com/scheduler/types}requestType" minOccurs="0" form="qualified"/>
 *         &lt;element name="errorWarningMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="errorWarningTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="errorWarningDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ecid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="processPhase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="submitterDmsEcid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="submitterDmsRid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="submitterFlowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="flowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="dmsRid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestDetail", propOrder = {
         "actualEndTime", "actualStartTime", "cause", "description", "dispatcherNode", "expirationTime",
         "isCancellable", "isHoldable", "jobDefinitionId", "parentRequestId", "priority", "processorNode", "requestId",
         "requestParameters", "requestedEndTime", "requestedStartTime", "retried", "scheduleId", "scheduledTime",
         "state", "errorType", "stepId", "submissionTime", "submitter", "runAsUser", "triggerId", "workAssignmentId",
         "workshiftId", "requestType", "errorWarningMessage", "errorWarningTime", "errorWarningDetail", "ecid",
         "processPhase", "submitterDmsEcid", "submitterDmsRid", "submitterFlowId", "flowId", "dmsRid"
    })
public class RequestDetail {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualEndTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualStartTime;
    protected String cause;
    protected String description;
    protected String dispatcherNode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationTime;
    protected boolean isCancellable;
    protected boolean isHoldable;
    protected MetadataObjectId jobDefinitionId;
    protected long parentRequestId;
    protected int priority;
    protected String processorNode;
    protected long requestId;
    protected RequestParameters requestParameters;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedEndTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedStartTime;
    protected int retried;
    protected MetadataObjectId scheduleId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledTime;
    @XmlSchemaType(name = "string")
    protected State state;
    @XmlSchemaType(name = "string")
    protected ErrorType errorType;
    protected String stepId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionTime;
    protected String submitter;
    protected String runAsUser;
    protected MetadataObjectId triggerId;
    protected MetadataObjectId workAssignmentId;
    protected MetadataObjectId workshiftId;
    @XmlSchemaType(name = "string")
    protected RequestType requestType;
    protected String errorWarningMessage;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar errorWarningTime;
    protected String errorWarningDetail;
    protected String ecid;
    protected String processPhase;
    protected String submitterDmsEcid;
    protected String submitterDmsRid;
    protected String submitterFlowId;
    protected String flowId;
    protected String dmsRid;

    /**
     * Gets the value of the actualEndTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getActualEndTime() {
        return actualEndTime;
    }

    /**
     * Sets the value of the actualEndTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setActualEndTime(XMLGregorianCalendar value) {
        this.actualEndTime = value;
    }

    /**
     * Gets the value of the actualStartTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getActualStartTime() {
        return actualStartTime;
    }

    /**
     * Sets the value of the actualStartTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setActualStartTime(XMLGregorianCalendar value) {
        this.actualStartTime = value;
    }

    /**
     * Gets the value of the cause property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCause(String value) {
        this.cause = value;
    }

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
     * Gets the value of the dispatcherNode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDispatcherNode() {
        return dispatcherNode;
    }

    /**
     * Sets the value of the dispatcherNode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDispatcherNode(String value) {
        this.dispatcherNode = value;
    }

    /**
     * Gets the value of the expirationTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setExpirationTime(XMLGregorianCalendar value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the isCancellable property.
     *
     */
    public boolean isIsCancellable() {
        return isCancellable;
    }

    /**
     * Sets the value of the isCancellable property.
     *
     */
    public void setIsCancellable(boolean value) {
        this.isCancellable = value;
    }

    /**
     * Gets the value of the isHoldable property.
     *
     */
    public boolean isIsHoldable() {
        return isHoldable;
    }

    /**
     * Sets the value of the isHoldable property.
     *
     */
    public void setIsHoldable(boolean value) {
        this.isHoldable = value;
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
     * Gets the value of the parentRequestId property.
     *
     */
    public long getParentRequestId() {
        return parentRequestId;
    }

    /**
     * Sets the value of the parentRequestId property.
     *
     */
    public void setParentRequestId(long value) {
        this.parentRequestId = value;
    }

    /**
     * Gets the value of the priority property.
     *
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     *
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Gets the value of the processorNode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProcessorNode() {
        return processorNode;
    }

    /**
     * Sets the value of the processorNode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProcessorNode(String value) {
        this.processorNode = value;
    }

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
     * Gets the value of the retried property.
     *
     */
    public int getRetried() {
        return retried;
    }

    /**
     * Sets the value of the retried property.
     *
     */
    public void setRetried(int value) {
        this.retried = value;
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
     * Gets the value of the scheduledTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getScheduledTime() {
        return scheduledTime;
    }

    /**
     * Sets the value of the scheduledTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setScheduledTime(XMLGregorianCalendar value) {
        this.scheduledTime = value;
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
     * Gets the value of the errorType property.
     *
     * @return
     *     possible object is
     *     {@link ErrorType }
     *
     */
    public ErrorType getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     *
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *
     */
    public void setErrorType(ErrorType value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the stepId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStepId() {
        return stepId;
    }

    /**
     * Sets the value of the stepId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStepId(String value) {
        this.stepId = value;
    }

    /**
     * Gets the value of the submissionTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getSubmissionTime() {
        return submissionTime;
    }

    /**
     * Sets the value of the submissionTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setSubmissionTime(XMLGregorianCalendar value) {
        this.submissionTime = value;
    }

    /**
     * Gets the value of the submitter property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubmitter() {
        return submitter;
    }

    /**
     * Sets the value of the submitter property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubmitter(String value) {
        this.submitter = value;
    }

    /**
     * Gets the value of the runAsUser property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRunAsUser() {
        return runAsUser;
    }

    /**
     * Sets the value of the runAsUser property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRunAsUser(String value) {
        this.runAsUser = value;
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
     * Gets the value of the workAssignmentId property.
     *
     * @return
     *     possible object is
     *     {@link MetadataObjectId }
     *
     */
    public MetadataObjectId getWorkAssignmentId() {
        return workAssignmentId;
    }

    /**
     * Sets the value of the workAssignmentId property.
     *
     * @param value
     *     allowed object is
     *     {@link MetadataObjectId }
     *
     */
    public void setWorkAssignmentId(MetadataObjectId value) {
        this.workAssignmentId = value;
    }

    /**
     * Gets the value of the workshiftId property.
     *
     * @return
     *     possible object is
     *     {@link MetadataObjectId }
     *
     */
    public MetadataObjectId getWorkshiftId() {
        return workshiftId;
    }

    /**
     * Sets the value of the workshiftId property.
     *
     * @param value
     *     allowed object is
     *     {@link MetadataObjectId }
     *
     */
    public void setWorkshiftId(MetadataObjectId value) {
        this.workshiftId = value;
    }

    /**
     * Gets the value of the requestType property.
     *
     * @return
     *     possible object is
     *     {@link RequestType }
     *
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     *
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the errorWarningMessage property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorWarningMessage() {
        return errorWarningMessage;
    }

    /**
     * Sets the value of the errorWarningMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorWarningMessage(String value) {
        this.errorWarningMessage = value;
    }

    /**
     * Gets the value of the errorWarningTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getErrorWarningTime() {
        return errorWarningTime;
    }

    /**
     * Sets the value of the errorWarningTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setErrorWarningTime(XMLGregorianCalendar value) {
        this.errorWarningTime = value;
    }

    /**
     * Gets the value of the errorWarningDetail property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorWarningDetail() {
        return errorWarningDetail;
    }

    /**
     * Sets the value of the errorWarningDetail property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorWarningDetail(String value) {
        this.errorWarningDetail = value;
    }

    /**
     * Gets the value of the ecid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEcid() {
        return ecid;
    }

    /**
     * Sets the value of the ecid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEcid(String value) {
        this.ecid = value;
    }

    /**
     * Gets the value of the processPhase property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProcessPhase() {
        return processPhase;
    }

    /**
     * Sets the value of the processPhase property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProcessPhase(String value) {
        this.processPhase = value;
    }

    /**
     * Gets the value of the submitterDmsEcid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubmitterDmsEcid() {
        return submitterDmsEcid;
    }

    /**
     * Sets the value of the submitterDmsEcid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubmitterDmsEcid(String value) {
        this.submitterDmsEcid = value;
    }

    /**
     * Gets the value of the submitterDmsRid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubmitterDmsRid() {
        return submitterDmsRid;
    }

    /**
     * Sets the value of the submitterDmsRid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubmitterDmsRid(String value) {
        this.submitterDmsRid = value;
    }

    /**
     * Gets the value of the submitterFlowId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubmitterFlowId() {
        return submitterFlowId;
    }

    /**
     * Sets the value of the submitterFlowId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubmitterFlowId(String value) {
        this.submitterFlowId = value;
    }

    /**
     * Gets the value of the flowId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * Sets the value of the flowId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFlowId(String value) {
        this.flowId = value;
    }

    /**
     * Gets the value of the dmsRid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDmsRid() {
        return dmsRid;
    }

    /**
     * Sets the value of the dmsRid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDmsRid(String value) {
        this.dmsRid = value;
    }

}
