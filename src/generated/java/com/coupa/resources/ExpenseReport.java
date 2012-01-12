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
 * <p>Java class for expense-report complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="expense-report">
 *   &lt;complexContent>
 *     &lt;extension base="{}resource">
 *       &lt;sequence>
 *         &lt;element name="created-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updated-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submitted-at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="auditor-note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reject-reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="exported" type="{}restBoolean" minOccurs="0"/>
 *         &lt;element name="payment" type="{}payment-summary" minOccurs="0"/>
 *         &lt;element name="currency" type="{}currency-summary" minOccurs="0"/>
 *         &lt;element name="expensed-by" type="{}user-summary" minOccurs="0"/>
 *         &lt;element name="created-by" type="{}user-summary" minOccurs="0"/>
 *         &lt;element name="updated-by" type="{}user-summary" minOccurs="0"/>
 *         &lt;element name="expense-lines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="expense-line" type="{}expense-line-summary" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="events" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="event" type="{}expense-report-event-history-summary" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="expense-policy-violations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="expense-policy-violation" type="{}expense-policy-violation-summary" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="approvals" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="approval" type="{}approval-summary" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "expense-report", propOrder = {
    "createdAt",
    "updatedAt",
    "title",
    "status",
    "submittedAt",
    "auditorNote",
    "rejectReason",
    "paid",
    "total",
    "exported",
    "payment",
    "currency",
    "expensedBy",
    "createdBy",
    "updatedBy",
    "expenseLines",
    "events",
    "expensePolicyViolations",
    "approvals"
})
@XmlRootElement
public class ExpenseReport
    extends Resource
{

    @XmlElement(name = "created-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(name = "updated-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    protected String title;
    protected String status;
    @XmlElement(name = "submitted-at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedAt;
    @XmlElement(name = "auditor-note")
    protected String auditorNote;
    @XmlElement(name = "reject-reason")
    protected String rejectReason;
    protected String paid;
    protected BigDecimal total;
    protected RestBoolean exported;
    protected PaymentSummary payment;
    protected CurrencySummary currency;
    @XmlElement(name = "expensed-by")
    protected UserSummary expensedBy;
    @XmlElement(name = "created-by")
    protected UserSummary createdBy;
    @XmlElement(name = "updated-by")
    protected UserSummary updatedBy;
    @XmlElement(name = "expense-lines")
    protected ExpenseReport.ExpenseLines expenseLines;
    protected ExpenseReport.Events events;
    @XmlElement(name = "expense-policy-violations")
    protected ExpenseReport.ExpensePolicyViolations expensePolicyViolations;
    protected ExpenseReport.Approvals approvals;

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
     * Gets the value of the title property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the submittedAt property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getSubmittedAt() {
        return submittedAt;
    }

    /**
     * Sets the value of the submittedAt property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setSubmittedAt(XMLGregorianCalendar value) {
        this.submittedAt = value;
    }

    /**
     * Gets the value of the auditorNote property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAuditorNote() {
        return auditorNote;
    }

    /**
     * Sets the value of the auditorNote property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAuditorNote(String value) {
        this.auditorNote = value;
    }

    /**
     * Gets the value of the rejectReason property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets the value of the rejectReason property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRejectReason(String value) {
        this.rejectReason = value;
    }

    /**
     * Gets the value of the paid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaid() {
        return paid;
    }

    /**
     * Sets the value of the paid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaid(String value) {
        this.paid = value;
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
     * Gets the value of the payment property.
     *
     * @return
     *     possible object is
     *     {@link PaymentSummary }
     *
     */
    public PaymentSummary getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentSummary }
     *
     */
    public void setPayment(PaymentSummary value) {
        this.payment = value;
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

    /**
     * Gets the value of the expenseLines property.
     *
     * @return
     *     possible object is
     *     {@link ExpenseReport.ExpenseLines }
     *
     */
    public ExpenseReport.ExpenseLines getExpenseLines() {
        return expenseLines;
    }

    /**
     * Sets the value of the expenseLines property.
     *
     * @param value
     *     allowed object is
     *     {@link ExpenseReport.ExpenseLines }
     *
     */
    public void setExpenseLines(ExpenseReport.ExpenseLines value) {
        this.expenseLines = value;
    }

    /**
     * Gets the value of the events property.
     *
     * @return
     *     possible object is
     *     {@link ExpenseReport.Events }
     *
     */
    public ExpenseReport.Events getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     *
     * @param value
     *     allowed object is
     *     {@link ExpenseReport.Events }
     *
     */
    public void setEvents(ExpenseReport.Events value) {
        this.events = value;
    }

    /**
     * Gets the value of the expensePolicyViolations property.
     *
     * @return
     *     possible object is
     *     {@link ExpenseReport.ExpensePolicyViolations }
     *
     */
    public ExpenseReport.ExpensePolicyViolations getExpensePolicyViolations() {
        return expensePolicyViolations;
    }

    /**
     * Sets the value of the expensePolicyViolations property.
     *
     * @param value
     *     allowed object is
     *     {@link ExpenseReport.ExpensePolicyViolations }
     *
     */
    public void setExpensePolicyViolations(ExpenseReport.ExpensePolicyViolations value) {
        this.expensePolicyViolations = value;
    }

    /**
     * Gets the value of the approvals property.
     *
     * @return
     *     possible object is
     *     {@link ExpenseReport.Approvals }
     *
     */
    public ExpenseReport.Approvals getApprovals() {
        return approvals;
    }

    /**
     * Sets the value of the approvals property.
     *
     * @param value
     *     allowed object is
     *     {@link ExpenseReport.Approvals }
     *
     */
    public void setApprovals(ExpenseReport.Approvals value) {
        this.approvals = value;
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
     *         &lt;element name="approval" type="{}approval-summary" maxOccurs="unbounded" minOccurs="0"/>
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
        "approval"
    })
    public static class Approvals {

        protected List<ApprovalSummary> approval;

        /**
         * Gets the value of the approval property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the approval property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApproval().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ApprovalSummary }
         *
         *
         */
        public List<ApprovalSummary> getApproval() {
            if (approval == null) {
                approval = new ArrayList<ApprovalSummary>();
            }
            return this.approval;
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
     *         &lt;element name="event" type="{}expense-report-event-history-summary" maxOccurs="unbounded" minOccurs="0"/>
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
        "event"
    })
    public static class Events {

        protected List<ExpenseReportEventHistorySummary> event;

        /**
         * Gets the value of the event property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the event property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvent().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExpenseReportEventHistorySummary }
         *
         *
         */
        public List<ExpenseReportEventHistorySummary> getEvent() {
            if (event == null) {
                event = new ArrayList<ExpenseReportEventHistorySummary>();
            }
            return this.event;
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
     *         &lt;element name="expense-line" type="{}expense-line-summary" maxOccurs="unbounded" minOccurs="0"/>
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
        "expenseLine"
    })
    public static class ExpenseLines {

        @XmlElement(name = "expense-line")
        protected List<ExpenseLineSummary> expenseLine;

        /**
         * Gets the value of the expenseLine property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the expenseLine property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExpenseLine().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExpenseLineSummary }
         *
         *
         */
        public List<ExpenseLineSummary> getExpenseLine() {
            if (expenseLine == null) {
                expenseLine = new ArrayList<ExpenseLineSummary>();
            }
            return this.expenseLine;
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
     *         &lt;element name="expense-policy-violation" type="{}expense-policy-violation-summary" maxOccurs="unbounded" minOccurs="0"/>
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
        "expensePolicyViolation"
    })
    public static class ExpensePolicyViolations {

        @XmlElement(name = "expense-policy-violation")
        protected List<ExpensePolicyViolationSummary> expensePolicyViolation;

        /**
         * Gets the value of the expensePolicyViolation property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the expensePolicyViolation property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExpensePolicyViolation().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExpensePolicyViolationSummary }
         *
         *
         */
        public List<ExpensePolicyViolationSummary> getExpensePolicyViolation() {
            if (expensePolicyViolation == null) {
                expensePolicyViolation = new ArrayList<ExpensePolicyViolationSummary>();
            }
            return this.expensePolicyViolation;
        }

    }

}
