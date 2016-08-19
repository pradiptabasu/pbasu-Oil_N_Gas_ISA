
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
 *         &lt;element name="HSFConnectParameters">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="database" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="entity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HSFFetchParameters">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="scenario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ListOfTime">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ListOfAccounts">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "", propOrder = { "hsfConnectParameters", "hsfFetchParameters" })
@XmlRootElement(name = "getEntityDataCellsRequest")
public class GetEntityDataCellsRequest {

    @XmlElement(name = "HSFConnectParameters", required = true)
    protected GetEntityDataCellsRequest.HSFConnectParameters hsfConnectParameters;
    @XmlElement(name = "HSFFetchParameters", required = true)
    protected GetEntityDataCellsRequest.HSFFetchParameters hsfFetchParameters;

    /**
     * Gets the value of the hsfConnectParameters property.
     *
     * @return
     *     possible object is
     *     {@link GetEntityDataCellsRequest.HSFConnectParameters }
     *
     */
    public GetEntityDataCellsRequest.HSFConnectParameters getHSFConnectParameters() {
        return hsfConnectParameters;
    }

    /**
     * Sets the value of the hsfConnectParameters property.
     *
     * @param value
     *     allowed object is
     *     {@link GetEntityDataCellsRequest.HSFConnectParameters }
     *
     */
    public void setHSFConnectParameters(GetEntityDataCellsRequest.HSFConnectParameters value) {
        this.hsfConnectParameters = value;
    }

    /**
     * Gets the value of the hsfFetchParameters property.
     *
     * @return
     *     possible object is
     *     {@link GetEntityDataCellsRequest.HSFFetchParameters }
     *
     */
    public GetEntityDataCellsRequest.HSFFetchParameters getHSFFetchParameters() {
        return hsfFetchParameters;
    }

    /**
     * Sets the value of the hsfFetchParameters property.
     *
     * @param value
     *     allowed object is
     *     {@link GetEntityDataCellsRequest.HSFFetchParameters }
     *
     */
    public void setHSFFetchParameters(GetEntityDataCellsRequest.HSFFetchParameters value) {
        this.hsfFetchParameters = value;
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
     *         &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="database" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="entity" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "hostname", "port", "username", "password", "server", "database", "entity" })
    public static class HSFConnectParameters {

        @XmlElement(required = true)
        protected String hostname;
        @XmlElement(required = true)
        protected String port;
        @XmlElement(required = true)
        protected String username;
        @XmlElement(required = true)
        protected String password;
        @XmlElement(required = true)
        protected String server;
        @XmlElement(required = true)
        protected String database;
        @XmlElement(required = true)
        protected String entity;

        /**
         * Gets the value of the hostname property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getHostname() {
            return hostname;
        }

        /**
         * Sets the value of the hostname property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setHostname(String value) {
            this.hostname = value;
        }

        /**
         * Gets the value of the port property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPort() {
            return port;
        }

        /**
         * Sets the value of the port property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPort(String value) {
            this.port = value;
        }

        /**
         * Gets the value of the username property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getUsername() {
            return username;
        }

        /**
         * Sets the value of the username property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Gets the value of the password property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Gets the value of the server property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getServer() {
            return server;
        }

        /**
         * Sets the value of the server property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setServer(String value) {
            this.server = value;
        }

        /**
         * Gets the value of the database property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDatabase() {
            return database;
        }

        /**
         * Sets the value of the database property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDatabase(String value) {
            this.database = value;
        }

        /**
         * Gets the value of the entity property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getEntity() {
            return entity;
        }

        /**
         * Sets the value of the entity property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setEntity(String value) {
            this.entity = value;
        }

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
     *         &lt;element name="measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="scenario" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ListOfTime">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ListOfAccounts">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    @XmlType(name = "", propOrder = { "measure", "scenario", "listOfTime", "listOfAccounts" })
    public static class HSFFetchParameters {

        @XmlElement(required = true)
        protected String measure;
        @XmlElement(required = true)
        protected String scenario;
        @XmlElement(name = "ListOfTime", required = true)
        protected GetEntityDataCellsRequest.HSFFetchParameters.ListOfTime listOfTime;
        @XmlElement(name = "ListOfAccounts", required = true)
        protected GetEntityDataCellsRequest.HSFFetchParameters.ListOfAccounts listOfAccounts;

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
         * Gets the value of the listOfTime property.
         *
         * @return
         *     possible object is
         *     {@link GetEntityDataCellsRequest.HSFFetchParameters.ListOfTime }
         *
         */
        public GetEntityDataCellsRequest.HSFFetchParameters.ListOfTime getListOfTime() {
            return listOfTime;
        }

        /**
         * Sets the value of the listOfTime property.
         *
         * @param value
         *     allowed object is
         *     {@link GetEntityDataCellsRequest.HSFFetchParameters.ListOfTime }
         *
         */
        public void setListOfTime(GetEntityDataCellsRequest.HSFFetchParameters.ListOfTime value) {
            this.listOfTime = value;
        }

        /**
         * Gets the value of the listOfAccounts property.
         *
         * @return
         *     possible object is
         *     {@link GetEntityDataCellsRequest.HSFFetchParameters.ListOfAccounts }
         *
         */
        public GetEntityDataCellsRequest.HSFFetchParameters.ListOfAccounts getListOfAccounts() {
            return listOfAccounts;
        }

        /**
         * Sets the value of the listOfAccounts property.
         *
         * @param value
         *     allowed object is
         *     {@link GetEntityDataCellsRequest.HSFFetchParameters.ListOfAccounts }
         *
         */
        public void setListOfAccounts(GetEntityDataCellsRequest.HSFFetchParameters.ListOfAccounts value) {
            this.listOfAccounts = value;
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
         *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "accountNumber" })
        public static class ListOfAccounts {

            @XmlElement(name = "AccountNumber", required = true)
            protected List<String> accountNumber;

            /**
             * Gets the value of the accountNumber property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the accountNumber property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAccountNumber().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             *
             *
             */
            public List<String> getAccountNumber() {
                if (accountNumber == null) {
                    accountNumber = new ArrayList<String>();
                }
                return this.accountNumber;
            }

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
         *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "time" })
        public static class ListOfTime {

            @XmlElement(required = true)
            protected List<String> time;

            /**
             * Gets the value of the time property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the time property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTime().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             *
             *
             */
            public List<String> getTime() {
                if (time == null) {
                    time = new ArrayList<String>();
                }
                return this.time;
            }

        }

    }

}
