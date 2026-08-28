package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultipleInvoiceProbability {
    /**
     * 平均置信度
     */
    private Float average;

    /**
     * 最小置信度
     */
    private Float min;

    public MultipleInvoiceProbability setAverage(Float average) {
        this.average = average;
        return this;
    }

    public Float getAverage() {
        return this.average;
    }

    public MultipleInvoiceProbability setMin(Float min) {
        this.min = min;
        return this;
    }

    public Float getMin() {
        return this.min;
    }

    @Override
    public String toString() {
        return "MultipleInvoiceProbability{" + "average=" + average + "\n" + "min=" + min + "\n" + "}";
    }

}