
package com.oracle.xmlns.scheduler.types;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.oracle.xmlns.scheduler.types package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.scheduler.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestDetail }
     *
     */
    public RequestDetail createRequestDetail() {
        return new RequestDetail();
    }

    /**
     * Create an instance of {@link RequestParameters }
     *
     */
    public RequestParameters createRequestParameters() {
        return new RequestParameters();
    }

    /**
     * Create an instance of {@link PostProcessAction }
     *
     */
    public PostProcessAction createPostProcessAction() {
        return new PostProcessAction();
    }

    /**
     * Create an instance of {@link RequestExecutionContext }
     *
     */
    public RequestExecutionContext createRequestExecutionContext() {
        return new RequestExecutionContext();
    }

    /**
     * Create an instance of {@link RequestParameter }
     *
     */
    public RequestParameter createRequestParameter() {
        return new RequestParameter();
    }

    /**
     * Create an instance of {@link NlsOptions }
     *
     */
    public NlsOptions createNlsOptions() {
        return new NlsOptions();
    }

    /**
     * Create an instance of {@link MetadataObjectId }
     *
     */
    public MetadataObjectId createMetadataObjectId() {
        return new MetadataObjectId();
    }

    /**
     * Create an instance of {@link StepArgs }
     *
     */
    public StepArgs createStepArgs() {
        return new StepArgs();
    }

}
