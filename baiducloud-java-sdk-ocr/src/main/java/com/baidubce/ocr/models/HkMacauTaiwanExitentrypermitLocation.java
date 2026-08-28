package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HkMacauTaiwanExitentrypermitLocation {
    /**
     * 字段的上边距
     */
    private Integer top;

    /**
     * 字段的左边距
     */
    private Integer left;

    /**
     * 字段的宽度
     */
    private Integer width;

    /**
     * 字段的高度
     */
    private Integer height;

    public HkMacauTaiwanExitentrypermitLocation setTop(Integer top) {
        this.top = top;
        return this;
    }

    public Integer getTop() {
        return this.top;
    }

    public HkMacauTaiwanExitentrypermitLocation setLeft(Integer left) {
        this.left = left;
        return this;
    }

    public Integer getLeft() {
        return this.left;
    }

    public HkMacauTaiwanExitentrypermitLocation setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getWidth() {
        return this.width;
    }

    public HkMacauTaiwanExitentrypermitLocation setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return "HkMacauTaiwanExitentrypermitLocation{" + "top=" + top + "\n" + "left=" + left + "\n" + "width=" + width + "\n" + "height=" + height + "\n" + "}";
    }

}