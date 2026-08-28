package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttriLocation {
    /**
     * 四角点坐标数组，依次为左上、右上、右下、左下
     */
    private List<DocAnalysisOfficePoint> points;

    public AttriLocation setPoints(List<DocAnalysisOfficePoint> points) {
        this.points = points;
        return this;
    }

    public List<DocAnalysisOfficePoint> getPoints() {
        return this.points;
    }

    @Override
    public String toString() {
        return "AttriLocation{" + "points=" + points + "\n" + "}";
    }

}