package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableFooter {
    /**
     * 表尾位置，四角点的x,y坐标
     */
    private List<DocAnalysisOfficePoint> location;

    /**
     * 表尾信息，按行拆分
     */
    private String words;

    public TableFooter setLocation(List<DocAnalysisOfficePoint> location) {
        this.location = location;
        return this;
    }

    public List<DocAnalysisOfficePoint> getLocation() {
        return this.location;
    }

    public TableFooter setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "TableFooter{" + "location=" + location + "\n" + "words=" + words + "\n" + "}";
    }

}