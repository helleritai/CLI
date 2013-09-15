
package com.checkmarx.cxviewer.ws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScanAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScanAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Parameters" type="{http://Checkmarx.com/v7}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Trigger" type="{http://Checkmarx.com/v7}ScanEventType"/>
 *         &lt;element name="Action" type="{http://Checkmarx.com/v7}ScanActionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanAction", propOrder = {
    "parameters",
    "trigger",
    "action"
})
public class ScanAction {

    @XmlElement(name = "Parameters")
    protected ArrayOfString parameters;
    @XmlElement(name = "Trigger", required = true)
    protected ScanEventType trigger;
    @XmlElement(name = "Action", required = true)
    protected ScanActionType action;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setParameters(ArrayOfString value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link ScanEventType }
     *     
     */
    public ScanEventType getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanEventType }
     *     
     */
    public void setTrigger(ScanEventType value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ScanActionType }
     *     
     */
    public ScanActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanActionType }
     *     
     */
    public void setAction(ScanActionType value) {
        this.action = value;
    }

}
