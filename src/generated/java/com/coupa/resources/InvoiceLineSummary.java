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

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for invoice-line-summary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="invoice-line-summary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="created-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updated-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="accounting-total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line-num" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="order-header-num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="order-line-id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="order-line-num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tax-rate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="tax-location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tax-amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tax-description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tax-supply-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account" type="{}account-summary" minOccurs="0"/>
 *         &lt;element name="accounting-total-currency" type="{}currency-summary" minOccurs="0"/>
 *         &lt;element name="currency" type="{}currency-summary" minOccurs="0"/>
 *         &lt;element name="item" type="{}item-summary" minOccurs="0"/>
 *         &lt;element name="tax-code" type="{}tax-code-summary" minOccurs="0"/>
 *         &lt;element name="uom" type="{}uom-summary" minOccurs="0"/>
 *         &lt;element name="created-by" type="{}user-summary" minOccurs="0"/>
 *         &lt;element name="updated-by" type="{}user-summary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice-line-summary", propOrder = {
    "id",
    "createdAt",
    "updatedAt",
    "accountingTotal",
    "description",
    "lineNum",
    "orderHeaderNum",
    "orderLineId",
    "orderLineNum",
    "price",
    "quantity",
    "status",
    "taxRate",
    "taxLocation",
    "taxAmount",
    "taxDescription",
    "taxSupplyDate",
    "total",
    "type",
    "account",
    "accountingTotalCurrency",
    "currency",
    "item",
    "taxCode",
    "uom",
    "createdBy",
    "updatedBy"
})
public class InvoiceLineSummary {

    protected BigInteger id;
    @XmlElement(name = "created-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(name = "updated-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    @XmlElement(name = "accounting-total")
    protected BigDecimal accountingTotal;
    protected String description;
    @XmlElement(name = "line-num")
    protected BigInteger lineNum;
    @XmlElement(name = "order-header-num")
    protected String orderHeaderNum;
    @XmlElement(name = "order-line-id")
    protected BigInteger orderLineId;
    @XmlElement(name = "order-line-num")
    protected String orderLineNum;
    protected BigDecimal price;
    protected Float quantity;
    protected String status;
    @XmlElement(name = "tax-rate")
    protected Float taxRate;
    @XmlElement(name = "tax-location")
    protected String taxLocation;
    @XmlElement(name = "tax-amount")
    protected BigDecimal taxAmount;
    @XmlElement(name = "tax-description")
    protected String taxDescription;
    @XmlElement(name = "tax-supply-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar taxSupplyDate;
    protected BigDecimal total;
    protected String type;
    protected AccountSummary account;
    @XmlElement(name = "accounting-total-currency")
    protected CurrencySummary accountingTotalCurrency;
    protected CurrencySummary currency;
    protected ItemSummary item;
    @XmlElement(name = "tax-code")
    protected TaxCodeSummary taxCode;
    protected UomSummary uom;
    @XmlElement(name = "created-by")
    protected UserSummary createdBy;
    @XmlElement(name = "updated-by")
    protected UserSummary updatedBy;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

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
     * Gets the value of the accountingTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountingTotal() {
        return accountingTotal;
    }

    /**
     * Sets the value of the accountingTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountingTotal(BigDecimal value) {
        this.accountingTotal = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the lineNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNum() {
        return lineNum;
    }

    /**
     * Sets the value of the lineNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNum(BigInteger value) {
        this.lineNum = value;
    }

    /**
     * Gets the value of the orderHeaderNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderHeaderNum() {
        return orderHeaderNum;
    }

    /**
     * Sets the value of the orderHeaderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderHeaderNum(String value) {
        this.orderHeaderNum = value;
    }

    /**
     * Gets the value of the orderLineId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderLineId() {
        return orderLineId;
    }

    /**
     * Sets the value of the orderLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderLineId(BigInteger value) {
        this.orderLineId = value;
    }

    /**
     * Gets the value of the orderLineNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineNum() {
        return orderLineNum;
    }

    /**
     * Sets the value of the orderLineNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineNum(String value) {
        this.orderLineNum = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQuantity(Float value) {
        this.quantity = value;
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
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTaxRate(Float value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxLocation() {
        return taxLocation;
    }

    /**
     * Sets the value of the taxLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxLocation(String value) {
        this.taxLocation = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDescription() {
        return taxDescription;
    }

    /**
     * Sets the value of the taxDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDescription(String value) {
        this.taxDescription = value;
    }

    /**
     * Gets the value of the taxSupplyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxSupplyDate() {
        return taxSupplyDate;
    }

    /**
     * Sets the value of the taxSupplyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxSupplyDate(XMLGregorianCalendar value) {
        this.taxSupplyDate = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSummary }
     *     
     */
    public AccountSummary getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSummary }
     *     
     */
    public void setAccount(AccountSummary value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountingTotalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencySummary }
     *     
     */
    public CurrencySummary getAccountingTotalCurrency() {
        return accountingTotalCurrency;
    }

    /**
     * Sets the value of the accountingTotalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencySummary }
     *     
     */
    public void setAccountingTotalCurrency(CurrencySummary value) {
        this.accountingTotalCurrency = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencySummary }
     *     
     */
    public CurrencySummary getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencySummary }
     *     
     */
    public void setCurrency(CurrencySummary value) {
        this.currency = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSummary }
     *     
     */
    public ItemSummary getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSummary }
     *     
     */
    public void setItem(ItemSummary value) {
        this.item = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCodeSummary }
     *     
     */
    public TaxCodeSummary getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCodeSummary }
     *     
     */
    public void setTaxCode(TaxCodeSummary value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link UomSummary }
     *     
     */
    public UomSummary getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link UomSummary }
     *     
     */
    public void setUom(UomSummary value) {
        this.uom = value;
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

}
