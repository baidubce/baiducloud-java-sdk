package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BabyBirthday {
    /**
     * 出生时间
     */
    private String words;

    public BabyBirthday setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "BabyBirthday{" + "words=" + words + "\n" + "}";
    }

}