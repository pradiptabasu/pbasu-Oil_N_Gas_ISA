
package com.oracle.xmlns.scheduler.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for asyncStatus.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="asyncStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="PAUSE"/>
 *     &lt;enumeration value="CANCEL"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="BIZ_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "asyncStatus")
@XmlEnum
public enum AsyncStatus {

    SUCCESS,
    PAUSE,
    CANCEL,
    WARNING,
    ERROR,
    UPDATE,
    BIZ_ERROR;

    public String value() {
        return name();
    }

    public static AsyncStatus fromValue(String v) {
        return valueOf(v);
    }

}
