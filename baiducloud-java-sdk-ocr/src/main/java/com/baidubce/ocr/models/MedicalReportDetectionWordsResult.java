package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalReportDetectionWordsResult {
    /**
     * 患者具体信息
     */
    @JsonProperty("CommonData")
    private List<MedicalReportDetectionCommonDataItem> commonData;

    /**
     * 检查项目
     */
    @JsonProperty("Item")
    private List<List<MedicalReportDetectionItemField>> item;

    public MedicalReportDetectionWordsResult setCommonData(List<MedicalReportDetectionCommonDataItem> commonData) {
        this.commonData = commonData;
        return this;
    }

    public List<MedicalReportDetectionCommonDataItem> getCommonData() {
        return this.commonData;
    }

    public MedicalReportDetectionWordsResult setItem(List<List<MedicalReportDetectionItemField>> item) {
        this.item = item;
        return this;
    }

    public List<List<MedicalReportDetectionItemField>> getItem() {
        return this.item;
    }

    @Override
    public String toString() {
        return "MedicalReportDetectionWordsResult{" + "commonData=" + commonData + "\n" + "item=" + item + "\n" + "}";
    }

}