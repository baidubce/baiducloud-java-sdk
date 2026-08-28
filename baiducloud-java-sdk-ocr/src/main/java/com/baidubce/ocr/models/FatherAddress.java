package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FatherAddress {
    /**
     * 父亲住址
     */
    private String words;

    public FatherAddress setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "FatherAddress{" + "words=" + words + "\n" + "}";
    }

}