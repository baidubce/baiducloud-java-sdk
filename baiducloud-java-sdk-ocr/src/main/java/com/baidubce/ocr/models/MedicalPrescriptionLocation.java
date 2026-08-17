package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalPrescriptionLocation {
    /**
     * 字段的上边距
     */
    private Integer top;

    /**
     * 字段的左边距
     */
    private Integer left;

    /**
     * 字段的高度
     */
    private Integer height;

    /**
     * 字段的宽度
     */
    private Integer width;

    public MedicalPrescriptionLocation setTop(Integer top) {
        this.top = top;
        return this;
    }

    public Integer getTop() {
        return this.top;
    }

    public MedicalPrescriptionLocation setLeft(Integer left) {
        this.left = left;
        return this;
    }

    public Integer getLeft() {
        return this.left;
    }

    public MedicalPrescriptionLocation setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getHeight() {
        return this.height;
    }

    public MedicalPrescriptionLocation setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getWidth() {
        return this.width;
    }

    @Override
    public String toString() {
        return "MedicalPrescriptionLocation{" + "top=" + top + "\n" + "left=" + left + "\n" + "height=" + height + "\n" + "width=" + width + "\n" + "}";
    }

}