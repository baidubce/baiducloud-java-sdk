package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Area {
    /**
     * 左上角X坐标
     */
    @JsonProperty("left_x")
    private Integer leftX;

    /**
     * 左上角Y坐标
     */
    @JsonProperty("left_y")
    private Integer leftY;

    /**
     * 右下角X坐标
     */
    @JsonProperty("right_x")
    private Integer rightX;

    /**
     * 右下角Y坐标
     */
    @JsonProperty("right_y")
    private Integer rightY;

    public Area setLeftX(Integer leftX) {
        this.leftX = leftX;
        return this;
    }

    public Integer getLeftX() {
        return this.leftX;
    }

    public Area setLeftY(Integer leftY) {
        this.leftY = leftY;
        return this;
    }

    public Integer getLeftY() {
        return this.leftY;
    }

    public Area setRightX(Integer rightX) {
        this.rightX = rightX;
        return this;
    }

    public Integer getRightX() {
        return this.rightX;
    }

    public Area setRightY(Integer rightY) {
        this.rightY = rightY;
        return this;
    }

    public Integer getRightY() {
        return this.rightY;
    }

    @Override
    public String toString() {
        return "Area{" + "leftX=" + leftX + "\n" + "leftY=" + leftY + "\n" + "rightX=" + rightX + "\n" + "rightY=" + rightY + "\n" + "}";
    }

}