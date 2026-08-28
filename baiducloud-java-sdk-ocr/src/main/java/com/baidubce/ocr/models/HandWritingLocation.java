package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandWritingLocation {
    /**
     * 表示定位位置的长方形左上顶点的水平坐标
     */
    private Integer left;

    /**
     * 表示定位位置的长方形左上顶点的垂直坐标
     */
    private Integer top;

    /**
     * 表示定位位置的长方形的宽度
     */
    private Integer width;

    /**
     * 表示定位位置的长方形的高度
     */
    private Integer height;

    public HandWritingLocation setLeft(Integer left) {
        this.left = left;
        return this;
    }

    public Integer getLeft() {
        return this.left;
    }

    public HandWritingLocation setTop(Integer top) {
        this.top = top;
        return this;
    }

    public Integer getTop() {
        return this.top;
    }

    public HandWritingLocation setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getWidth() {
        return this.width;
    }

    public HandWritingLocation setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return "HandWritingLocation{" + "left=" + left + "\n" + "top=" + top + "\n" + "width=" + width + "\n" + "height=" + height + "\n" + "}";
    }

}