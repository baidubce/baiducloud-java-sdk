package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MeterLocation {
    /**
     * 左上顶点水平坐标
     */
    private Integer left;

    /**
     * 左上顶点垂直坐标
     */
    private Integer top;

    /**
     * 宽度
     */
    private Integer width;

    /**
     * 高度
     */
    private Integer height;

    public MeterLocation setLeft(Integer left) {
        this.left = left;
        return this;
    }

    public Integer getLeft() {
        return this.left;
    }

    public MeterLocation setTop(Integer top) {
        this.top = top;
        return this;
    }

    public Integer getTop() {
        return this.top;
    }

    public MeterLocation setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getWidth() {
        return this.width;
    }

    public MeterLocation setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return "MeterLocation{" + "left=" + left + "\n" + "top=" + top + "\n" + "width=" + width + "\n" + "height=" + height + "\n" + "}";
    }

}