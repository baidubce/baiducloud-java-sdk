package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalRecordFieldValue {
    /**
     * 字段识别结果
     */
    private String word;

    /**
     * location
     */
    private MedicalRecordLocation location;

    /**
     * probability
     */
    private MedicalRecordProbability probability;

    public MedicalRecordFieldValue setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public MedicalRecordFieldValue setLocation(MedicalRecordLocation location) {
        this.location = location;
        return this;
    }

    public MedicalRecordLocation getLocation() {
        return this.location;
    }

    public MedicalRecordFieldValue setProbability(MedicalRecordProbability probability) {
        this.probability = probability;
        return this;
    }

    public MedicalRecordProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "MedicalRecordFieldValue{" + "word=" + word + "\n" + "location=" + location + "\n" + "probability=" + probability + "\n" + "}";
    }

}