package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandWritingProbability {
    /**
     * 行置信度平均值
     */
    private Double average;

    /**
     * 行置信度方差
     */
    private Double variance;

    /**
     * 行置信度最小值
     */
    private Double min;

    public HandWritingProbability setAverage(Double average) {
        this.average = average;
        return this;
    }

    public Double getAverage() {
        return this.average;
    }

    public HandWritingProbability setVariance(Double variance) {
        this.variance = variance;
        return this;
    }

    public Double getVariance() {
        return this.variance;
    }

    public HandWritingProbability setMin(Double min) {
        this.min = min;
        return this;
    }

    public Double getMin() {
        return this.min;
    }

    @Override
    public String toString() {
        return "HandWritingProbability{" + "average=" + average + "\n" + "variance=" + variance + "\n" + "min=" + min + "\n" + "}";
    }

}