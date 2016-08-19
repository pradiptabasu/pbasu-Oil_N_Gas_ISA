
package com.oracle.xmlns.scheduler.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nlsOptions complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="nlsOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numericCharacters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="territory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nlsOptions", propOrder = { "language", "numericCharacters", "territory" })
public class NlsOptions {

    protected String language;
    protected String numericCharacters;
    protected String territory;

    /**
     * Gets the value of the language property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the numericCharacters property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumericCharacters() {
        return numericCharacters;
    }

    /**
     * Sets the value of the numericCharacters property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumericCharacters(String value) {
        this.numericCharacters = value;
    }

    /**
     * Gets the value of the territory property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTerritory(String value) {
        this.territory = value;
    }

}
