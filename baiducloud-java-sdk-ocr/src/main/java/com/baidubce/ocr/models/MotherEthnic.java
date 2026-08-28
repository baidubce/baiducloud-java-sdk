package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MotherEthnic {
    /**
     * 母亲民族
     */
    private String words;

    public MotherEthnic setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "MotherEthnic{" + "words=" + words + "\n" + "}";
    }

}