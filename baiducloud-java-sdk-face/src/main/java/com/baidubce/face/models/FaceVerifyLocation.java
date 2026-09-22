package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceVerifyLocation {
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

    public FaceVerifyLocation setLeft(Double left) {
        this.left = left;
        return this;
    }

    public Double getLeft() {
        return this.left;
    }

    public FaceVerifyLocation setTop(Double top) {
        this.top = top;
        return this;
    }

    public Double getTop() {
        return this.top;
    }

    public FaceVerifyLocation setWidth(Double width) {
        this.width = width;
        return this;
    }

    public Double getWidth() {
        return this.width;
    }

    public FaceVerifyLocation setHeight(Double height) {
        this.height = height;
        return this;
    }

    public Double getHeight() {
        return this.height;
    }

    public FaceVerifyLocation setRotation(Long rotation) {
        this.rotation = rotation;
        return this;
    }

    public Long getRotation() {
        return this.rotation;
    }

    @Override
    public String toString() {
        return "FaceVerifyLocation{" + "left=" + left + "\n" + "top=" + top + "\n" + "width=" + width + "\n" + "height=" + height + "\n" + "rotation=" + rotation + "\n" + "}";
    }

}