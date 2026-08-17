package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalInvoiceFieldValue {
    /**
     * 字段识别结果
     */
    private String word;

    /**
     * location
     */
    private MedicalInvoiceLocation location;

    /**
     * probability
     */
    private MedicalInvoiceProbability probability;

    public MedicalInvoiceFieldValue setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public MedicalInvoiceFieldValue setLocation(MedicalInvoiceLocation location) {
        this.location = location;
        return this;
    }

    public MedicalInvoiceLocation getLocation() {
        return this.location;
    }

    public MedicalInvoiceFieldValue setProbability(MedicalInvoiceProbability probability) {
        this.probability = probability;
        return this;
    }

    public MedicalInvoiceProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "MedicalInvoiceFieldValue{" + "word=" + word + "\n" + "location=" + location + "\n" + "probability=" + probability + "\n" + "}";
    }

}