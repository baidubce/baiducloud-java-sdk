package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccurateParagraphsResult {
    /**
     * 一个段落包含的行序号，当 paragraph=true 时返回该字段
     */
    @JsonProperty("words_result_idx")
    private List<Integer> wordsResultIdx;

    /**
     * 识别结果中每一行的多边形轮廓点坐标，当 paragraph=true && vertexes_location=true 时返回该字段
     */
    @JsonProperty("finegrained_vertexes_location")
    private List<AccurateVertexesLocation> finegrainedVertexesLocation;

    /**
     * 表示 finegrained_poly_location 对应的最小外包矩形点坐标，当 paragraph=true && vertexes_location=true 时返回该字段
     */
    @JsonProperty("min_finegrained_vertexes_location")
    private List<AccurateVertexesLocation> minFinegrainedVertexesLocation;

    public AccurateParagraphsResult setWordsResultIdx(List<Integer> wordsResultIdx) {
        this.wordsResultIdx = wordsResultIdx;
        return this;
    }

    public List<Integer> getWordsResultIdx() {
        return this.wordsResultIdx;
    }

    public AccurateParagraphsResult setFinegrainedVertexesLocation(List<AccurateVertexesLocation> finegrainedVertexesLocation) {
        this.finegrainedVertexesLocation = finegrainedVertexesLocation;
        return this;
    }

    public List<AccurateVertexesLocation> getFinegrainedVertexesLocation() {
        return this.finegrainedVertexesLocation;
    }

    public AccurateParagraphsResult setMinFinegrainedVertexesLocation(List<AccurateVertexesLocation> minFinegrainedVertexesLocation) {
        this.minFinegrainedVertexesLocation = minFinegrainedVertexesLocation;
        return this;
    }

    public List<AccurateVertexesLocation> getMinFinegrainedVertexesLocation() {
        return this.minFinegrainedVertexesLocation;
    }

    @Override
    public String toString() {
        return "AccurateParagraphsResult{" + "wordsResultIdx=" + wordsResultIdx + "\n" + "finegrainedVertexesLocation=" + finegrainedVertexesLocation + "\n"
                + "minFinegrainedVertexesLocation=" + minFinegrainedVertexesLocation + "\n" + "}";
    }

}