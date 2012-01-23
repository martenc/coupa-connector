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
// Generated on: 2012.01.20 at 04:19:15 PM ART
//


package com.coupa.transaction;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.coupa.resources.CurrencySummary;
import com.coupa.resources.Item;
import com.coupa.resources.Resource;
import com.coupa.resources.SupplierSummary;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="supplier-part-num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lead-time" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price-change" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="savings-pct" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="created-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updated-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="created-by" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updated-by" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="currency" type="{}currency-summary" minOccurs="0"/>
 *         &lt;element name="supplier" type="{}supplier-summary" minOccurs="0"/>
 *         &lt;element name="item" type="{}item" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "supplier-item")
public class SupplierItem extends Resource {

    protected BigInteger id;
    protected BigDecimal price;
    @XmlElement(name = "supplier-part-num")
    protected String supplierPartNum;
    @XmlElement(name = "lead-time")
    protected BigInteger leadTime;
    protected Boolean preferred;
    protected String manufacturer;
    @XmlElement(name = "price-change")
    protected BigDecimal priceChange;
    @XmlElement(name = "savings-pct")
    protected BigDecimal savingsPct;
    @XmlElement(name = "created-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(name = "updated-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    @XmlElement(name = "created-by")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdBy;
    @XmlElement(name = "updated-by")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedBy;
    protected CurrencySummary currency;
    protected SupplierSummary supplier;
    protected Item item;

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
     * Gets the value of the supplierPartNum property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSupplierPartNum() {
        return supplierPartNum;
    }

    /**
     * Sets the value of the supplierPartNum property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSupplierPartNum(String value) {
        this.supplierPartNum = value;
    }

    /**
     * Gets the value of the leadTime property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getLeadTime() {
        return leadTime;
    }

    /**
     * Sets the value of the leadTime property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setLeadTime(BigInteger value) {
        this.leadTime = value;
    }

    /**
     * Gets the value of the preferred property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setPreferred(Boolean value) {
        this.preferred = value;
    }

    /**
     * Gets the value of the manufacturer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the priceChange property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPriceChange() {
        return priceChange;
    }

    /**
     * Sets the value of the priceChange property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPriceChange(BigDecimal value) {
        this.priceChange = value;
    }

    /**
     * Gets the value of the savingsPct property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getSavingsPct() {
        return savingsPct;
    }

    /**
     * Sets the value of the savingsPct property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setSavingsPct(BigDecimal value) {
        this.savingsPct = value;
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
     * Gets the value of the createdBy property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreatedBy(XMLGregorianCalendar value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the updatedBy property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUpdatedBy(XMLGregorianCalendar value) {
        this.updatedBy = value;
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
     * Gets the value of the item property.
     *
     * @return
     *     possible object is
     *     {@link Item }
     *
     */
    public Item getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     *
     * @param value
     *     allowed object is
     *     {@link Item }
     *
     */
    public void setItem(Item value) {
        this.item = value;
    }

}