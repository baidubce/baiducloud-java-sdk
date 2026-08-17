package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalPrescriptionWordsResult {
    /**
     * 患者个人信息
     */
    @JsonProperty("CommonData")
    private List<MedicalPrescriptionCommonDataItem> commonData;

    /**
     * 具体项目
     */
    @JsonProperty("CostDetail")
    private List<List<MedicalPrescriptionCostDetailItem>> costDetail;

    public MedicalPrescriptionWordsResult setCommonData(List<MedicalPrescriptionCommonDataItem> commonData) {
        this.commonData = commonData;
        return this;
    }

    public List<MedicalPrescriptionCommonDataItem> getCommonData() {
        return this.commonData;
    }

    public MedicalPrescriptionWordsResult setCostDetail(List<List<MedicalPrescriptionCostDetailItem>> costDetail) {
        this.costDetail = costDetail;
        return this;
    }

    public List<List<MedicalPrescriptionCostDetailItem>> getCostDetail() {
        return this.costDetail;
    }

    @Override
    public String toString() {
        return "MedicalPrescriptionWordsResult{" + "commonData=" + commonData + "\n" + "costDetail=" + costDetail + "\n" + "}";
    }

}