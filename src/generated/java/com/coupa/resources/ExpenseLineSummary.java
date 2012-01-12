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
 * <p>Java class for expense-line-summary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="expense-line-summary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="created-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updated-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="approved-amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="reporting-total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="accounting-total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="order-line-id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="expense-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expense-category" type="{}expense-category-summary" minOccurs="0"/>
 *         &lt;element name="account" type="{}account-summary" minOccurs="0"/>
 *         &lt;element name="period" type="{}period-summary" minOccurs="0"/>
 *         &lt;element name="currency" type="{}currency-summary" minOccurs="0"/>
 *         &lt;element name="accounting-total-currency" type="{}currency-summary" minOccurs="0"/>
 *         &lt;element name="expensed-by" type="{}user-summary" minOccurs="0"/>
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
@XmlType(name = "expense-line-summary", propOrder = {
    "id",
    "createdAt",
    "updatedAt",
    "status",
    "description",
    "merchant",
    "reason",
    "amount",
    "approvedAmount",
    "reportingTotal",
    "accountingTotal",
    "orderLineId",
    "expenseDate",
    "expenseCategory",
    "account",
    "period",
    "currency",
    "accountingTotalCurrency",
    "expensedBy",
    "createdBy",
    "updatedBy"
})
public class ExpenseLineSummary {

    protected BigInteger id;
    @XmlElement(name = "created-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(name = "updated-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    protected String status;
    protected String description;
    protected String merchant;
    protected String reason;
    protected BigDecimal amount;
    @XmlElement(name = "approved-amount")
    protected BigDecimal approvedAmount;
    @XmlElement(name = "reporting-total")
    protected BigDecimal reportingTotal;
    @XmlElement(name = "accounting-total")
    protected BigDecimal accountingTotal;
    @XmlElement(name = "order-line-id")
    protected BigInteger orderLineId;
    @XmlElement(name = "expense-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expenseDate;
    @XmlElement(name = "expense-category")
    protected ExpenseCategorySummary expenseCategory;
    protected AccountSummary account;
    protected PeriodSummary period;
    protected CurrencySummary currency;
    @XmlElement(name = "accounting-total-currency")
    protected CurrencySummary accountingTotalCurrency;
    @XmlElement(name = "expensed-by")
    protected UserSummary expensedBy;
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
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchant(String value) {
        this.merchant = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the approvedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprovedAmount() {
        return approvedAmount;
    }

    /**
     * Sets the value of the approvedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprovedAmount(BigDecimal value) {
        this.approvedAmount = value;
    }

    /**
     * Gets the value of the reportingTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReportingTotal() {
        return reportingTotal;
    }

    /**
     * Sets the value of the reportingTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReportingTotal(BigDecimal value) {
        this.reportingTotal = value;
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
     * Gets the value of the expenseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpenseDate() {
        return expenseDate;
    }

    /**
     * Sets the value of the expenseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpenseDate(XMLGregorianCalendar value) {
        this.expenseDate = value;
    }

    /**
     * Gets the value of the expenseCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ExpenseCategorySummary }
     *     
     */
    public ExpenseCategorySummary getExpenseCategory() {
        return expenseCategory;
    }

    /**
     * Sets the value of the expenseCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpenseCategorySummary }
     *     
     */
    public void setExpenseCategory(ExpenseCategorySummary value) {
        this.expenseCategory = value;
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
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodSummary }
     *     
     */
    public PeriodSummary getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodSummary }
     *     
     */
    public void setPeriod(PeriodSummary value) {
        this.period = value;
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
     * Gets the value of the expensedBy property.
     * 
     * @return
     *     possible object is
     *     {@link UserSummary }
     *     
     */
    public UserSummary getExpensedBy() {
        return expensedBy;
    }

    /**
     * Sets the value of the expensedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSummary }
     *     
     */
    public void setExpensedBy(UserSummary value) {
        this.expensedBy = value;
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
