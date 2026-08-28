package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralParagraphsResult {
    /**
     * 一个段落包含的行序号，当 paragraph=true 时返回该字段
     */
    @JsonProperty("words_result_idx")
    private List<Integer> wordsResultIdx;

    /**
     * 识别结果中每一行的多边形轮廓点坐标，当 paragraph=true && vertexes_location=true 时返回该字段
     */
    @JsonProperty("finegrained_vertexes_location")
    private List<GeneralVertexesLocation> finegrainedVertexesLocation;

    /**
     * 表示 finegrained_poly_location 对应的最小外包矩形点坐标，当 paragraph=true && vertexes_location=true 时返回该字段
     */
    @JsonProperty("min_finegrained_vertexes_location")
    private List<GeneralVertexesLocation> minFinegrainedVertexesLocation;

    public GeneralParagraphsResult setWordsResultIdx(List<Integer> wordsResultIdx) {
        this.wordsResultIdx = wordsResultIdx;
        return this;
    }

    public List<Integer> getWordsResultIdx() {
        return this.wordsResultIdx;
    }

    public GeneralParagraphsResult setFinegrainedVertexesLocation(List<GeneralVertexesLocation> finegrainedVertexesLocation) {
        this.finegrainedVertexesLocation = finegrainedVertexesLocation;
        return this;
    }

    public List<GeneralVertexesLocation> getFinegrainedVertexesLocation() {
        return this.finegrainedVertexesLocation;
    }

    public GeneralParagraphsResult setMinFinegrainedVertexesLocation(List<GeneralVertexesLocation> minFinegrainedVertexesLocation) {
        this.minFinegrainedVertexesLocation = minFinegrainedVertexesLocation;
        return this;
    }

    public List<GeneralVertexesLocation> getMinFinegrainedVertexesLocation() {
        return this.minFinegrainedVertexesLocation;
    }

    @Override
    public String toString() {
        return "GeneralParagraphsResult{" + "wordsResultIdx=" + wordsResultIdx + "\n" + "finegrainedVertexesLocation=" + finegrainedVertexesLocation + "\n"
                + "minFinegrainedVertexesLocation=" + minFinegrainedVertexesLocation + "\n" + "}";
    }

}