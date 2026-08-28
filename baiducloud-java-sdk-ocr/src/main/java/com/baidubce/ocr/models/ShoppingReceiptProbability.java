package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShoppingReceiptProbability {
    /**
     * 字段识别结果中各字符的置信度平均值
     */
    private Float average;

    /**
     * 字段识别结果中各字符的置信度最小值
     */
    private Float min;

    public ShoppingReceiptProbability setAverage(Float average) {
        this.average = average;
        return this;
    }

    public Float getAverage() {
        return this.average;
    }

    public ShoppingReceiptProbability setMin(Float min) {
        this.min = min;
        return this;
    }

    public Float getMin() {
        return this.min;
    }

    @Override
    public String toString() {
        return "ShoppingReceiptProbability{" + "average=" + average + "\n" + "min=" + min + "\n" + "}";
    }

}