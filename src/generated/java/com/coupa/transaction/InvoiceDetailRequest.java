//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.11 at 10:56:25 AM ART 
//


package com.coupa.transaction;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{}InvoiceDetailRequestHeader"/>
 *         &lt;element ref="{}InvoiceDetailOrder" maxOccurs="unbounded"/>
 *         &lt;element ref="{}InvoiceDetailSummary"/>
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
    "invoiceDetailRequestHeader",
    "invoiceDetailOrder",
    "invoiceDetailSummary"
})
@XmlRootElement(name = "InvoiceDetailRequest")
public class InvoiceDetailRequest {

    @XmlElement(name = "InvoiceDetailRequestHeader", required = true)
    protected InvoiceDetailRequestHeader invoiceDetailRequestHeader;
    @XmlElement(name = "InvoiceDetailOrder", required = true)
    protected List<InvoiceDetailOrder> invoiceDetailOrder;
    @XmlElement(name = "InvoiceDetailSummary", required = true)
    protected InvoiceDetailSummary invoiceDetailSummary;

    /**
     * Gets the value of the invoiceDetailRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailRequestHeader }
     *     
     */
    public InvoiceDetailRequestHeader getInvoiceDetailRequestHeader() {
        return invoiceDetailRequestHeader;
    }

    /**
     * Sets the value of the invoiceDetailRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailRequestHeader }
     *     
     */
    public void setInvoiceDetailRequestHeader(InvoiceDetailRequestHeader value) {
        this.invoiceDetailRequestHeader = value;
    }

    /**
     * Gets the value of the invoiceDetailOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceDetailOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceDetailOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceDetailOrder }
     * 
     * 
     */
    public List<InvoiceDetailOrder> getInvoiceDetailOrder() {
        if (invoiceDetailOrder == null) {
            invoiceDetailOrder = new ArrayList<InvoiceDetailOrder>();
        }
        return this.invoiceDetailOrder;
    }

    /**
     * Gets the value of the invoiceDetailSummary property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailSummary }
     *     
     */
    public InvoiceDetailSummary getInvoiceDetailSummary() {
        return invoiceDetailSummary;
    }

    /**
     * Sets the value of the invoiceDetailSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailSummary }
     *     
     */
    public void setInvoiceDetailSummary(InvoiceDetailSummary value) {
        this.invoiceDetailSummary = value;
    }

}
