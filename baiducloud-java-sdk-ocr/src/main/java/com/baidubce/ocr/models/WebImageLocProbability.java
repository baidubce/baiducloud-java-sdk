package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebImageLocProbability {
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

    public WebImageLocProbability setAverage(Double average) {
        this.average = average;
        return this;
    }

    public Double getAverage() {
        return this.average;
    }

    public WebImageLocProbability setVariance(Double variance) {
        this.variance = variance;
        return this;
    }

    public Double getVariance() {
        return this.variance;
    }

    public WebImageLocProbability setMin(Double min) {
        this.min = min;
        return this;
    }

    public Double getMin() {
        return this.min;
    }

    @Override
    public String toString() {
        return "WebImageLocProbability{" + "average=" + average + "\n" + "variance=" + variance + "\n" + "min=" + min + "\n" + "}";
    }

}