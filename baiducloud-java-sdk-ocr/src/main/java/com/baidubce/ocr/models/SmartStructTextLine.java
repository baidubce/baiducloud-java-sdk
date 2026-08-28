package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmartStructTextLine {
    /**
     * 文字行的文字结果
     */
    private String word;

    public SmartStructTextLine setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public String toString() {
        return "SmartStructTextLine{" + "word=" + word + "\n" + "}";
    }

}