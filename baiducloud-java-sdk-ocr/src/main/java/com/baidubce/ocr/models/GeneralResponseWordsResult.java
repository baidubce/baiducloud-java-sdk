package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralResponseWordsResult {
    /**
     * 识别结果字符串
     */
    private String words;

    /**
     * location
     */
    private GeneralLocation location;

    /**
     * 单字符结果，当 recognize_granularity=small 时返回该字段
     */
    private List<GeneralResponseChar> chars;

    /**
     * probability
     */
    private GeneralProbability probability;

    /**
     * 识别结果中每一行的外包四边形点坐标，当 vertexes_location=true 时返回该字段
     */
    @JsonProperty("vertexes_location")
    private List<GeneralVertexesLocation> vertexesLocation;

    /**
     * 识别结果中每一行的多边形轮廓点坐标，当 vertexes_location=true 时返回该字段
     */
    @JsonProperty("finegrained_vertexes_location")
    private List<GeneralVertexesLocation> finegrainedVertexesLocation;

    /**
     * 表示 finegrained_poly_location 对应的最小外包矩形点坐标，当 vertexes_location=true 时返回该字段
     */
    @JsonProperty("min_finegrained_vertexes_location")
    private List<GeneralVertexesLocation> minFinegrainedVertexesLocation;

    public GeneralResponseWordsResult setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    public GeneralResponseWordsResult setLocation(GeneralLocation location) {
        this.location = location;
        return this;
    }

    public GeneralLocation getLocation() {
        return this.location;
    }

    public GeneralResponseWordsResult setChars(List<GeneralResponseChar> chars) {
        this.chars = chars;
        return this;
    }

    public List<GeneralResponseChar> getChars() {
        return this.chars;
    }

    public GeneralResponseWordsResult setProbability(GeneralProbability probability) {
        this.probability = probability;
        return this;
    }

    public GeneralProbability getProbability() {
        return this.probability;
    }

    public GeneralResponseWordsResult setVertexesLocation(List<GeneralVertexesLocation> vertexesLocation) {
        this.vertexesLocation = vertexesLocation;
        return this;
    }

    public List<GeneralVertexesLocation> getVertexesLocation() {
        return this.vertexesLocation;
    }

    public GeneralResponseWordsResult setFinegrainedVertexesLocation(List<GeneralVertexesLocation> finegrainedVertexesLocation) {
        this.finegrainedVertexesLocation = finegrainedVertexesLocation;
        return this;
    }

    public List<GeneralVertexesLocation> getFinegrainedVertexesLocation() {
        return this.finegrainedVertexesLocation;
    }

    public GeneralResponseWordsResult setMinFinegrainedVertexesLocation(List<GeneralVertexesLocation> minFinegrainedVertexesLocation) {
        this.minFinegrainedVertexesLocation = minFinegrainedVertexesLocation;
        return this;
    }

    public List<GeneralVertexesLocation> getMinFinegrainedVertexesLocation() {
        return this.minFinegrainedVertexesLocation;
    }

    @Override
    public String toString() {
        return "GeneralResponseWordsResult{" + "words=" + words + "\n" + "location=" + location + "\n" + "chars=" + chars + "\n" + "probability=" + probability + "\n"
                + "vertexesLocation=" + vertexesLocation + "\n" + "finegrainedVertexesLocation=" + finegrainedVertexesLocation + "\n" + "minFinegrainedVertexesLocation="
                + minFinegrainedVertexesLocation + "\n" + "}";
    }

}