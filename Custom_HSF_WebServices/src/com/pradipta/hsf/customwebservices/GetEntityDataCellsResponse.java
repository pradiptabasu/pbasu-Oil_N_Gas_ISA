
package com.pradipta.hsf.customwebservices;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="DataCell" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="scenario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "dataCell" })
@XmlRootElement(name = "getEntityDataCellsResponse")
public class GetEntityDataCellsResponse {

    @XmlElement(name = "DataCell", required = true)
    protected List<GetEntityDataCellsResponse.DataCell> dataCell;

    /**
     * Gets the value of the dataCell property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataCell property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataCell().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetEntityDataCellsResponse.DataCell }
     *
     *
     */
    public List<GetEntityDataCellsResponse.DataCell> getDataCell() {
        if (dataCell == null) {
            dataCell = new ArrayList<GetEntityDataCellsResponse.DataCell>();
        }
        return this.dataCell;
    }


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
     *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="scenario" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "accountNumber", "time", "measure", "scenario", "value" })
    public static class DataCell {

        @XmlElement(name = "AccountNumber", required = true)
        protected String accountNumber;
        @XmlElement(required = true)
        protected String time;
        @XmlElement(required = true)
        protected String measure;
        @XmlElement(required = true)
        protected String scenario;
        @XmlElement(required = true)
        protected String value;

        /**
         * Gets the value of the accountNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAccountNumber() {
            return accountNumber;
        }

        /**
         * Sets the value of the accountNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAccountNumber(String value) {
            this.accountNumber = value;
        }

        /**
         * Gets the value of the time property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTime(String value) {
            this.time = value;
        }

        /**
         * Gets the value of the measure property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMeasure() {
            return measure;
        }

        /**
         * Sets the value of the measure property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMeasure(String value) {
            this.measure = value;
        }

        /**
         * Gets the value of the scenario property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getScenario() {
            return scenario;
        }

        /**
         * Sets the value of the scenario property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setScenario(String value) {
            this.scenario = value;
        }

        /**
         * Gets the value of the value property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
