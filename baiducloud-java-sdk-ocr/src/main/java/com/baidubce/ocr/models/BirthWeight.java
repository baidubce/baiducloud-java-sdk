package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BirthWeight {
    /**
     * 出生体重
     */
    private String words;

    public BirthWeight setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "BirthWeight{" + "words=" + words + "\n" + "}";
    }

}