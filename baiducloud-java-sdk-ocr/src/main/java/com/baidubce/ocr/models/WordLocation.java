package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WordLocation {
    /**
     * 文字区域左上角纵坐标
     */
    private Integer top;

    /**
     * 文字区域左上角横坐标
     */
    private Integer left;

    /**
     * 文字区域宽度
     */
    private Integer width;

    /**
     * 文字区域高度
     */
    private Integer height;

    public WordLocation setTop(Integer top) {
        this.top = top;
        return this;
    }

    public Integer getTop() {
        return this.top;
    }

    public WordLocation setLeft(Integer left) {
        this.left = left;
        return this;
    }

    public Integer getLeft() {
        return this.left;
    }

    public WordLocation setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getWidth() {
        return this.width;
    }

    public WordLocation setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return "WordLocation{" + "top=" + top + "\n" + "left=" + left + "\n" + "width=" + width + "\n" + "height=" + height + "\n" + "}";
    }

}