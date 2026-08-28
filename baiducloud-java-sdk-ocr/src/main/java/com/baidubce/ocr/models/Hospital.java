package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Hospital {
    /**
     * 出生医院/医疗机构名称
     */
    private String words;

    public Hospital setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "Hospital{" + "words=" + words + "\n" + "}";
    }

}