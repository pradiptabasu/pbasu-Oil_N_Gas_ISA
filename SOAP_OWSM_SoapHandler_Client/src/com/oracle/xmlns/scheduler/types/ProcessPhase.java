
package com.oracle.xmlns.scheduler.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processPhase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="processPhase">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="Initial"/>
 *     &lt;enumeration value="JobSetInitial"/>
 *     &lt;enumeration value="PreProcessStart"/>
 *     &lt;enumeration value="PreProcessDelayed"/>
 *     &lt;enumeration value="PreProcessComplete"/>
 *     &lt;enumeration value="ExecuteInitiate"/>
 *     &lt;enumeration value="ExecuteInitiateComplete"/>
 *     &lt;enumeration value="ExecuteAsyncWait"/>
 *     &lt;enumeration value="ExecuteFinalize"/>
 *     &lt;enumeration value="ExecuteFinalizeAsync"/>
 *     &lt;enumeration value="ExecuteFinalizeComplete"/>
 *     &lt;enumeration value="ExecutePaused"/>
 *     &lt;enumeration value="PostProcessStart"/>
 *     &lt;enumeration value="PostProcessDelayed"/>
 *     &lt;enumeration value="PostProcessComplete"/>
 *     &lt;enumeration value="ProcessExecuteComplete"/>
 *     &lt;enumeration value="JobSetInitial"/>
 *     &lt;enumeration value="ProcessSetupReady"/>
 *     &lt;enumeration value="ExecutePausedWaitForSubreq"/>
 *     &lt;enumeration value="ExecuteAsyncReceived"/>
 *     &lt;enumeration value="JobSetExecuteStepsWait"/>
 *     &lt;enumeration value="PostExecuteStart"/>
 *     &lt;enumeration value="PostExecuteWaitForSubreq"/>
 *     &lt;enumeration value="PostExecuteTerminalComplete"/>
 *     &lt;enumeration value="PostExecuteComplete"/>
 *     &lt;enumeration value="Complete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "processPhase")
@XmlEnum
public enum ProcessPhase {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Initial")
    INITIAL("Initial"),
    @XmlEnumValue("JobSetInitial")
    JOB_SET_INITIAL("JobSetInitial"),
    @XmlEnumValue("PreProcessStart")
    PRE_PROCESS_START("PreProcessStart"),
    @XmlEnumValue("PreProcessDelayed")
    PRE_PROCESS_DELAYED("PreProcessDelayed"),
    @XmlEnumValue("PreProcessComplete")
    PRE_PROCESS_COMPLETE("PreProcessComplete"),
    @XmlEnumValue("ExecuteInitiate")
    EXECUTE_INITIATE("ExecuteInitiate"),
    @XmlEnumValue("ExecuteInitiateComplete")
    EXECUTE_INITIATE_COMPLETE("ExecuteInitiateComplete"),
    @XmlEnumValue("ExecuteAsyncWait")
    EXECUTE_ASYNC_WAIT("ExecuteAsyncWait"),
    @XmlEnumValue("ExecuteFinalize")
    EXECUTE_FINALIZE("ExecuteFinalize"),
    @XmlEnumValue("ExecuteFinalizeAsync")
    EXECUTE_FINALIZE_ASYNC("ExecuteFinalizeAsync"),
    @XmlEnumValue("ExecuteFinalizeComplete")
    EXECUTE_FINALIZE_COMPLETE("ExecuteFinalizeComplete"),
    @XmlEnumValue("ExecutePaused")
    EXECUTE_PAUSED("ExecutePaused"),
    @XmlEnumValue("PostProcessStart")
    POST_PROCESS_START("PostProcessStart"),
    @XmlEnumValue("PostProcessDelayed")
    POST_PROCESS_DELAYED("PostProcessDelayed"),
    @XmlEnumValue("PostProcessComplete")
    POST_PROCESS_COMPLETE("PostProcessComplete"),
    @XmlEnumValue("ProcessExecuteComplete")
    PROCESS_EXECUTE_COMPLETE("ProcessExecuteComplete"),
    @XmlEnumValue("ProcessSetupReady")
    PROCESS_SETUP_READY("ProcessSetupReady"),
    @XmlEnumValue("ExecutePausedWaitForSubreq")
    EXECUTE_PAUSED_WAIT_FOR_SUBREQ("ExecutePausedWaitForSubreq"),
    @XmlEnumValue("ExecuteAsyncReceived")
    EXECUTE_ASYNC_RECEIVED("ExecuteAsyncReceived"),
    @XmlEnumValue("JobSetExecuteStepsWait")
    JOB_SET_EXECUTE_STEPS_WAIT("JobSetExecuteStepsWait"),
    @XmlEnumValue("PostExecuteStart")
    POST_EXECUTE_START("PostExecuteStart"),
    @XmlEnumValue("PostExecuteWaitForSubreq")
    POST_EXECUTE_WAIT_FOR_SUBREQ("PostExecuteWaitForSubreq"),
    @XmlEnumValue("PostExecuteTerminalComplete")
    POST_EXECUTE_TERMINAL_COMPLETE("PostExecuteTerminalComplete"),
    @XmlEnumValue("PostExecuteComplete")
    POST_EXECUTE_COMPLETE("PostExecuteComplete"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete");
    private final String value;

    ProcessPhase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessPhase fromValue(String v) {
        for (ProcessPhase c : ProcessPhase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
