//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.29 at 01:53:07 PM CET 
//


package com.carlgira.oracle.bpel.test.model.task;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/taskDefinition}name"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/taskDefinition}id"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/taskDefinition}title"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/taskDefinition}priority"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/taskDefinition}process"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/routingSlip}routingSlip"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/configuration}workflowConfiguration"/>
 *       &lt;/sequence>
 *       &lt;attribute name="targetNamespace" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "id",
    "title",
    "priority",
    "process",
    "routingSlip",
    "workflowConfiguration"
})
@XmlRootElement(name = "taskDefinition", namespace = "http://xmlns.oracle.com/bpel/workflow/taskDefinition")
public class TaskDefinition {

    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/taskDefinition", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/taskDefinition", required = true)
    protected String id;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/taskDefinition", required = true)
    protected Title title;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/taskDefinition", required = true)
    protected BigInteger priority;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/taskDefinition", required = true)
    protected Process process;
    @XmlElement(required = true)
    protected RoutingSlip routingSlip;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/configuration", required = true)
    protected WorkflowConfiguration workflowConfiguration;
    @XmlAttribute(name = "targetNamespace", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String targetNamespace;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the process property.
     * 
     * @return
     *     possible object is
     *     {@link Process }
     *     
     */
    public Process getProcess() {
        return process;
    }

    /**
     * Sets the value of the process property.
     * 
     * @param value
     *     allowed object is
     *     {@link Process }
     *     
     */
    public void setProcess(Process value) {
        this.process = value;
    }

    /**
     * Gets the value of the routingSlip property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingSlip }
     *     
     */
    public RoutingSlip getRoutingSlip() {
        return routingSlip;
    }

    /**
     * Sets the value of the routingSlip property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingSlip }
     *     
     */
    public void setRoutingSlip(RoutingSlip value) {
        this.routingSlip = value;
    }

    /**
     * Gets the value of the workflowConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowConfiguration }
     *     
     */
    public WorkflowConfiguration getWorkflowConfiguration() {
        return workflowConfiguration;
    }

    /**
     * Sets the value of the workflowConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowConfiguration }
     *     
     */
    public void setWorkflowConfiguration(WorkflowConfiguration value) {
        this.workflowConfiguration = value;
    }

    /**
     * Gets the value of the targetNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * Sets the value of the targetNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

}
