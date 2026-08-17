package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalInvoiceCostDetailItem {
    /**
     * 字段名，包括：编码、项目、规格、数量、单价、金额
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

    public MedicalInvoiceCostDetailItem setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public MedicalInvoiceCostDetailItem setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public MedicalInvoiceCostDetailItem setMediInfo(MediInfo mediInfo) {
        this.mediInfo = mediInfo;
        return this;
    }

    public MediInfo getMediInfo() {
        return this.mediInfo;
    }

    @Override
    public String toString() {
        return "MedicalInvoiceCostDetailItem{" + "name=" + name + "\n" + "word=" + word + "\n" + "mediInfo=" + mediInfo + "\n" + "}";
    }

}