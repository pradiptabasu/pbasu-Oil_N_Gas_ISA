
package com.oracle.xmlns.scheduler;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.scheduler.types.PostProcessAction;
import com.oracle.xmlns.scheduler.types.RequestParameters;


/**
 * <p>Java class for addPPActions complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="addPPActions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestParameters" type="{http://xmlns.oracle.com/scheduler/types}requestParameters" form="qualified"/>
 *         &lt;element name="postProcessActions" type="{http://xmlns.oracle.com/scheduler/types}postProcessAction" maxOccurs="100" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPPActions", propOrder = { "requestParameters", "postProcessActions" })
public class AddPPActions {

    @XmlElement(required = true)
    protected RequestParameters requestParameters;
    protected List<PostProcessAction> postProcessActions;

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
     * Gets the value of the postProcessActions property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postProcessActions property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostProcessActions().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostProcessAction }
     *
     *
     */
    public List<PostProcessAction> getPostProcessActions() {
        if (postProcessActions == null) {
            postProcessActions = new ArrayList<PostProcessAction>();
        }
        return this.postProcessActions;
    }

}
