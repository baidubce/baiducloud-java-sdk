package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalRecordProbability {
    /**
     * 字段识别结果中各字符的置信度平均值
     */
    private Double average;

    /**
     * 字段识别结果中各字符的置信度最小值
     */
    private Double min;

    public MedicalRecordProbability setAverage(Double average) {
        this.average = average;
        return this;
    }

    public Double getAverage() {
        return this.average;
    }

    public MedicalRecordProbability setMin(Double min) {
        this.min = min;
        return this;
    }

    public Double getMin() {
        return this.min;
    }

    @Override
    public String toString() {
        return "MedicalRecordProbability{" + "average=" + average + "\n" + "min=" + min + "\n" + "}";
    }

}