package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FatherID {
    /**
     * 父亲身份证号
     */
    private String words;

    public FatherID setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "FatherID{" + "words=" + words + "\n" + "}";
    }

}