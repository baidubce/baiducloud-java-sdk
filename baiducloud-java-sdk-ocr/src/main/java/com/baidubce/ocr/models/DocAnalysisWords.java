package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisWords {
    /**
     * 整行的识别结果
     */
    private String word;

    /**
     * wordsLocation
     */
    @JsonProperty("words_location")
    private WordsLocation wordsLocation;

    /**
     * polyLocation
     */
    @JsonProperty("poly_location")
    private DocAnalysisPolyLocation polyLocation;

    /**
     * lineProbability
     */
    @JsonProperty("line_probability")
    private DocAnalysisLineProbability lineProbability;

    public DocAnalysisWords setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public DocAnalysisWords setWordsLocation(WordsLocation wordsLocation) {
        this.wordsLocation = wordsLocation;
        return this;
    }

    public WordsLocation getWordsLocation() {
        return this.wordsLocation;
    }

    public DocAnalysisWords setPolyLocation(DocAnalysisPolyLocation polyLocation) {
        this.polyLocation = polyLocation;
        return this;
    }

    public DocAnalysisPolyLocation getPolyLocation() {
        return this.polyLocation;
    }

    public DocAnalysisWords setLineProbability(DocAnalysisLineProbability lineProbability) {
        this.lineProbability = lineProbability;
        return this;
    }

    public DocAnalysisLineProbability getLineProbability() {
        return this.lineProbability;
    }

    @Override
    public String toString() {
        return "DocAnalysisWords{" + "word=" + word + "\n" + "wordsLocation=" + wordsLocation + "\n" + "polyLocation=" + polyLocation + "\n" + "lineProbability=" + lineProbability
                + "\n" + "}";
    }

}