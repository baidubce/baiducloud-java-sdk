package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QRCodeLocation {
    /**
     * 条形码/二维码的上边距
     */
    private Integer top;

    /**
     * 条形码/二维码的左边距
     */
    private Integer left;

    /**
     * 条形码/二维码的宽度
     */
    private Integer width;

    /**
     * 条形码/二维码的高度
     */
    private Integer height;

    public QRCodeLocation setTop(Integer top) {
        this.top = top;
        return this;
    }

    public Integer getTop() {
        return this.top;
    }

    public QRCodeLocation setLeft(Integer left) {
        this.left = left;
        return this;
    }

    public Integer getLeft() {
        return this.left;
    }

    public QRCodeLocation setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getWidth() {
        return this.width;
    }

    public QRCodeLocation setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return "QRCodeLocation{" + "top=" + top + "\n" + "left=" + left + "\n" + "width=" + width + "\n" + "height=" + height + "\n" + "}";
    }

}