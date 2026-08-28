package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GestationalAge {
    /**
     * 出生孕周
     */
    private String words;

    public GestationalAge setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "GestationalAge{" + "words=" + words + "\n" + "}";
    }

}