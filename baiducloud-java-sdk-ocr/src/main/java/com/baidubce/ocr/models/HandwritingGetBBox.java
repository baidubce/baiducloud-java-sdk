package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandwritingGetBBox {
    /**
     * X坐标
     */
    private Integer x;

    /**
     * Y坐标
     */
    private Integer y;

    /**
     * 宽度
     */
    private Integer w;

    /**
     * 高度
     */
    private Integer h;

    public HandwritingGetBBox setX(Integer x) {
        this.x = x;
        return this;
    }

    public Integer getX() {
        return this.x;
    }

    public HandwritingGetBBox setY(Integer y) {
        this.y = y;
        return this;
    }

    public Integer getY() {
        return this.y;
    }

    public HandwritingGetBBox setW(Integer w) {
        this.w = w;
        return this;
    }

    public Integer getW() {
        return this.w;
    }

    public HandwritingGetBBox setH(Integer h) {
        this.h = h;
        return this;
    }

    public Integer getH() {
        return this.h;
    }

    @Override
    public String toString() {
        return "HandwritingGetBBox{" + "x=" + x + "\n" + "y=" + y + "\n" + "w=" + w + "\n" + "h=" + h + "\n" + "}";
    }

}