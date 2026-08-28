package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HealthReportWordResult {
    /**
     * 字段名，包括：医院名称、报告名称、姓名、性别、年龄、科室、临床诊断、报告日期、检查部位、检查方法、检查所见、检查提示、建议、肉眼可见
     */
    @JsonProperty("word_name")
    private String wordName;

    /**
     * word_name字段对应的识别结果
     */
    private String word;

    /**
     * location
     */
    private HealthReportLocation location;

    /**
     * probability
     */
    private HealthReportProbability probability;

    public HealthReportWordResult setWordName(String wordName) {
        this.wordName = wordName;
        return this;
    }

    public String getWordName() {
        return this.wordName;
    }

    public HealthReportWordResult setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public HealthReportWordResult setLocation(HealthReportLocation location) {
        this.location = location;
        return this;
    }

    public HealthReportLocation getLocation() {
        return this.location;
    }

    public HealthReportWordResult setProbability(HealthReportProbability probability) {
        this.probability = probability;
        return this;
    }

    public HealthReportProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "HealthReportWordResult{" + "wordName=" + wordName + "\n" + "word=" + word + "\n" + "location=" + location + "\n" + "probability=" + probability + "\n" + "}";
    }

}