
package com.oracle.xmlns.scheduler.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metadataObjectType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="metadataObjectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JOB_TYPE"/>
 *     &lt;enumeration value="JOB_DEFINITION"/>
 *     &lt;enumeration value="JOB_SET"/>
 *     &lt;enumeration value="INCOMPATIBILITY"/>
 *     &lt;enumeration value="SCHEDULE_DEFINITION"/>
 *     &lt;enumeration value="EXCLUSION_DEFINITION"/>
 *     &lt;enumeration value="TRIGGER"/>
 *     &lt;enumeration value="WORKSHIFT"/>
 *     &lt;enumeration value="WORK_ASSIGNMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "metadataObjectType")
@XmlEnum
public enum MetadataObjectType {

    JOB_TYPE,
    JOB_DEFINITION,
    JOB_SET,
    INCOMPATIBILITY,
    SCHEDULE_DEFINITION,
    EXCLUSION_DEFINITION,
    TRIGGER,
    WORKSHIFT,
    WORK_ASSIGNMENT;

    public String value() {
        return name();
    }

    public static MetadataObjectType fromValue(String v) {
        return valueOf(v);
    }

}
