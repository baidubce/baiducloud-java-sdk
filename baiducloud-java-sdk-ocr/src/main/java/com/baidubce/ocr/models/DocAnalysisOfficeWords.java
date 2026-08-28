package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisOfficeWords {
    /**
     * 整行的识别结果
     */
    private String word;

    /**
     * lineProbability
     */
    @JsonProperty("line_probability")
    private DocAnalysisOfficeLineProbability lineProbability;

    /**
     * 每行的四角点坐标，自左上角点顺时针排列，disp_line_poly=true时返回
     */
    @JsonProperty("poly_location")
    private List<DocAnalysisOfficePoint> polyLocation;

    /**
     * wordsLocation
     */
    @JsonProperty("words_location")
    private DocAnaysisOfficeLocation wordsLocation;

    public DocAnalysisOfficeWords setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public DocAnalysisOfficeWords setLineProbability(DocAnalysisOfficeLineProbability lineProbability) {
        this.lineProbability = lineProbability;
        return this;
    }

    public DocAnalysisOfficeLineProbability getLineProbability() {
        return this.lineProbability;
    }

    public DocAnalysisOfficeWords setPolyLocation(List<DocAnalysisOfficePoint> polyLocation) {
        this.polyLocation = polyLocation;
        return this;
    }

    public List<DocAnalysisOfficePoint> getPolyLocation() {
        return this.polyLocation;
    }

    public DocAnalysisOfficeWords setWordsLocation(DocAnaysisOfficeLocation wordsLocation) {
        this.wordsLocation = wordsLocation;
        return this;
    }

    public DocAnaysisOfficeLocation getWordsLocation() {
        return this.wordsLocation;
    }

    @Override
    public String toString() {
        return "DocAnalysisOfficeWords{" + "word=" + word + "\n" + "lineProbability=" + lineProbability + "\n" + "polyLocation=" + polyLocation + "\n" + "wordsLocation="
                + wordsLocation + "\n" + "}";
    }

}