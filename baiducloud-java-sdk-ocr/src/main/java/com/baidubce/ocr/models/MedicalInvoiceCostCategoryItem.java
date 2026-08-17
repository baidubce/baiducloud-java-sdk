package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalInvoiceCostCategoryItem {
    /**
     * 字段名，包括：收费项目、金额
     */
    private String name;

    /**
     * name字段对应的识别结果
     */
    private String word;

    /**
     * mediInfo
     */
    @JsonProperty("medi_info")
    private MediInfo mediInfo;

    public MedicalInvoiceCostCategoryItem setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public MedicalInvoiceCostCategoryItem setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public MedicalInvoiceCostCategoryItem setMediInfo(MediInfo mediInfo) {
        this.mediInfo = mediInfo;
        return this;
    }

    public MediInfo getMediInfo() {
        return this.mediInfo;
    }

    @Override
    public String toString() {
        return "MedicalInvoiceCostCategoryItem{" + "name=" + name + "\n" + "word=" + word + "\n" + "mediInfo=" + mediInfo + "\n" + "}";
    }

}