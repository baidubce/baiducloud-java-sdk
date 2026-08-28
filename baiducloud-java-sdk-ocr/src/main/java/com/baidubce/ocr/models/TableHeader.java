package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableHeader {
    /**
     * 表头位置，四角点的x,y坐标
     */
    private List<DocAnalysisOfficePoint> location;

    /**
     * 表头信息，按行拆分
     */
    private String words;

    public TableHeader setLocation(List<DocAnalysisOfficePoint> location) {
        this.location = location;
        return this;
    }

    public List<DocAnalysisOfficePoint> getLocation() {
        return this.location;
    }

    public TableHeader setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "TableHeader{" + "location=" + location + "\n" + "words=" + words + "\n" + "}";
    }

}