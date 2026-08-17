package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CostDetailItem {
    /**
     * 字段名，包括：项目类型、项目名称、单价、数量、规格、金额
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
    private MedicalLocation location;

    /**
     * probability
     */
    private MedicalDetailProbability probability;

    public CostDetailItem setWordName(String wordName) {
        this.wordName = wordName;
        return this;
    }

    public String getWordName() {
        return this.wordName;
    }

    public CostDetailItem setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public CostDetailItem setLocation(MedicalLocation location) {
        this.location = location;
        return this;
    }

    public MedicalLocation getLocation() {
        return this.location;
    }

    public CostDetailItem setProbability(MedicalDetailProbability probability) {
        this.probability = probability;
        return this;
    }

    public MedicalDetailProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "CostDetailItem{" + "wordName=" + wordName + "\n" + "word=" + word + "\n" + "location=" + location + "\n" + "probability=" + probability + "\n" + "}";
    }

}