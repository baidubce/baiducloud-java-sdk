package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalSummaryWordResult {
    /**
     * 字段名，包括：科室、姓名、性别、年龄、入院时间、出院时间、住院天数、入院诊断、出院诊断、出院医嘱
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
    private MedicalSummaryLocation location;

    /**
     * probability
     */
    private MedicalSummaryProbability probability;

    public MedicalSummaryWordResult setWordName(String wordName) {
        this.wordName = wordName;
        return this;
    }

    public String getWordName() {
        return this.wordName;
    }

    public MedicalSummaryWordResult setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public MedicalSummaryWordResult setLocation(MedicalSummaryLocation location) {
        this.location = location;
        return this;
    }

    public MedicalSummaryLocation getLocation() {
        return this.location;
    }

    public MedicalSummaryWordResult setProbability(MedicalSummaryProbability probability) {
        this.probability = probability;
        return this;
    }

    public MedicalSummaryProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "MedicalSummaryWordResult{" + "wordName=" + wordName + "\n" + "word=" + word + "\n" + "location=" + location + "\n" + "probability=" + probability + "\n" + "}";
    }

}