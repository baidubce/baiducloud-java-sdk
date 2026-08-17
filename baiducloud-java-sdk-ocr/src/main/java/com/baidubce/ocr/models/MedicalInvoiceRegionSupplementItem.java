package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalInvoiceRegionSupplementItem {
    /**
     * 字段名，不同省市返回字段不同
     */
    private String name;

    /**
     * name字段对应的识别结果
     */
    private String word;

    /**
     * probability
     */
    private MedicalInvoiceProbability probability;

    /**
     * position
     */
    private MedicalInvoicePosition position;

    public MedicalInvoiceRegionSupplementItem setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public MedicalInvoiceRegionSupplementItem setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public MedicalInvoiceRegionSupplementItem setProbability(MedicalInvoiceProbability probability) {
        this.probability = probability;
        return this;
    }

    public MedicalInvoiceProbability getProbability() {
        return this.probability;
    }

    public MedicalInvoiceRegionSupplementItem setPosition(MedicalInvoicePosition position) {
        this.position = position;
        return this;
    }

    public MedicalInvoicePosition getPosition() {
        return this.position;
    }

    @Override
    public String toString() {
        return "MedicalInvoiceRegionSupplementItem{" + "name=" + name + "\n" + "word=" + word + "\n" + "probability=" + probability + "\n" + "position=" + position + "\n" + "}";
    }

}