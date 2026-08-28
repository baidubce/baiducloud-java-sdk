package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsedVehicleInvoiceWordItem {
    /**
     * 识别结果字符串
     */
    private String word;

    public UsedVehicleInvoiceWordItem setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public String toString() {
        return "UsedVehicleInvoiceWordItem{" + "word=" + word + "\n" + "}";
    }

}