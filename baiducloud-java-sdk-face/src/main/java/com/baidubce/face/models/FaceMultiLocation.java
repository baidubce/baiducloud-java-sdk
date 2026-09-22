package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceMultiLocation {
    /**
     * 
     */
    private Double left;

    /**
     * 
     */
    private Double top;

    /**
     * 
     */
    private Double width;

    /**
     * 
     */
    private Double height;

    /**
     * 
     */
    private Long rotation;

    public FaceMultiLocation setLeft(Double left) {
        this.left = left;
        return this;
    }

    public Double getLeft() {
        return this.left;
    }

    public FaceMultiLocation setTop(Double top) {
        this.top = top;
        return this;
    }

    public Double getTop() {
        return this.top;
    }

    public FaceMultiLocation setWidth(Double width) {
        this.width = width;
        return this;
    }

    public Double getWidth() {
        return this.width;
    }

    public FaceMultiLocation setHeight(Double height) {
        this.height = height;
        return this;
    }

    public Double getHeight() {
        return this.height;
    }

    public FaceMultiLocation setRotation(Long rotation) {
        this.rotation = rotation;
        return this;
    }

    public Long getRotation() {
        return this.rotation;
    }

    @Override
    public String toString() {
        return "FaceMultiLocation{" + "left=" + left + "\n" + "top=" + top + "\n" + "width=" + width + "\n" + "height=" + height + "\n" + "rotation=" + rotation + "\n" + "}";
    }

}