package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MotherAge {
    /**
     * 母亲年龄
     */
    private String words;

    public MotherAge setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "MotherAge{" + "words=" + words + "\n" + "}";
    }

}