package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SealField {
    /**
     * 识别内容
     */
    private String words;

    /**
     * 识别内容的置信度
     */
    private Double probability;

    public SealField setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    public SealField setProbability(Double probability) {
        this.probability = probability;
        return this;
    }

    public Double getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "SealField{" + "words=" + words + "\n" + "probability=" + probability + "\n" + "}";
    }

}