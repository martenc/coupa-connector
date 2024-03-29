/**
 * Mule Coupa Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 *
 * Coupa Connector com.coupa package contains portions of code based on Coupa4j
 * http://code.google.com/p/coupa4j/, under a MIT license:
 * http://www.opensource.org/licenses/mit-license.php.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.01.11 at 10:56:43 AM ART
//


package com.coupa.resources;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for order-header complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="order-header">
 *   &lt;complexContent>
 *     &lt;extension base="{}resource">
 *       &lt;sequence>
 *         &lt;element name="created-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updated-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="acknowledged-flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transmission-status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="exported" type="{}restBoolean" minOccurs="0"/>
 *         &lt;element name="ship-to-address" type="{}address-summary" minOccurs="0"/>
 *         &lt;element name="ship-to-user" type="{}user-summary" minOccurs="0"/>
 *         &lt;element name="supplier" type="{}supplier-summary" minOccurs="0"/>
 *         &lt;element name="payment-term" type="{}payment-term-summary" minOccurs="0"/>
 *         &lt;element name="shipping-term" type="{}shipping-term-summary" minOccurs="0"/>
 *         &lt;element name="requisition-header" type="{}requisition-header" minOccurs="0"/>
 *         &lt;element name="attachments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attachment" type="{}attachment-link-summary" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="order-lines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="order-line" type="{}order-line-summary" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="created-by" type="{}user-summary" minOccurs="0"/>
 *         &lt;element name="updated-by" type="{}user-summary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order-header", propOrder = {
    "createdAt",
    "updatedAt",
    "acknowledgedFlag",
    "status",
    "transmissionStatus",
    "version",
    "exported",
    "shipToAddress",
    "shipToUser",
    "supplier",
    "paymentTerm",
    "shippingTerm",
    "requisitionHeader",
    "attachments",
    "orderLines",
    "createdBy",
    "updatedBy"
})
@XmlRootElement
public class OrderHeader
    extends Resource
{

    @XmlElement(name = "created-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(name = "updated-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    @XmlElement(name = "acknowledged-flag")
    protected String acknowledgedFlag;
    protected String status;
    @XmlElement(name = "transmission-status")
    protected String transmissionStatus;
    protected BigInteger version;
    protected RestBoolean exported;
    @XmlElement(name = "ship-to-address")
    protected AddressSummary shipToAddress;
    @XmlElement(name = "ship-to-user")
    protected UserSummary shipToUser;
    protected SupplierSummary supplier;
    @XmlElement(name = "payment-term")
    protected PaymentTermSummary paymentTerm;
    @XmlElement(name = "shipping-term")
    protected ShippingTermSummary shippingTerm;
    @XmlElement(name = "requisition-header")
    protected RequisitionHeader requisitionHeader;
    protected OrderHeader.Attachments attachments;
    @XmlElement(name = "order-lines")
    protected OrderHeader.OrderLines orderLines;
    @XmlElement(name = "created-by")
    protected UserSummary createdBy;
    @XmlElement(name = "updated-by")
    protected UserSummary updatedBy;

    /**
     * Gets the value of the createdAt property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the updatedAt property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUpdatedAt(XMLGregorianCalendar value) {
        this.updatedAt = value;
    }

    /**
     * Gets the value of the acknowledgedFlag property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAcknowledgedFlag() {
        return acknowledgedFlag;
    }

    /**
     * Sets the value of the acknowledgedFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAcknowledgedFlag(String value) {
        this.acknowledgedFlag = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the transmissionStatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransmissionStatus() {
        return transmissionStatus;
    }

    /**
     * Sets the value of the transmissionStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransmissionStatus(String value) {
        this.transmissionStatus = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the exported property.
     *
     * @return
     *     possible object is
     *     {@link RestBoolean }
     *
     */
    public RestBoolean getExported() {
        return exported;
    }

    /**
     * Sets the value of the exported property.
     *
     * @param value
     *     allowed object is
     *     {@link RestBoolean }
     *
     */
    public void setExported(RestBoolean value) {
        this.exported = value;
    }

    /**
     * Gets the value of the shipToAddress property.
     *
     * @return
     *     possible object is
     *     {@link AddressSummary }
     *
     */
    public AddressSummary getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link AddressSummary }
     *
     */
    public void setShipToAddress(AddressSummary value) {
        this.shipToAddress = value;
    }

    /**
     * Gets the value of the shipToUser property.
     *
     * @return
     *     possible object is
     *     {@link UserSummary }
     *
     */
    public UserSummary getShipToUser() {
        return shipToUser;
    }

    /**
     * Sets the value of the shipToUser property.
     *
     * @param value
     *     allowed object is
     *     {@link UserSummary }
     *
     */
    public void setShipToUser(UserSummary value) {
        this.shipToUser = value;
    }

    /**
     * Gets the value of the supplier property.
     *
     * @return
     *     possible object is
     *     {@link SupplierSummary }
     *
     */
    public SupplierSummary getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     *
     * @param value
     *     allowed object is
     *     {@link SupplierSummary }
     *
     */
    public void setSupplier(SupplierSummary value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the paymentTerm property.
     *
     * @return
     *     possible object is
     *     {@link PaymentTermSummary }
     *
     */
    public PaymentTermSummary getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Sets the value of the paymentTerm property.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentTermSummary }
     *
     */
    public void setPaymentTerm(PaymentTermSummary value) {
        this.paymentTerm = value;
    }

    /**
     * Gets the value of the shippingTerm property.
     *
     * @return
     *     possible object is
     *     {@link ShippingTermSummary }
     *
     */
    public ShippingTermSummary getShippingTerm() {
        return shippingTerm;
    }

    /**
     * Sets the value of the shippingTerm property.
     *
     * @param value
     *     allowed object is
     *     {@link ShippingTermSummary }
     *
     */
    public void setShippingTerm(ShippingTermSummary value) {
        this.shippingTerm = value;
    }

    /**
     * Gets the value of the requisitionHeader property.
     *
     * @return
     *     possible object is
     *     {@link RequisitionHeader }
     *
     */
    public RequisitionHeader getRequisitionHeader() {
        return requisitionHeader;
    }

    /**
     * Sets the value of the requisitionHeader property.
     *
     * @param value
     *     allowed object is
     *     {@link RequisitionHeader }
     *
     */
    public void setRequisitionHeader(RequisitionHeader value) {
        this.requisitionHeader = value;
    }

    /**
     * Gets the value of the attachments property.
     *
     * @return
     *     possible object is
     *     {@link OrderHeader.Attachments }
     *
     */
    public OrderHeader.Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     *
     * @param value
     *     allowed object is
     *     {@link OrderHeader.Attachments }
     *
     */
    public void setAttachments(OrderHeader.Attachments value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the orderLines property.
     *
     * @return
     *     possible object is
     *     {@link OrderHeader.OrderLines }
     *
     */
    public OrderHeader.OrderLines getOrderLines() {
        return orderLines;
    }

    /**
     * Sets the value of the orderLines property.
     *
     * @param value
     *     allowed object is
     *     {@link OrderHeader.OrderLines }
     *
     */
    public void setOrderLines(OrderHeader.OrderLines value) {
        this.orderLines = value;
    }

    /**
     * Gets the value of the createdBy property.
     *
     * @return
     *     possible object is
     *     {@link UserSummary }
     *
     */
    public UserSummary getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     *
     * @param value
     *     allowed object is
     *     {@link UserSummary }
     *
     */
    public void setCreatedBy(UserSummary value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the updatedBy property.
     *
     * @return
     *     possible object is
     *     {@link UserSummary }
     *
     */
    public UserSummary getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     *
     * @param value
     *     allowed object is
     *     {@link UserSummary }
     *
     */
    public void setUpdatedBy(UserSummary value) {
        this.updatedBy = value;
    }


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
     *         &lt;element name="attachment" type="{}attachment-link-summary" maxOccurs="unbounded" minOccurs="0"/>
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
        "attachment"
    })
    public static class Attachments {

        protected List<AttachmentLinkSummary> attachment;

        /**
         * Gets the value of the attachment property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachment property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachment().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttachmentLinkSummary }
         *
         *
         */
        public List<AttachmentLinkSummary> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<AttachmentLinkSummary>();
            }
            return this.attachment;
        }

    }


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
     *         &lt;element name="order-line" type="{}order-line-summary" maxOccurs="unbounded" minOccurs="0"/>
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
        "orderLine"
    })
    public static class OrderLines {

        @XmlElement(name = "order-line")
        protected List<OrderLineSummary> orderLine;

        /**
         * Gets the value of the orderLine property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderLine property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrderLine().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderLineSummary }
         *
         *
         */
        public List<OrderLineSummary> getOrderLine() {
            if (orderLine == null) {
                orderLine = new ArrayList<OrderLineSummary>();
            }
            return this.orderLine;
        }

    }

}
