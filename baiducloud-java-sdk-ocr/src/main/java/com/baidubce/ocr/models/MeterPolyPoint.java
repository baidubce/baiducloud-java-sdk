package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MeterPolyPoint {
    /**
     * 水平坐标（坐标0点为左上角）
     */
    private Integer x;

    /**
     * 垂直坐标（坐标0点为左上角）
     */
    private Integer y;

    public MeterPolyPoint setX(Integer x) {
        this.x = x;
        return this;
    }

    public Integer getX() {
        return this.x;
    }

    public MeterPolyPoint setY(Integer y) {
        this.y = y;
        return this;
    }

    public Integer getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "MeterPolyPoint{" + "x=" + x + "\n" + "y=" + y + "\n" + "}";
    }

}