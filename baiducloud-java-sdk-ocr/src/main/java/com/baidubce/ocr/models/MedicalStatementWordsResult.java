package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalStatementWordsResult {
    /**
     * admissionDate
     */
    @JsonProperty("AdmissionDate")
    private MedicalStatementFieldValue admissionDate;

    /**
     * dischargeDate
     */
    @JsonProperty("DischargeDate")
    private MedicalStatementFieldValue dischargeDate;

    /**
     * name
     */
    @JsonProperty("Name")
    private MedicalStatementFieldValue name;

    /**
     * amountInFiguers
     */
    @JsonProperty("AmountInFiguers")
    private MedicalStatementFieldValue amountInFiguers;

    /**
     * selfPaymentAmount
     */
    @JsonProperty("SelfPaymentAmount")
    private MedicalStatementFieldValue selfPaymentAmount;

    /**
     * medicalInsuranceAmount
     */
    @JsonProperty("MedicalInsuranceAmount")
    private MedicalStatementFieldValue medicalInsuranceAmount;

    public MedicalStatementWordsResult setAdmissionDate(MedicalStatementFieldValue admissionDate) {
        this.admissionDate = admissionDate;
        return this;
    }

    public MedicalStatementFieldValue getAdmissionDate() {
        return this.admissionDate;
    }

    public MedicalStatementWordsResult setDischargeDate(MedicalStatementFieldValue dischargeDate) {
        this.dischargeDate = dischargeDate;
        return this;
    }

    public MedicalStatementFieldValue getDischargeDate() {
        return this.dischargeDate;
    }

    public MedicalStatementWordsResult setName(MedicalStatementFieldValue name) {
        this.name = name;
        return this;
    }

    public MedicalStatementFieldValue getName() {
        return this.name;
    }

    public MedicalStatementWordsResult setAmountInFiguers(MedicalStatementFieldValue amountInFiguers) {
        this.amountInFiguers = amountInFiguers;
        return this;
    }

    public MedicalStatementFieldValue getAmountInFiguers() {
        return this.amountInFiguers;
    }

    public MedicalStatementWordsResult setSelfPaymentAmount(MedicalStatementFieldValue selfPaymentAmount) {
        this.selfPaymentAmount = selfPaymentAmount;
        return this;
    }

    public MedicalStatementFieldValue getSelfPaymentAmount() {
        return this.selfPaymentAmount;
    }

    public MedicalStatementWordsResult setMedicalInsuranceAmount(MedicalStatementFieldValue medicalInsuranceAmount) {
        this.medicalInsuranceAmount = medicalInsuranceAmount;
        return this;
    }

    public MedicalStatementFieldValue getMedicalInsuranceAmount() {
        return this.medicalInsuranceAmount;
    }

    @Override
    public String toString() {
        return "MedicalStatementWordsResult{" + "admissionDate=" + admissionDate + "\n" + "dischargeDate=" + dischargeDate + "\n" + "name=" + name + "\n" + "amountInFiguers="
                + amountInFiguers + "\n" + "selfPaymentAmount=" + selfPaymentAmount + "\n" + "medicalInsuranceAmount=" + medicalInsuranceAmount + "\n" + "}";
    }

}