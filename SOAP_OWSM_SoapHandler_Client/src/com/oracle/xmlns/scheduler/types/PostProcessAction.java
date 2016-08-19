
package com.oracle.xmlns.scheduler.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for postProcessAction complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="postProcessAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arguments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="fileMgmtGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="onSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="onWarning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postProcessAction", propOrder = {
         "actionName", "actionOrder", "arguments", "fileMgmtGroup", "description", "onError", "onSuccess", "onWarning"
    })
public class PostProcessAction {

    protected String actionName;
    protected int actionOrder;
    @XmlElement(nillable = true)
    protected List<String> arguments;
    protected String fileMgmtGroup;
    protected String description;
    protected boolean onError;
    protected boolean onSuccess;
    protected boolean onWarning;

    /**
     * Gets the value of the actionName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Sets the value of the actionName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActionName(String value) {
        this.actionName = value;
    }

    /**
     * Gets the value of the actionOrder property.
     *
     */
    public int getActionOrder() {
        return actionOrder;
    }

    /**
     * Sets the value of the actionOrder property.
     *
     */
    public void setActionOrder(int value) {
        this.actionOrder = value;
    }

    /**
     * Gets the value of the arguments property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arguments property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArguments().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getArguments() {
        if (arguments == null) {
            arguments = new ArrayList<String>();
        }
        return this.arguments;
    }

    /**
     * Gets the value of the fileMgmtGroup property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFileMgmtGroup() {
        return fileMgmtGroup;
    }

    /**
     * Sets the value of the fileMgmtGroup property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFileMgmtGroup(String value) {
        this.fileMgmtGroup = value;
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
     * Gets the value of the onError property.
     *
     */
    public boolean isOnError() {
        return onError;
    }

    /**
     * Sets the value of the onError property.
     *
     */
    public void setOnError(boolean value) {
        this.onError = value;
    }

    /**
     * Gets the value of the onSuccess property.
     *
     */
    public boolean isOnSuccess() {
        return onSuccess;
    }

    /**
     * Sets the value of the onSuccess property.
     *
     */
    public void setOnSuccess(boolean value) {
        this.onSuccess = value;
    }

    /**
     * Gets the value of the onWarning property.
     *
     */
    public boolean isOnWarning() {
        return onWarning;
    }

    /**
     * Sets the value of the onWarning property.
     *
     */
    public void setOnWarning(boolean value) {
        this.onWarning = value;
    }

}
