package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceMarkPoint {
    /**
     * x坐标
     */
    private Double x;

    /**
     * y坐标
     */
    private Double y;

    public FaceMarkPoint setX(Double x) {
        this.x = x;
        return this;
    }

    public Double getX() {
        return this.x;
    }

    public FaceMarkPoint setY(Double y) {
        this.y = y;
        return this;
    }

    public Double getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "FaceMarkPoint{" + "x=" + x + "\n" + "y=" + y + "\n" + "}";
    }

}