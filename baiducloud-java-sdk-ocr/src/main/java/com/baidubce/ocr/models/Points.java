package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Points {
    /**
     * 下划线起点x坐标
     */
    @JsonProperty("start_x")
    private Integer startX;

    /**
     * 下划线起点y坐标
     */
    @JsonProperty("start_y")
    private Integer startY;

    /**
     * 下划线终点x坐标
     */
    @JsonProperty("end_x")
    private Integer endX;

    /**
     * 下划线终点y坐标
     */
    @JsonProperty("end_y")
    private Integer endY;

    public Points setStartX(Integer startX) {
        this.startX = startX;
        return this;
    }

    public Integer getStartX() {
        return this.startX;
    }

    public Points setStartY(Integer startY) {
        this.startY = startY;
        return this;
    }

    public Integer getStartY() {
        return this.startY;
    }

    public Points setEndX(Integer endX) {
        this.endX = endX;
        return this;
    }

    public Integer getEndX() {
        return this.endX;
    }

    public Points setEndY(Integer endY) {
        this.endY = endY;
        return this;
    }

    public Integer getEndY() {
        return this.endY;
    }

    @Override
    public String toString() {
        return "Points{" + "startX=" + startX + "\n" + "startY=" + startY + "\n" + "endX=" + endX + "\n" + "endY=" + endY + "\n" + "}";
    }

}