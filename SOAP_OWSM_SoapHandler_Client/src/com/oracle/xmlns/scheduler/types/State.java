
package com.oracle.xmlns.scheduler.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for state.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="state">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="WAIT"/>
 *     &lt;enumeration value="READY"/>
 *     &lt;enumeration value="RUNNING"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="BLOCKED"/>
 *     &lt;enumeration value="HOLD"/>
 *     &lt;enumeration value="CANCELLING"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="SUCCEEDED"/>
 *     &lt;enumeration value="PAUSED"/>
 *     &lt;enumeration value="PENDING_VALIDATION"/>
 *     &lt;enumeration value="VALIDATION_FAILED"/>
 *     &lt;enumeration value="SCHEDULE_ENDED"/>
 *     &lt;enumeration value="FINISHED"/>
 *     &lt;enumeration value="ERROR_AUTO_RETRY"/>
 *     &lt;enumeration value="ERROR_MANUAL_RECOVERY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "state")
@XmlEnum
public enum State {

    UNKNOWN,
    WAIT,
    READY,
    RUNNING,
    COMPLETED,
    BLOCKED,
    HOLD,
    CANCELLING,
    EXPIRED,
    CANCELLED,
    ERROR,
    WARNING,
    SUCCEEDED,
    PAUSED,
    PENDING_VALIDATION,
    VALIDATION_FAILED,
    SCHEDULE_ENDED,
    FINISHED,
    ERROR_AUTO_RETRY,
    ERROR_MANUAL_RECOVERY;

    public String value() {
        return name();
    }

    public static State fromValue(String v) {
        return valueOf(v);
    }

}
