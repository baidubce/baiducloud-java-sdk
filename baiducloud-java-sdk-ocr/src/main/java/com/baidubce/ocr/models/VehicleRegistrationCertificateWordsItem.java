package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleRegistrationCertificateWordsItem {
    /**
     * 识别结果
     */
    private String words;

    public VehicleRegistrationCertificateWordsItem setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "VehicleRegistrationCertificateWordsItem{" + "words=" + words + "\n" + "}";
    }

}