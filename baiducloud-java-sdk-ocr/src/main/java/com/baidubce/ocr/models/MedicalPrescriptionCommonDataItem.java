package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalPrescriptionCommonDataItem {
    /**
     * 字段名，包括：姓名、日期、病人ID、科别
     */
    @JsonProperty("word_name")
    private String wordName;

    /**
     * 字段识别结果
     */
    private String word;

    /**
     * location
     */
    private MedicalPrescriptionLocation location;

    /**
     * probability
     */
    private MedicalPrescriptionProbability probability;

    public MedicalPrescriptionCommonDataItem setWordName(String wordName) {
        this.wordName = wordName;
        return this;
    }

    public String getWordName() {
        return this.wordName;
    }

    public MedicalPrescriptionCommonDataItem setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public MedicalPrescriptionCommonDataItem setLocation(MedicalPrescriptionLocation location) {
        this.location = location;
        return this;
    }

    public MedicalPrescriptionLocation getLocation() {
        return this.location;
    }

    public MedicalPrescriptionCommonDataItem setProbability(MedicalPrescriptionProbability probability) {
        this.probability = probability;
        return this;
    }

    public MedicalPrescriptionProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "MedicalPrescriptionCommonDataItem{" + "wordName=" + wordName + "\n" + "word=" + word + "\n" + "location=" + location + "\n" + "probability=" + probability + "\n"
                + "}";
    }

}