package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BirthCity {
    /**
     * 出生地点_市
     */
    private String words;

    public BirthCity setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "BirthCity{" + "words=" + words + "\n" + "}";
    }

}