package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalPrescriptionCostDetailItem {
    /**
     * 字段名，包括：清单项目名称、规格、单价、数量、金额、频率、用量、用法
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

    public MedicalPrescriptionCostDetailItem setWordName(String wordName) {
        this.wordName = wordName;
        return this;
    }

    public String getWordName() {
        return this.wordName;
    }

    public MedicalPrescriptionCostDetailItem setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public MedicalPrescriptionCostDetailItem setLocation(MedicalPrescriptionLocation location) {
        this.location = location;
        return this;
    }

    public MedicalPrescriptionLocation getLocation() {
        return this.location;
    }

    public MedicalPrescriptionCostDetailItem setProbability(MedicalPrescriptionProbability probability) {
        this.probability = probability;
        return this;
    }

    public MedicalPrescriptionProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "MedicalPrescriptionCostDetailItem{" + "wordName=" + wordName + "\n" + "word=" + word + "\n" + "location=" + location + "\n" + "probability=" + probability + "\n"
                + "}";
    }

}