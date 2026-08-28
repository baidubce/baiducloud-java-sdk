package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FatherEthnic {
    /**
     * 父亲民族
     */
    private String words;

    public FatherEthnic setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "FatherEthnic{" + "words=" + words + "\n" + "}";
    }

}