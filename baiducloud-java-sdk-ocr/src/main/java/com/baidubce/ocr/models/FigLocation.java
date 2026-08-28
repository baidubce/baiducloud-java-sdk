package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FigLocation {
    /**
     * 四角点坐标数组，坐标0点为左上角，顺时针返回
     */
    private List<PaperCutEduPoint> points;

    public FigLocation setPoints(List<PaperCutEduPoint> points) {
        this.points = points;
        return this;
    }

    public List<PaperCutEduPoint> getPoints() {
        return this.points;
    }

    @Override
    public String toString() {
        return "FigLocation{" + "points=" + points + "\n" + "}";
    }

}