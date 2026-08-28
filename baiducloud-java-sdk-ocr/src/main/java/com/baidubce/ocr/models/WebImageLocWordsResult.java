package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebImageLocWordsResult {
    /**
     * 整行的识别结果
     */
    private String words;

    /**
     * location
     */
    private WebImageLocLocation location;

    /**
     * probability
     */
    private WebImageLocProbability probability;

    /**
     * 当 probability=true 时返回该字段。文字所在区域的外接矩形的4个点坐标信息
     */
    @JsonProperty("poly_location")
    private List<WebImageLocPolyLocation> polyLocation;

    /**
     * 单字符结果，当 recognize_granularity=small 时返回该字段
     */
    private List<WebImageLocChar> chars;

    public WebImageLocWordsResult setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    public WebImageLocWordsResult setLocation(WebImageLocLocation location) {
        this.location = location;
        return this;
    }

    public WebImageLocLocation getLocation() {
        return this.location;
    }

    public WebImageLocWordsResult setProbability(WebImageLocProbability probability) {
        this.probability = probability;
        return this;
    }

    public WebImageLocProbability getProbability() {
        return this.probability;
    }

    public WebImageLocWordsResult setPolyLocation(List<WebImageLocPolyLocation> polyLocation) {
        this.polyLocation = polyLocation;
        return this;
    }

    public List<WebImageLocPolyLocation> getPolyLocation() {
        return this.polyLocation;
    }

    public WebImageLocWordsResult setChars(List<WebImageLocChar> chars) {
        this.chars = chars;
        return this;
    }

    public List<WebImageLocChar> getChars() {
        return this.chars;
    }

    @Override
    public String toString() {
        return "WebImageLocWordsResult{" + "words=" + words + "\n" + "location=" + location + "\n" + "probability=" + probability + "\n" + "polyLocation=" + polyLocation + "\n"
                + "chars=" + chars + "\n" + "}";
    }

}