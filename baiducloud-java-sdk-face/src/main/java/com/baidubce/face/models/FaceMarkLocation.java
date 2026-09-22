package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceMarkLocation {
    /**
     * 人脸区域离左边界的距离
     */
    private Double left;

    /**
     * 人脸区域离上边界的距离
     */
    private Double top;

    /**
     * 人脸区域的宽度
     */
    private Double width;

    /**
     * 人脸区域的高度
     */
    private Double height;

    /**
     * 人脸框相对于竖直方向的顺时针旋转角，[-180,180]
     */
    private Long rotation;

    public FaceMarkLocation setLeft(Double left) {
        this.left = left;
        return this;
    }

    public Double getLeft() {
        return this.left;
    }

    public FaceMarkLocation setTop(Double top) {
        this.top = top;
        return this;
    }

    public Double getTop() {
        return this.top;
    }

    public FaceMarkLocation setWidth(Double width) {
        this.width = width;
        return this;
    }

    public Double getWidth() {
        return this.width;
    }

    public FaceMarkLocation setHeight(Double height) {
        this.height = height;
        return this;
    }

    public Double getHeight() {
        return this.height;
    }

    public FaceMarkLocation setRotation(Long rotation) {
        this.rotation = rotation;
        return this;
    }

    public Long getRotation() {
        return this.rotation;
    }

    @Override
    public String toString() {
        return "FaceMarkLocation{" + "left=" + left + "\n" + "top=" + top + "\n" + "width=" + width + "\n" + "height=" + height + "\n" + "rotation=" + rotation + "\n" + "}";
    }

}