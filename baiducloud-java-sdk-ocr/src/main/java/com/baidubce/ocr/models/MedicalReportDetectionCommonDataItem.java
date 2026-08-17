package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalReportDetectionCommonDataItem {
    /**
     * 字段名，包括：医院、报告单名称、姓名、性别、年龄、科室、标本种类、临床诊断、时间、临床症状、检查项目、标本情况、检查目的、建议、检查结果
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

    public MedicalReportDetectionCommonDataItem setWordName(String wordName) {
        this.wordName = wordName;
        return this;
    }

    public String getWordName() {
        return this.wordName;
    }

    public MedicalReportDetectionCommonDataItem setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public MedicalReportDetectionCommonDataItem setLocation(MedicalReportDetectionLocation location) {
        this.location = location;
        return this;
    }

    public MedicalReportDetectionLocation getLocation() {
        return this.location;
    }

    public MedicalReportDetectionCommonDataItem setProbability(MedicalReportDetectionProbability probability) {
        this.probability = probability;
        return this;
    }

    public MedicalReportDetectionProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "MedicalReportDetectionCommonDataItem{" + "wordName=" + wordName + "\n" + "word=" + word + "\n" + "location=" + location + "\n" + "probability=" + probability
                + "\n" + "}";
    }

}