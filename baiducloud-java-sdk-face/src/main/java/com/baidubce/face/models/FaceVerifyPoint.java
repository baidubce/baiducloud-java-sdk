package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceVerifyPoint {
    /**
     * 
     */
    private Double x;

    /**
     * 
     */
    private Double y;

    public FaceVerifyPoint setX(Double x) {
        this.x = x;
        return this;
    }

    public Double getX() {
        return this.x;
    }

    public FaceVerifyPoint setY(Double y) {
        this.y = y;
        return this;
    }

    public Double getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "FaceVerifyPoint{" + "x=" + x + "\n" + "y=" + y + "\n" + "}";
    }

}