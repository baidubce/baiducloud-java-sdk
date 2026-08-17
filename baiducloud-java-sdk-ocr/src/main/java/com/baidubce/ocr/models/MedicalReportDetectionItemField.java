package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalReportDetectionItemField {
    /**
     * 字段名，包括：项目名称、项目代号、结果、单位、参考区间、结果提示、测试方法、仪器类型
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
    private MedicalReportDetectionLocation location;

    /**
     * probability
     */
    private MedicalReportDetectionProbability probability;

    public MedicalReportDetectionItemField setWordName(String wordName) {
        this.wordName = wordName;
        return this;
    }

    public String getWordName() {
        return this.wordName;
    }

    public MedicalReportDetectionItemField setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public MedicalReportDetectionItemField setLocation(MedicalReportDetectionLocation location) {
        this.location = location;
        return this;
    }

    public MedicalReportDetectionLocation getLocation() {
        return this.location;
    }

    public MedicalReportDetectionItemField setProbability(MedicalReportDetectionProbability probability) {
        this.probability = probability;
        return this;
    }

    public MedicalReportDetectionProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "MedicalReportDetectionItemField{" + "wordName=" + wordName + "\n" + "word=" + word + "\n" + "location=" + location + "\n" + "probability=" + probability + "\n"
                + "}";
    }

}