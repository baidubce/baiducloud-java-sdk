package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccurateWordsResult {
    /**
     * 识别结果字符串
     */
    private String words;

    /**
     * location
     */
    private AccurateLocation location;

    /**
     * 单字符结果，当 recognize_granularity=small 时返回该字段
     */
    private List<AccurateChar> chars;

    /**
     * probability
     */
    private AccurateProbability probability;

    /**
     * 识别结果中每一行的外包四边形点坐标，当 vertexes_location=true 时返回该字段
     */
    @JsonProperty("vertexes_location")
    private List<AccurateVertexesLocation> vertexesLocation;

    /**
     * 识别结果中每一行的多边形轮廓点坐标，当 vertexes_location=true 时返回该字段
     */
    @JsonProperty("finegrained_vertexes_location")
    private List<AccurateVertexesLocation> finegrainedVertexesLocation;

    /**
     * 表示 finegrained_poly_location 对应的最小外包矩形点坐标，当 vertexes_location=true 时返回该字段
     */
    @JsonProperty("min_finegrained_vertexes_location")
    private List<AccurateVertexesLocation> minFinegrainedVertexesLocation;

    public AccurateWordsResult setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    public AccurateWordsResult setLocation(AccurateLocation location) {
        this.location = location;
        return this;
    }

    public AccurateLocation getLocation() {
        return this.location;
    }

    public AccurateWordsResult setChars(List<AccurateChar> chars) {
        this.chars = chars;
        return this;
    }

    public List<AccurateChar> getChars() {
        return this.chars;
    }

    public AccurateWordsResult setProbability(AccurateProbability probability) {
        this.probability = probability;
        return this;
    }

    public AccurateProbability getProbability() {
        return this.probability;
    }

    public AccurateWordsResult setVertexesLocation(List<AccurateVertexesLocation> vertexesLocation) {
        this.vertexesLocation = vertexesLocation;
        return this;
    }

    public List<AccurateVertexesLocation> getVertexesLocation() {
        return this.vertexesLocation;
    }

    public AccurateWordsResult setFinegrainedVertexesLocation(List<AccurateVertexesLocation> finegrainedVertexesLocation) {
        this.finegrainedVertexesLocation = finegrainedVertexesLocation;
        return this;
    }

    public List<AccurateVertexesLocation> getFinegrainedVertexesLocation() {
        return this.finegrainedVertexesLocation;
    }

    public AccurateWordsResult setMinFinegrainedVertexesLocation(List<AccurateVertexesLocation> minFinegrainedVertexesLocation) {
        this.minFinegrainedVertexesLocation = minFinegrainedVertexesLocation;
        return this;
    }

    public List<AccurateVertexesLocation> getMinFinegrainedVertexesLocation() {
        return this.minFinegrainedVertexesLocation;
    }

    @Override
    public String toString() {
        return "AccurateWordsResult{" + "words=" + words + "\n" + "location=" + location + "\n" + "chars=" + chars + "\n" + "probability=" + probability + "\n"
                + "vertexesLocation=" + vertexesLocation + "\n" + "finegrainedVertexesLocation=" + finegrainedVertexesLocation + "\n" + "minFinegrainedVertexesLocation="
                + minFinegrainedVertexesLocation + "\n" + "}";
    }

}