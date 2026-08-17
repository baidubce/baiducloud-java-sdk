package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalStatementFieldValue {
    /**
     * 字段识别结果
     */
    private String word;

    /**
     * location
     */
    private MedicalStatementLocation location;

    /**
     * probability
     */
    private MedicalStatementProbability probability;

    public MedicalStatementFieldValue setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public MedicalStatementFieldValue setLocation(MedicalStatementLocation location) {
        this.location = location;
        return this;
    }

    public MedicalStatementLocation getLocation() {
        return this.location;
    }

    public MedicalStatementFieldValue setProbability(MedicalStatementProbability probability) {
        this.probability = probability;
        return this;
    }

    public MedicalStatementProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "MedicalStatementFieldValue{" + "word=" + word + "\n" + "location=" + location + "\n" + "probability=" + probability + "\n" + "}";
    }

}