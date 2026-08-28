package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MotherNationality {
    /**
     * 母亲国籍
     */
    private String words;

    public MotherNationality setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "MotherNationality{" + "words=" + words + "\n" + "}";
    }

}