package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultItem {
    /**
     * 识别结果字符串
     */
    private String word;

    /**
     * probability
     */
    private MultipleInvoiceProbability probability;

    /**
     * location
     */
    private MultipleInvoiceLocation location;

    public ResultItem setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public ResultItem setProbability(MultipleInvoiceProbability probability) {
        this.probability = probability;
        return this;
    }

    public MultipleInvoiceProbability getProbability() {
        return this.probability;
    }

    public ResultItem setLocation(MultipleInvoiceLocation location) {
        this.location = location;
        return this;
    }

    public MultipleInvoiceLocation getLocation() {
        return this.location;
    }

    @Override
    public String toString() {
        return "ResultItem{" + "word=" + word + "\n" + "probability=" + probability + "\n" + "location=" + location + "\n" + "}";
    }

}