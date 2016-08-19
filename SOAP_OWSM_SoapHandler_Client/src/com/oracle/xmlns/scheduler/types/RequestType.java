
package com.oracle.xmlns.scheduler.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="SINGLETON"/>
 *     &lt;enumeration value="RECUR_PARENT"/>
 *     &lt;enumeration value="RECUR_CHILD"/>
 *     &lt;enumeration value="JOBSET_SINGLETON"/>
 *     &lt;enumeration value="JOBSET_STEP"/>
 *     &lt;enumeration value="JOBSET_RECUR_PARENT"/>
 *     &lt;enumeration value="JOBSET_RECUR_CHILD"/>
 *     &lt;enumeration value="SUB_REQUEST"/>
 *     &lt;enumeration value="UNVALIDATED_REQUEST"/>
 *     &lt;enumeration value="UNVALIDATED_SUB_REQUEST"/>
 *     &lt;enumeration value="TRIGGER_CHILD"/>
 *     &lt;enumeration value="JOBSET_TRIGGER_CHILD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "requestType")
@XmlEnum
public enum RequestType {

    UNKNOWN,
    SINGLETON,
    RECUR_PARENT,
    RECUR_CHILD,
    JOBSET_SINGLETON,
    JOBSET_STEP,
    JOBSET_RECUR_PARENT,
    JOBSET_RECUR_CHILD,
    SUB_REQUEST,
    UNVALIDATED_REQUEST,
    UNVALIDATED_SUB_REQUEST,
    TRIGGER_CHILD,
    JOBSET_TRIGGER_CHILD;

    public String value() {
        return name();
    }

    public static RequestType fromValue(String v) {
        return valueOf(v);
    }

}
