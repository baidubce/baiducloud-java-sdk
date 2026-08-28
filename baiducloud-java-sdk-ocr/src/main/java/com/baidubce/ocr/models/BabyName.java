package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BabyName {
    /**
     * 姓名
     */
    private String words;

    public BabyName setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "BabyName{" + "words=" + words + "\n" + "}";
    }

}