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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for supplier complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="supplier">
 *   &lt;complexContent>
 *     &lt;extension base="{}resource">
 *       &lt;sequence>
 *         &lt;element name="created-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updated-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="po-method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cxml-url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cxml-domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cxml-identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cxml-supplier-domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cxml-supplier-identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cxml-secret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cxml-protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="po-email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account-number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tax-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coupa-connect-secret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoice-matching-level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primary-contact" type="{}contact-summary" minOccurs="0"/>
 *         &lt;element name="primary-address" type="{}address-summary" minOccurs="0"/>
 *         &lt;element name="payment-term" type="{}payment-term-summary" minOccurs="0"/>
 *         &lt;element name="shipping-term" type="{}shipping-term-summary" minOccurs="0"/>
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
@XmlType(name = "supplier", propOrder = {
    "createdAt",
    "updatedAt",
    "name",
    "number",
    "status",
    "website",
    "poMethod",
    "cxmlUrl",
    "cxmlDomain",
    "cxmlIdentity",
    "cxmlSupplierDomain",
    "cxmlSupplierIdentity",
    "cxmlSecret",
    "cxmlProtocol",
    "poEmail",
    "accountNumber",
    "duns",
    "taxId",
    "coupaConnectSecret",
    "invoiceMatchingLevel",
    "primaryContact",
    "primaryAddress",
    "paymentTerm",
    "shippingTerm",
    "createdBy",
    "updatedBy"
})
@XmlRootElement
public class Supplier
    extends Resource
{

    @XmlElement(name = "created-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(name = "updated-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    protected String name;
    protected String number;
    protected String status;
    protected String website;
    @XmlElement(name = "po-method")
    protected String poMethod;
    @XmlElement(name = "cxml-url")
    protected String cxmlUrl;
    @XmlElement(name = "cxml-domain")
    protected String cxmlDomain;
    @XmlElement(name = "cxml-identity")
    protected String cxmlIdentity;
    @XmlElement(name = "cxml-supplier-domain")
    protected String cxmlSupplierDomain;
    @XmlElement(name = "cxml-supplier-identity")
    protected String cxmlSupplierIdentity;
    @XmlElement(name = "cxml-secret")
    protected String cxmlSecret;
    @XmlElement(name = "cxml-protocol")
    protected String cxmlProtocol;
    @XmlElement(name = "po-email")
    protected String poEmail;
    @XmlElement(name = "account-number")
    protected String accountNumber;
    protected String duns;
    @XmlElement(name = "tax-id")
    protected String taxId;
    @XmlElement(name = "coupa-connect-secret")
    protected String coupaConnectSecret;
    @XmlElement(name = "invoice-matching-level")
    protected String invoiceMatchingLevel;
    @XmlElement(name = "primary-contact")
    protected ContactSummary primaryContact;
    @XmlElement(name = "primary-address")
    protected AddressSummary primaryAddress;
    @XmlElement(name = "payment-term")
    protected PaymentTermSummary paymentTerm;
    @XmlElement(name = "shipping-term")
    protected ShippingTermSummary shippingTerm;
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
     * Gets the value of the number property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumber(String value) {
        this.number = value;
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
     * Gets the value of the website property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the poMethod property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPoMethod() {
        return poMethod;
    }

    /**
     * Sets the value of the poMethod property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPoMethod(String value) {
        this.poMethod = value;
    }

    /**
     * Gets the value of the cxmlUrl property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCxmlUrl() {
        return cxmlUrl;
    }

    /**
     * Sets the value of the cxmlUrl property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCxmlUrl(String value) {
        this.cxmlUrl = value;
    }

    /**
     * Gets the value of the cxmlDomain property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCxmlDomain() {
        return cxmlDomain;
    }

    /**
     * Sets the value of the cxmlDomain property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCxmlDomain(String value) {
        this.cxmlDomain = value;
    }

    /**
     * Gets the value of the cxmlIdentity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCxmlIdentity() {
        return cxmlIdentity;
    }

    /**
     * Sets the value of the cxmlIdentity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCxmlIdentity(String value) {
        this.cxmlIdentity = value;
    }

    /**
     * Gets the value of the cxmlSupplierDomain property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCxmlSupplierDomain() {
        return cxmlSupplierDomain;
    }

    /**
     * Sets the value of the cxmlSupplierDomain property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCxmlSupplierDomain(String value) {
        this.cxmlSupplierDomain = value;
    }

    /**
     * Gets the value of the cxmlSupplierIdentity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCxmlSupplierIdentity() {
        return cxmlSupplierIdentity;
    }

    /**
     * Sets the value of the cxmlSupplierIdentity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCxmlSupplierIdentity(String value) {
        this.cxmlSupplierIdentity = value;
    }

    /**
     * Gets the value of the cxmlSecret property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCxmlSecret() {
        return cxmlSecret;
    }

    /**
     * Sets the value of the cxmlSecret property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCxmlSecret(String value) {
        this.cxmlSecret = value;
    }

    /**
     * Gets the value of the cxmlProtocol property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCxmlProtocol() {
        return cxmlProtocol;
    }

    /**
     * Sets the value of the cxmlProtocol property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCxmlProtocol(String value) {
        this.cxmlProtocol = value;
    }

    /**
     * Gets the value of the poEmail property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPoEmail() {
        return poEmail;
    }

    /**
     * Sets the value of the poEmail property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPoEmail(String value) {
        this.poEmail = value;
    }

    /**
     * Gets the value of the accountNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the duns property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDuns() {
        return duns;
    }

    /**
     * Sets the value of the duns property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDuns(String value) {
        this.duns = value;
    }

    /**
     * Gets the value of the taxId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the coupaConnectSecret property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCoupaConnectSecret() {
        return coupaConnectSecret;
    }

    /**
     * Sets the value of the coupaConnectSecret property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCoupaConnectSecret(String value) {
        this.coupaConnectSecret = value;
    }

    /**
     * Gets the value of the invoiceMatchingLevel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInvoiceMatchingLevel() {
        return invoiceMatchingLevel;
    }

    /**
     * Sets the value of the invoiceMatchingLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInvoiceMatchingLevel(String value) {
        this.invoiceMatchingLevel = value;
    }

    /**
     * Gets the value of the primaryContact property.
     *
     * @return
     *     possible object is
     *     {@link ContactSummary }
     *
     */
    public ContactSummary getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Sets the value of the primaryContact property.
     *
     * @param value
     *     allowed object is
     *     {@link ContactSummary }
     *
     */
    public void setPrimaryContact(ContactSummary value) {
        this.primaryContact = value;
    }

    /**
     * Gets the value of the primaryAddress property.
     *
     * @return
     *     possible object is
     *     {@link AddressSummary }
     *
     */
    public AddressSummary getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link AddressSummary }
     *
     */
    public void setPrimaryAddress(AddressSummary value) {
        this.primaryAddress = value;
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