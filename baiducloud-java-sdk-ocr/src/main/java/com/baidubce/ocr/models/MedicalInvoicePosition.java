package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalInvoicePosition {
    /**
     * 左上角横坐标
     */
    private Integer x1;

    /**
     * 左上角纵坐标
     */
    private Integer y1;

    /**
     * 右上角横坐标
     */
    private Integer x2;

    /**
     * 右上角纵坐标
     */
    private Integer y2;

    /**
     * 右下角横坐标
     */
    private Integer x3;

    /**
     * 右下角纵坐标
     */
    private Integer y3;

    /**
     * 左下角横坐标
     */
    private Integer x4;

    /**
     * 左下角纵坐标
     */
    private Integer y4;

    public MedicalInvoicePosition setX1(Integer x1) {
        this.x1 = x1;
        return this;
    }

    public Integer getX1() {
        return this.x1;
    }

    public MedicalInvoicePosition setY1(Integer y1) {
        this.y1 = y1;
        return this;
    }

    public Integer getY1() {
        return this.y1;
    }

    public MedicalInvoicePosition setX2(Integer x2) {
        this.x2 = x2;
        return this;
    }

    public Integer getX2() {
        return this.x2;
    }

    public MedicalInvoicePosition setY2(Integer y2) {
        this.y2 = y2;
        return this;
    }

    public Integer getY2() {
        return this.y2;
    }

    public MedicalInvoicePosition setX3(Integer x3) {
        this.x3 = x3;
        return this;
    }

    public Integer getX3() {
        return this.x3;
    }

    public MedicalInvoicePosition setY3(Integer y3) {
        this.y3 = y3;
        return this;
    }

    public Integer getY3() {
        return this.y3;
    }

    public MedicalInvoicePosition setX4(Integer x4) {
        this.x4 = x4;
        return this;
    }

    public Integer getX4() {
        return this.x4;
    }

    public MedicalInvoicePosition setY4(Integer y4) {
        this.y4 = y4;
        return this;
    }

    public Integer getY4() {
        return this.y4;
    }

    @Override
    public String toString() {
        return "MedicalInvoicePosition{" + "x1=" + x1 + "\n" + "y1=" + y1 + "\n" + "x2=" + x2 + "\n" + "y2=" + y2 + "\n" + "x3=" + x3 + "\n" + "y3=" + y3 + "\n" + "x4=" + x4
                + "\n" + "y4=" + y4 + "\n" + "}";
    }

}