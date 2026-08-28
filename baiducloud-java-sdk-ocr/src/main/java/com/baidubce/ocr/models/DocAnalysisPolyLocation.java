package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisPolyLocation {
    /**
     * 四角点坐标数组，依次为左上、右上、右下、左下
     */
    private List<DocAnalysisPoint> points;

    public DocAnalysisPolyLocation setPoints(List<DocAnalysisPoint> points) {
        this.points = points;
        return this;
    }

    public List<DocAnalysisPoint> getPoints() {
        return this.points;
    }

    @Override
    public String toString() {
        return "DocAnalysisPolyLocation{" + "points=" + points + "\n" + "}";
    }

}