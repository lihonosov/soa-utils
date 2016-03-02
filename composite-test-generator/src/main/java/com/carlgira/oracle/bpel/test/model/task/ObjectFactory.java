//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.29 at 01:53:07 PM CET 
//


package com.carlgira.oracle.bpel.test.model.task;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.carlgira.oracle.bpel.test.model.task package. 
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

    private final static QName _GlobalCreationTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/configuration", "globalCreationTask");
    private final static QName _GroupNotificationConfiguration_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/routingSlip", "groupNotificationConfiguration");
    private final static QName _BpelEventListener_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/configuration", "bpelEventListener");
    private final static QName _AllowParticipantsEditParticipants_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/configuration", "allowParticipantsEditParticipants");
    private final static QName _Type_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/routingSlip", "type");
    private final static QName _BpelNoCallbacks_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/configuration", "bpelNoCallbacks");
    private final static QName _TaskFlowFileLocation_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/configuration", "taskFlowFileLocation");
    private final static QName _OnErrorParticipant_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/routingSlip", "onErrorParticipant");
    private final static QName _Id_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskDefinition", "id");
    private final static QName _Outcome_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/configuration", "outcome");
    private final static QName _ShowCompleteGraphicalHistory_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/configuration", "showCompleteGraphicalHistory");
    private final static QName _Name_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskDefinition", "name");
    private final static QName _ReevalTranslatablesOnUpdate_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/configuration", "reevalTranslatablesOnUpdate");
    private final static QName _Priority_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskDefinition", "priority");
    private final static QName _Value_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskDefinition", "value");
    private final static QName _TaskSequenceTypes_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/configuration", "taskSequenceTypes");
    private final static QName _AllowInitiatorEditParticipants_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/configuration", "allowInitiatorEditParticipants");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.carlgira.oracle.bpel.test.model.task
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Reminder }
     * 
     */
    public Reminder createReminder() {
        return new Reminder();
    }

    /**
     * Create an instance of {@link GlobalConfiguration }
     * 
     */
    public GlobalConfiguration createGlobalConfiguration() {
        return new GlobalConfiguration();
    }

    /**
     * Create an instance of {@link ApplicationContext }
     * 
     */
    public ApplicationContext createApplicationContext() {
        return new ApplicationContext();
    }

    /**
     * Create an instance of {@link TaskOwner }
     * 
     */
    public TaskOwner createTaskOwner() {
        return new TaskOwner();
    }

    /**
     * Create an instance of {@link ExpirationDuration }
     * 
     */
    public ExpirationDuration createExpirationDuration() {
        return new ExpirationDuration();
    }

    /**
     * Create an instance of {@link SharePayloadConfiguration }
     * 
     */
    public SharePayloadConfiguration createSharePayloadConfiguration() {
        return new SharePayloadConfiguration();
    }

    /**
     * Create an instance of {@link Resource }
     * 
     */
    public Resource createResource() {
        return new Resource();
    }

    /**
     * Create an instance of {@link Participants }
     * 
     */
    public Participants createParticipants() {
        return new Participants();
    }

    /**
     * Create an instance of {@link Stage }
     * 
     */
    public Stage createStage() {
        return new Stage();
    }

    /**
     * Create an instance of {@link Participant }
     * 
     */
    public Participant createParticipant() {
        return new Participant();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link RoutingSlip }
     * 
     */
    public RoutingSlip createRoutingSlip() {
        return new RoutingSlip();
    }

    /**
     * Create an instance of {@link WorkflowConfiguration }
     * 
     */
    public WorkflowConfiguration createWorkflowConfiguration() {
        return new WorkflowConfiguration();
    }

    /**
     * Create an instance of {@link Outcomes }
     * 
     */
    public Outcomes createOutcomes() {
        return new Outcomes();
    }

    /**
     * Create an instance of {@link RestrictedActions }
     * 
     */
    public RestrictedActions createRestrictedActions() {
        return new RestrictedActions();
    }

    /**
     * Create an instance of {@link Payload }
     * 
     */
    public Payload createPayload() {
        return new Payload();
    }

    /**
     * Create an instance of {@link MessageAttribute }
     * 
     */
    public MessageAttribute createMessageAttribute() {
        return new MessageAttribute();
    }

    /**
     * Create an instance of {@link PreActionMandatoryUserSteps }
     * 
     */
    public PreActionMandatoryUserSteps createPreActionMandatoryUserSteps() {
        return new PreActionMandatoryUserSteps();
    }

    /**
     * Create an instance of {@link WorkflowConditions }
     * 
     */
    public WorkflowConditions createWorkflowConditions() {
        return new WorkflowConditions();
    }

    /**
     * Create an instance of {@link Process }
     * 
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link TaskDefinition }
     * 
     */
    public TaskDefinition createTaskDefinition() {
        return new TaskDefinition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/configuration", name = "globalCreationTask")
    public JAXBElement<Boolean> createGlobalCreationTask(Boolean value) {
        return new JAXBElement<Boolean>(_GlobalCreationTask_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", name = "groupNotificationConfiguration")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGroupNotificationConfiguration(String value) {
        return new JAXBElement<String>(_GroupNotificationConfiguration_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/configuration", name = "bpelEventListener")
    public JAXBElement<Boolean> createBpelEventListener(Boolean value) {
        return new JAXBElement<Boolean>(_BpelEventListener_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/configuration", name = "allowParticipantsEditParticipants")
    public JAXBElement<Boolean> createAllowParticipantsEditParticipants(Boolean value) {
        return new JAXBElement<Boolean>(_AllowParticipantsEditParticipants_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", name = "type")
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/configuration", name = "bpelNoCallbacks")
    public JAXBElement<Boolean> createBpelNoCallbacks(Boolean value) {
        return new JAXBElement<Boolean>(_BpelNoCallbacks_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/configuration", name = "taskFlowFileLocation")
    public JAXBElement<String> createTaskFlowFileLocation(String value) {
        return new JAXBElement<String>(_TaskFlowFileLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", name = "onErrorParticipant")
    public JAXBElement<Resource> createOnErrorParticipant(Resource value) {
        return new JAXBElement<Resource>(_OnErrorParticipant_QNAME, Resource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskDefinition", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/configuration", name = "outcome")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOutcome(String value) {
        return new JAXBElement<String>(_Outcome_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/configuration", name = "showCompleteGraphicalHistory")
    public JAXBElement<Boolean> createShowCompleteGraphicalHistory(Boolean value) {
        return new JAXBElement<Boolean>(_ShowCompleteGraphicalHistory_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskDefinition", name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/configuration", name = "reevalTranslatablesOnUpdate")
    public JAXBElement<Boolean> createReevalTranslatablesOnUpdate(Boolean value) {
        return new JAXBElement<Boolean>(_ReevalTranslatablesOnUpdate_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskDefinition", name = "priority")
    public JAXBElement<BigInteger> createPriority(BigInteger value) {
        return new JAXBElement<BigInteger>(_Priority_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskDefinition", name = "value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/configuration", name = "taskSequenceTypes")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTaskSequenceTypes(String value) {
        return new JAXBElement<String>(_TaskSequenceTypes_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/configuration", name = "allowInitiatorEditParticipants")
    public JAXBElement<Boolean> createAllowInitiatorEditParticipants(Boolean value) {
        return new JAXBElement<Boolean>(_AllowInitiatorEditParticipants_QNAME, Boolean.class, null, value);
    }

}
