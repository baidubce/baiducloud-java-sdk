package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalDetailWordsResult {
    /**
     * name
     */
    @JsonProperty("Name")
    private FieldValue name;

    /**
     * date
     */
    @JsonProperty("Date")
    private FieldValue date;

    /**
     * patientID
     */
    @JsonProperty("PatientID")
    private FieldValue patientID;

    /**
     * totalAmount
     */
    @JsonProperty("TotalAmount")
    private FieldValue totalAmount;

    /**
     * 项目明细
     */
    @JsonProperty("CostDetail")
    private List<List<CostDetailItem>> costDetail;

    public MedicalDetailWordsResult setName(FieldValue name) {
        this.name = name;
        return this;
    }

    public FieldValue getName() {
        return this.name;
    }

    public MedicalDetailWordsResult setDate(FieldValue date) {
        this.date = date;
        return this;
    }

    public FieldValue getDate() {
        return this.date;
    }

    public MedicalDetailWordsResult setPatientID(FieldValue patientID) {
        this.patientID = patientID;
        return this;
    }

    public FieldValue getPatientID() {
        return this.patientID;
    }

    public MedicalDetailWordsResult setTotalAmount(FieldValue totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public FieldValue getTotalAmount() {
        return this.totalAmount;
    }

    public MedicalDetailWordsResult setCostDetail(List<List<CostDetailItem>> costDetail) {
        this.costDetail = costDetail;
        return this;
    }

    public List<List<CostDetailItem>> getCostDetail() {
        return this.costDetail;
    }

    @Override
    public String toString() {
        return "MedicalDetailWordsResult{" + "name=" + name + "\n" + "date=" + date + "\n" + "patientID=" + patientID + "\n" + "totalAmount=" + totalAmount + "\n" + "costDetail="
                + costDetail + "\n" + "}";
    }

}