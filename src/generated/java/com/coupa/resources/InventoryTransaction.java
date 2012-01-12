//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.01.11 at 10:56:43 AM ART
//


package com.coupa.resources;

import java.math.BigDecimal;
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
 * <p>Java class for inventory-transaction complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="inventory-transaction">
 *   &lt;complexContent>
 *     &lt;extension base="{}resource">
 *       &lt;sequence>
 *         &lt;element name="created-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updated-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="rfid-tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exported" type="{}restBoolean" minOccurs="0"/>
 *         &lt;element name="account" type="{}account-summary" minOccurs="0"/>
 *         &lt;element name="order-line" type="{}order-line-summary" minOccurs="0"/>
 *         &lt;element name="from-warehouse-location" type="{}warehouse-location-summary" minOccurs="0"/>
 *         &lt;element name="inspection-code" type="{}inspection-code-summary" minOccurs="0"/>
 *         &lt;element name="item" type="{}item-summary" minOccurs="0"/>
 *         &lt;element name="to-warehouse-location" type="{}warehouse-location-summary" minOccurs="0"/>
 *         &lt;element name="uom" type="{}uom-summary" minOccurs="0"/>
 *         &lt;element name="created-by" type="{}user-summary" minOccurs="0"/>
 *         &lt;element name="updated-by" type="{}user-summary" minOccurs="0"/>
 *         &lt;element name="asset-tags" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="asset-tag" type="{}asset-tag-summary" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventory-transaction", propOrder = {
    "createdAt",
    "updatedAt",
    "barcode",
    "price",
    "quantity",
    "rfidTag",
    "total",
    "type",
    "status",
    "exported",
    "account",
    "orderLine",
    "fromWarehouseLocation",
    "inspectionCode",
    "item",
    "toWarehouseLocation",
    "uom",
    "createdBy",
    "updatedBy",
    "assetTags",
    "attachments"
})
@XmlRootElement
public class InventoryTransaction
    extends Resource
{

    @XmlElement(name = "created-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(name = "updated-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    protected String barcode;
    protected BigDecimal price;
    protected Float quantity;
    @XmlElement(name = "rfid-tag")
    protected String rfidTag;
    protected BigDecimal total;
    protected String type;
    protected String status;
    protected RestBoolean exported;
    protected AccountSummary account;
    @XmlElement(name = "order-line")
    protected OrderLineSummary orderLine;
    @XmlElement(name = "from-warehouse-location")
    protected WarehouseLocationSummary fromWarehouseLocation;
    @XmlElement(name = "inspection-code")
    protected InspectionCodeSummary inspectionCode;
    protected ItemSummary item;
    @XmlElement(name = "to-warehouse-location")
    protected WarehouseLocationSummary toWarehouseLocation;
    protected UomSummary uom;
    @XmlElement(name = "created-by")
    protected UserSummary createdBy;
    @XmlElement(name = "updated-by")
    protected UserSummary updatedBy;
    @XmlElement(name = "asset-tags")
    protected InventoryTransaction.AssetTags assetTags;
    protected InventoryTransaction.Attachments attachments;

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
     * Gets the value of the barcode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBarcode(String value) {
        this.barcode = value;
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
     * Gets the value of the rfidTag property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRfidTag() {
        return rfidTag;
    }

    /**
     * Sets the value of the rfidTag property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRfidTag(String value) {
        this.rfidTag = value;
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
     * Gets the value of the orderLine property.
     *
     * @return
     *     possible object is
     *     {@link OrderLineSummary }
     *
     */
    public OrderLineSummary getOrderLine() {
        return orderLine;
    }

    /**
     * Sets the value of the orderLine property.
     *
     * @param value
     *     allowed object is
     *     {@link OrderLineSummary }
     *
     */
    public void setOrderLine(OrderLineSummary value) {
        this.orderLine = value;
    }

    /**
     * Gets the value of the fromWarehouseLocation property.
     *
     * @return
     *     possible object is
     *     {@link WarehouseLocationSummary }
     *
     */
    public WarehouseLocationSummary getFromWarehouseLocation() {
        return fromWarehouseLocation;
    }

    /**
     * Sets the value of the fromWarehouseLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link WarehouseLocationSummary }
     *
     */
    public void setFromWarehouseLocation(WarehouseLocationSummary value) {
        this.fromWarehouseLocation = value;
    }

    /**
     * Gets the value of the inspectionCode property.
     *
     * @return
     *     possible object is
     *     {@link InspectionCodeSummary }
     *
     */
    public InspectionCodeSummary getInspectionCode() {
        return inspectionCode;
    }

    /**
     * Sets the value of the inspectionCode property.
     *
     * @param value
     *     allowed object is
     *     {@link InspectionCodeSummary }
     *
     */
    public void setInspectionCode(InspectionCodeSummary value) {
        this.inspectionCode = value;
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
     * Gets the value of the toWarehouseLocation property.
     *
     * @return
     *     possible object is
     *     {@link WarehouseLocationSummary }
     *
     */
    public WarehouseLocationSummary getToWarehouseLocation() {
        return toWarehouseLocation;
    }

    /**
     * Sets the value of the toWarehouseLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link WarehouseLocationSummary }
     *
     */
    public void setToWarehouseLocation(WarehouseLocationSummary value) {
        this.toWarehouseLocation = value;
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

    /**
     * Gets the value of the assetTags property.
     *
     * @return
     *     possible object is
     *     {@link InventoryTransaction.AssetTags }
     *
     */
    public InventoryTransaction.AssetTags getAssetTags() {
        return assetTags;
    }

    /**
     * Sets the value of the assetTags property.
     *
     * @param value
     *     allowed object is
     *     {@link InventoryTransaction.AssetTags }
     *
     */
    public void setAssetTags(InventoryTransaction.AssetTags value) {
        this.assetTags = value;
    }

    /**
     * Gets the value of the attachments property.
     *
     * @return
     *     possible object is
     *     {@link InventoryTransaction.Attachments }
     *
     */
    public InventoryTransaction.Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     *
     * @param value
     *     allowed object is
     *     {@link InventoryTransaction.Attachments }
     *
     */
    public void setAttachments(InventoryTransaction.Attachments value) {
        this.attachments = value;
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
     *         &lt;element name="asset-tag" type="{}asset-tag-summary" maxOccurs="unbounded" minOccurs="0"/>
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
        "assetTag"
    })
    public static class AssetTags {

        @XmlElement(name = "asset-tag")
        protected List<AssetTagSummary> assetTag;

        /**
         * Gets the value of the assetTag property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assetTag property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssetTag().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssetTagSummary }
         *
         *
         */
        public List<AssetTagSummary> getAssetTag() {
            if (assetTag == null) {
                assetTag = new ArrayList<AssetTagSummary>();
            }
            return this.assetTag;
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

}
