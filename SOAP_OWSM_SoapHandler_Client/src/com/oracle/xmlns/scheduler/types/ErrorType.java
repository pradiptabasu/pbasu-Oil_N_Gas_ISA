
package com.oracle.xmlns.scheduler.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="errorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="SYSTEM"/>
 *     &lt;enumeration value="BUSINESS"/>
 *     &lt;enumeration value="TIMEOUT"/>
 *     &lt;enumeration value="MIXED_NON_BUSINESS"/>
 *     &lt;enumeration value="MIXED_BUSINESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "errorType")
@XmlEnum
public enum ErrorType {

    UNKNOWN,
    SYSTEM,
    BUSINESS,
    TIMEOUT,
    MIXED_NON_BUSINESS,
    MIXED_BUSINESS;

    public String value() {
        return name();
    }

    public static ErrorType fromValue(String v) {
        return valueOf(v);
    }

}
