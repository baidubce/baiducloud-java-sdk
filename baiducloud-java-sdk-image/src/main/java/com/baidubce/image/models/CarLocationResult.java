package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarLocationResult {
    /**
     * 车辆区域的宽度
     */
    private Float width;

    /**
     * 车辆区域的高度
     */
    private Float height;

    /**
     * 车辆区域离左边界的距离
     */
    private Float left;

    /**
     * 车辆区域离上边界的距离
     */
    private Float top;

    public CarLocationResult setWidth(Float width) {
        this.width = width;
        return this;
    }

    public Float getWidth() {
        return this.width;
    }

    public CarLocationResult setHeight(Float height) {
        this.height = height;
        return this;
    }

    public Float getHeight() {
        return this.height;
    }

    public CarLocationResult setLeft(Float left) {
        this.left = left;
        return this;
    }

    public Float getLeft() {
        return this.left;
    }

    public CarLocationResult setTop(Float top) {
        this.top = top;
        return this;
    }

    public Float getTop() {
        return this.top;
    }

    @Override
    public String toString() {
        return "CarLocationResult{" + "width=" + width + "\n" + "height=" + height + "\n" + "left=" + left + "\n" + "top=" + top + "\n" + "}";
    }

}