package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FieldValue {
    /**
     * 字段识别结果
     */
    private String word;

    public FieldValue setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public String toString() {
        return "FieldValue{" + "word=" + word + "\n" + "}";
    }

}