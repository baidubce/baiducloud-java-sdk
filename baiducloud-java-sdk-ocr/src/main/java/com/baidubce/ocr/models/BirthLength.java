package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BirthLength {
    /**
     * 出生身长
     */
    private String words;

    public BirthLength setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "BirthLength{" + "words=" + words + "\n" + "}";
    }

}