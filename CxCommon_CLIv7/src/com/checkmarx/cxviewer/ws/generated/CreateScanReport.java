
package com.checkmarx.cxviewer.ws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportRequest" type="{http://Checkmarx.com/v7}CxWSReportRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionID",
    "reportRequest"
})
@XmlRootElement(name = "CreateScanReport")
public class CreateScanReport {

    protected String sessionID;
    protected CxWSReportRequest reportRequest;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the reportRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSReportRequest }
     *     
     */
    public CxWSReportRequest getReportRequest() {
        return reportRequest;
    }

    /**
     * Sets the value of the reportRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSReportRequest }
     *     
     */
    public void setReportRequest(CxWSReportRequest value) {
        this.reportRequest = value;
    }

}
