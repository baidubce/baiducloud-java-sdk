package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TamperedLocation {
    /**
     * 表示伪造区域的左上顶点的水平坐标
     */
    private Integer left;

    /**
     * 表示伪造区域的左上顶点的垂直坐标
     */
    private Integer top;

    /**
     * 表示伪造区域的宽度
     */
    private Integer width;

    /**
     * 表示伪造区域的高度
     */
    private Integer height;

    /**
     * 标识该区域伪造置信度分数
     */
    private Double probability;

    public TamperedLocation setLeft(Integer left) {
        this.left = left;
        return this;
    }

    public Integer getLeft() {
        return this.left;
    }

    public TamperedLocation setTop(Integer top) {
        this.top = top;
        return this;
    }

    public Integer getTop() {
        return this.top;
    }

    public TamperedLocation setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getWidth() {
        return this.width;
    }

    public TamperedLocation setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getHeight() {
        return this.height;
    }

    public TamperedLocation setProbability(Double probability) {
        this.probability = probability;
        return this;
    }

    public Double getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "TamperedLocation{" + "left=" + left + "\n" + "top=" + top + "\n" + "width=" + width + "\n" + "height=" + height + "\n" + "probability=" + probability + "\n" + "}";
    }

}