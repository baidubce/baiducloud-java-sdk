package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BabySex {
    /**
     * 性别
     */
    private String words;

    public BabySex setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "BabySex{" + "words=" + words + "\n" + "}";
    }

}