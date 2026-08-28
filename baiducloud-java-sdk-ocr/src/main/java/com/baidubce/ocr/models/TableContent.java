package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableContent {
    /**
     * 单元格内文字各行的四角点x,y坐标
     */
    @JsonProperty("poly_location")
    private List<TablePoint> polyLocation;

    /**
     * 单元格内分行文字内容
     */
    private String word;

    public TableContent setPolyLocation(List<TablePoint> polyLocation) {
        this.polyLocation = polyLocation;
        return this;
    }

    public List<TablePoint> getPolyLocation() {
        return this.polyLocation;
    }

    public TableContent setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public String toString() {
        return "TableContent{" + "polyLocation=" + polyLocation + "\n" + "word=" + word + "\n" + "}";
    }

}