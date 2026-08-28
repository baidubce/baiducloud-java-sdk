package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FatherAge {
    /**
     * 父亲年龄
     */
    private String words;

    public FatherAge setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "FatherAge{" + "words=" + words + "\n" + "}";
    }

}