package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BirthCounty {
    /**
     * 出生地点_县（区）
     */
    private String words;

    public BirthCounty setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "BirthCounty{" + "words=" + words + "\n" + "}";
    }

}