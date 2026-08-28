package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisOfficePoint {
    /**
     * x坐标
     */
    private Integer x;

    /**
     * y坐标
     */
    private Integer y;

    public DocAnalysisOfficePoint setX(Integer x) {
        this.x = x;
        return this;
    }

    public Integer getX() {
        return this.x;
    }

    public DocAnalysisOfficePoint setY(Integer y) {
        this.y = y;
        return this;
    }

    public Integer getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "DocAnalysisOfficePoint{" + "x=" + x + "\n" + "y=" + y + "\n" + "}";
    }

}