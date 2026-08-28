package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaperCutEduPoint {
    /**
     * 水平坐标
     */
    private Integer x;

    /**
     * 垂直坐标
     */
    private Integer y;

    public PaperCutEduPoint setX(Integer x) {
        this.x = x;
        return this;
    }

    public Integer getX() {
        return this.x;
    }

    public PaperCutEduPoint setY(Integer y) {
        this.y = y;
        return this;
    }

    public Integer getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "PaperCutEduPoint{" + "x=" + x + "\n" + "y=" + y + "\n" + "}";
    }

}