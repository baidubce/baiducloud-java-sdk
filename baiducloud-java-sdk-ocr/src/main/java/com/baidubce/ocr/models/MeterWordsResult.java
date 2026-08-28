package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MeterWordsResult {
    /**
     * 识别结果字符串
     */
    private String words;

    /**
     * location
     */
    private MeterLocation location;

    /**
     * probability
     */
    private MeterProbability probability;

    /**
     * 外接四边形的4个点坐标，当请求 poly_location=true 时存在
     */
    @JsonProperty("poly_location")
    private List<MeterPolyPoint> polyLocation;

    public MeterWordsResult setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    public MeterWordsResult setLocation(MeterLocation location) {
        this.location = location;
        return this;
    }

    public MeterLocation getLocation() {
        return this.location;
    }

    public MeterWordsResult setProbability(MeterProbability probability) {
        this.probability = probability;
        return this;
    }

    public MeterProbability getProbability() {
        return this.probability;
    }

    public MeterWordsResult setPolyLocation(List<MeterPolyPoint> polyLocation) {
        this.polyLocation = polyLocation;
        return this;
    }

    public List<MeterPolyPoint> getPolyLocation() {
        return this.polyLocation;
    }

    @Override
    public String toString() {
        return "MeterWordsResult{" + "words=" + words + "\n" + "location=" + location + "\n" + "probability=" + probability + "\n" + "polyLocation=" + polyLocation + "\n" + "}";
    }

}