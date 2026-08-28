package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisOfficeTableContent {
    /**
     * 单元格每行文本位置信息
     */
    @JsonProperty("poly_location")
    private List<DocAnalysisOfficePoint> polyLocation;

    /**
     * 单元格每行文本内容
     */
    private String word;

    public DocAnalysisOfficeTableContent setPolyLocation(List<DocAnalysisOfficePoint> polyLocation) {
        this.polyLocation = polyLocation;
        return this;
    }

    public List<DocAnalysisOfficePoint> getPolyLocation() {
        return this.polyLocation;
    }

    public DocAnalysisOfficeTableContent setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public String toString() {
        return "DocAnalysisOfficeTableContent{" + "polyLocation=" + polyLocation + "\n" + "word=" + word + "\n" + "}";
    }

}