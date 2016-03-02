//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.02 at 12:41:40 PM CET 
//


package com.carlgira.oracle.bpel.test.model.composite;

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
 *         &lt;element ref="{http://xmlns.oracle.com/sca/1.0}interface.wsdl"/>
 *         &lt;element ref="{http://xmlns.oracle.com/sca/1.0}binding.ws"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://xmlns.oracle.com/soa/designer/}wsdlLocation"/>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "interfaceWsdl",
    "bindingWs"
})
@XmlRootElement(name = "service")
public class Service {

    @XmlElement(name = "interface.wsdl", required = true)
    protected InterfaceWsdl interfaceWsdl;
    @XmlElement(name = "binding.ws", required = true)
    protected BindingWs bindingWs;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "wsdlLocation", namespace = "http://xmlns.oracle.com/soa/designer/", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String wsdlLocation;

    /**
     * Gets the value of the interfaceWsdl property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceWsdl }
     *     
     */
    public InterfaceWsdl getInterfaceWsdl() {
        return interfaceWsdl;
    }

    /**
     * Sets the value of the interfaceWsdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceWsdl }
     *     
     */
    public void setInterfaceWsdl(InterfaceWsdl value) {
        this.interfaceWsdl = value;
    }

    /**
     * Gets the value of the bindingWs property.
     * 
     * @return
     *     possible object is
     *     {@link BindingWs }
     *     
     */
    public BindingWs getBindingWs() {
        return bindingWs;
    }

    /**
     * Sets the value of the bindingWs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingWs }
     *     
     */
    public void setBindingWs(BindingWs value) {
        this.bindingWs = value;
    }

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
     * Gets the value of the wsdlLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsdlLocation() {
        return wsdlLocation;
    }

    /**
     * Sets the value of the wsdlLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsdlLocation(String value) {
        this.wsdlLocation = value;
    }

}
