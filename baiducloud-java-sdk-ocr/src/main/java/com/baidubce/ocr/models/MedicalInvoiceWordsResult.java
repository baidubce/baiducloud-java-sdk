package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalInvoiceWordsResult {
    /**
     * businessNum
     */
    @JsonProperty("BusinessNum")
    private MedicalInvoiceFieldValue businessNum;

    /**
     * invoiceNum
     */
    @JsonProperty("InvoiceNum")
    private MedicalInvoiceFieldValue invoiceNum;

    /**
     * hospitalNum
     */
    @JsonProperty("HospitalNum")
    private MedicalInvoiceFieldValue hospitalNum;

    /**
     * hospitalName
     */
    @JsonProperty("HospitalName")
    private MedicalInvoiceFieldValue hospitalName;

    /**
     * recordNum
     */
    @JsonProperty("RecordNum")
    private MedicalInvoiceFieldValue recordNum;

    /**
     * hospitalDay
     */
    @JsonProperty("HospitalDay")
    private MedicalInvoiceFieldValue hospitalDay;

    /**
     * admissionDate
     */
    @JsonProperty("AdmissionDate")
    private MedicalInvoiceFieldValue admissionDate;

    /**
     * dischargeDate
     */
    @JsonProperty("DischargeDate")
    private MedicalInvoiceFieldValue dischargeDate;

    /**
     * dischargeDepartment
     */
    @JsonProperty("DischargeDepartment")
    private MedicalInvoiceFieldValue dischargeDepartment;

    /**
     * name
     */
    @JsonProperty("Name")
    private MedicalInvoiceFieldValue name;

    /**
     * sex
     */
    @JsonProperty("Sex")
    private MedicalInvoiceFieldValue sex;

    /**
     * hospitalType
     */
    @JsonProperty("HospitalType")
    private MedicalInvoiceFieldValue hospitalType;

    /**
     * socialSecurityNum
     */
    @JsonProperty("SocialSecurityNum")
    private MedicalInvoiceFieldValue socialSecurityNum;

    /**
     * insuranceType
     */
    @JsonProperty("InsuranceType")
    private MedicalInvoiceFieldValue insuranceType;

    /**
     * chargingUnit
     */
    @JsonProperty("ChargingUnit")
    private MedicalInvoiceFieldValue chargingUnit;

    /**
     * payee
     */
    @JsonProperty("Payee")
    private MedicalInvoiceFieldValue payee;

    /**
     * date
     */
    @JsonProperty("Date")
    private MedicalInvoiceFieldValue date;

    /**
     * amountInWords
     */
    @JsonProperty("AmountInWords")
    private MedicalInvoiceFieldValue amountInWords;

    /**
     * amountInFiguers
     */
    @JsonProperty("AmountInFiguers")
    private MedicalInvoiceFieldValue amountInFiguers;

    /**
     * insurancePayment
     */
    @JsonProperty("InsurancePayment")
    private MedicalInvoiceFieldValue insurancePayment;

    /**
     * personalPayment
     */
    @JsonProperty("PersonalPayment")
    private MedicalInvoiceFieldValue personalPayment;

    /**
     * prepayAmount
     */
    @JsonProperty("PrepayAmount")
    private MedicalInvoiceFieldValue prepayAmount;

    /**
     * paymentAmount
     */
    @JsonProperty("PaymentAmount")
    private MedicalInvoiceFieldValue paymentAmount;

    /**
     * refundAmount
     */
    @JsonProperty("RefundAmount")
    private MedicalInvoiceFieldValue refundAmount;

    /**
     * clinicNum
     */
    @JsonProperty("ClinicNum")
    private MedicalInvoiceFieldValue clinicNum;

    /**
     * 项目大类：治疗费、检查费等项目大类
     */
    @JsonProperty("CostCategories")
    private List<List<MedicalInvoiceCostCategoryItem>> costCategories;

    /**
     * 明细类别：药物/检查的明细类别
     */
    @JsonProperty("CostDetail")
    private List<List<MedicalInvoiceCostDetailItem>> costDetail;

    /**
     * 地区字段：根据省市返回该地区特有的字段
     */
    @JsonProperty("RegionSupplement")
    private List<MedicalInvoiceRegionSupplementItem> regionSupplement;

    public MedicalInvoiceWordsResult setBusinessNum(MedicalInvoiceFieldValue businessNum) {
        this.businessNum = businessNum;
        return this;
    }

    public MedicalInvoiceFieldValue getBusinessNum() {
        return this.businessNum;
    }

    public MedicalInvoiceWordsResult setInvoiceNum(MedicalInvoiceFieldValue invoiceNum) {
        this.invoiceNum = invoiceNum;
        return this;
    }

    public MedicalInvoiceFieldValue getInvoiceNum() {
        return this.invoiceNum;
    }

    public MedicalInvoiceWordsResult setHospitalNum(MedicalInvoiceFieldValue hospitalNum) {
        this.hospitalNum = hospitalNum;
        return this;
    }

    public MedicalInvoiceFieldValue getHospitalNum() {
        return this.hospitalNum;
    }

    public MedicalInvoiceWordsResult setHospitalName(MedicalInvoiceFieldValue hospitalName) {
        this.hospitalName = hospitalName;
        return this;
    }

    public MedicalInvoiceFieldValue getHospitalName() {
        return this.hospitalName;
    }

    public MedicalInvoiceWordsResult setRecordNum(MedicalInvoiceFieldValue recordNum) {
        this.recordNum = recordNum;
        return this;
    }

    public MedicalInvoiceFieldValue getRecordNum() {
        return this.recordNum;
    }

    public MedicalInvoiceWordsResult setHospitalDay(MedicalInvoiceFieldValue hospitalDay) {
        this.hospitalDay = hospitalDay;
        return this;
    }

    public MedicalInvoiceFieldValue getHospitalDay() {
        return this.hospitalDay;
    }

    public MedicalInvoiceWordsResult setAdmissionDate(MedicalInvoiceFieldValue admissionDate) {
        this.admissionDate = admissionDate;
        return this;
    }

    public MedicalInvoiceFieldValue getAdmissionDate() {
        return this.admissionDate;
    }

    public MedicalInvoiceWordsResult setDischargeDate(MedicalInvoiceFieldValue dischargeDate) {
        this.dischargeDate = dischargeDate;
        return this;
    }

    public MedicalInvoiceFieldValue getDischargeDate() {
        return this.dischargeDate;
    }

    public MedicalInvoiceWordsResult setDischargeDepartment(MedicalInvoiceFieldValue dischargeDepartment) {
        this.dischargeDepartment = dischargeDepartment;
        return this;
    }

    public MedicalInvoiceFieldValue getDischargeDepartment() {
        return this.dischargeDepartment;
    }

    public MedicalInvoiceWordsResult setName(MedicalInvoiceFieldValue name) {
        this.name = name;
        return this;
    }

    public MedicalInvoiceFieldValue getName() {
        return this.name;
    }

    public MedicalInvoiceWordsResult setSex(MedicalInvoiceFieldValue sex) {
        this.sex = sex;
        return this;
    }

    public MedicalInvoiceFieldValue getSex() {
        return this.sex;
    }

    public MedicalInvoiceWordsResult setHospitalType(MedicalInvoiceFieldValue hospitalType) {
        this.hospitalType = hospitalType;
        return this;
    }

    public MedicalInvoiceFieldValue getHospitalType() {
        return this.hospitalType;
    }

    public MedicalInvoiceWordsResult setSocialSecurityNum(MedicalInvoiceFieldValue socialSecurityNum) {
        this.socialSecurityNum = socialSecurityNum;
        return this;
    }

    public MedicalInvoiceFieldValue getSocialSecurityNum() {
        return this.socialSecurityNum;
    }

    public MedicalInvoiceWordsResult setInsuranceType(MedicalInvoiceFieldValue insuranceType) {
        this.insuranceType = insuranceType;
        return this;
    }

    public MedicalInvoiceFieldValue getInsuranceType() {
        return this.insuranceType;
    }

    public MedicalInvoiceWordsResult setChargingUnit(MedicalInvoiceFieldValue chargingUnit) {
        this.chargingUnit = chargingUnit;
        return this;
    }

    public MedicalInvoiceFieldValue getChargingUnit() {
        return this.chargingUnit;
    }

    public MedicalInvoiceWordsResult setPayee(MedicalInvoiceFieldValue payee) {
        this.payee = payee;
        return this;
    }

    public MedicalInvoiceFieldValue getPayee() {
        return this.payee;
    }

    public MedicalInvoiceWordsResult setDate(MedicalInvoiceFieldValue date) {
        this.date = date;
        return this;
    }

    public MedicalInvoiceFieldValue getDate() {
        return this.date;
    }

    public MedicalInvoiceWordsResult setAmountInWords(MedicalInvoiceFieldValue amountInWords) {
        this.amountInWords = amountInWords;
        return this;
    }

    public MedicalInvoiceFieldValue getAmountInWords() {
        return this.amountInWords;
    }

    public MedicalInvoiceWordsResult setAmountInFiguers(MedicalInvoiceFieldValue amountInFiguers) {
        this.amountInFiguers = amountInFiguers;
        return this;
    }

    public MedicalInvoiceFieldValue getAmountInFiguers() {
        return this.amountInFiguers;
    }

    public MedicalInvoiceWordsResult setInsurancePayment(MedicalInvoiceFieldValue insurancePayment) {
        this.insurancePayment = insurancePayment;
        return this;
    }

    public MedicalInvoiceFieldValue getInsurancePayment() {
        return this.insurancePayment;
    }

    public MedicalInvoiceWordsResult setPersonalPayment(MedicalInvoiceFieldValue personalPayment) {
        this.personalPayment = personalPayment;
        return this;
    }

    public MedicalInvoiceFieldValue getPersonalPayment() {
        return this.personalPayment;
    }

    public MedicalInvoiceWordsResult setPrepayAmount(MedicalInvoiceFieldValue prepayAmount) {
        this.prepayAmount = prepayAmount;
        return this;
    }

    public MedicalInvoiceFieldValue getPrepayAmount() {
        return this.prepayAmount;
    }

    public MedicalInvoiceWordsResult setPaymentAmount(MedicalInvoiceFieldValue paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }

    public MedicalInvoiceFieldValue getPaymentAmount() {
        return this.paymentAmount;
    }

    public MedicalInvoiceWordsResult setRefundAmount(MedicalInvoiceFieldValue refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }

    public MedicalInvoiceFieldValue getRefundAmount() {
        return this.refundAmount;
    }

    public MedicalInvoiceWordsResult setClinicNum(MedicalInvoiceFieldValue clinicNum) {
        this.clinicNum = clinicNum;
        return this;
    }

    public MedicalInvoiceFieldValue getClinicNum() {
        return this.clinicNum;
    }

    public MedicalInvoiceWordsResult setCostCategories(List<List<MedicalInvoiceCostCategoryItem>> costCategories) {
        this.costCategories = costCategories;
        return this;
    }

    public List<List<MedicalInvoiceCostCategoryItem>> getCostCategories() {
        return this.costCategories;
    }

    public MedicalInvoiceWordsResult setCostDetail(List<List<MedicalInvoiceCostDetailItem>> costDetail) {
        this.costDetail = costDetail;
        return this;
    }

    public List<List<MedicalInvoiceCostDetailItem>> getCostDetail() {
        return this.costDetail;
    }

    public MedicalInvoiceWordsResult setRegionSupplement(List<MedicalInvoiceRegionSupplementItem> regionSupplement) {
        this.regionSupplement = regionSupplement;
        return this;
    }

    public List<MedicalInvoiceRegionSupplementItem> getRegionSupplement() {
        return this.regionSupplement;
    }

    @Override
    public String toString() {
        return "MedicalInvoiceWordsResult{" + "businessNum=" + businessNum + "\n" + "invoiceNum=" + invoiceNum + "\n" + "hospitalNum=" + hospitalNum + "\n" + "hospitalName="
                + hospitalName + "\n" + "recordNum=" + recordNum + "\n" + "hospitalDay=" + hospitalDay + "\n" + "admissionDate=" + admissionDate + "\n" + "dischargeDate="
                + dischargeDate + "\n" + "dischargeDepartment=" + dischargeDepartment + "\n" + "name=" + name + "\n" + "sex=" + sex + "\n" + "hospitalType=" + hospitalType + "\n"
                + "socialSecurityNum=" + socialSecurityNum + "\n" + "insuranceType=" + insuranceType + "\n" + "chargingUnit=" + chargingUnit + "\n" + "payee=" + payee + "\n"
                + "date=" + date + "\n" + "amountInWords=" + amountInWords + "\n" + "amountInFiguers=" + amountInFiguers + "\n" + "insurancePayment=" + insurancePayment + "\n"
                + "personalPayment=" + personalPayment + "\n" + "prepayAmount=" + prepayAmount + "\n" + "paymentAmount=" + paymentAmount + "\n" + "refundAmount=" + refundAmount
                + "\n" + "clinicNum=" + clinicNum + "\n" + "costCategories=" + costCategories + "\n" + "costDetail=" + costDetail + "\n" + "regionSupplement=" + regionSupplement
                + "\n" + "}";
    }

}