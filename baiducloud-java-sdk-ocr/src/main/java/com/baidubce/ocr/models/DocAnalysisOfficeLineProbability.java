package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisOfficeLineProbability {
    /**
     * 行置信度
     */
    private Double average;

    /**
     * 整行中单字的最低置信度
     */
    private Double min;

    public DocAnalysisOfficeLineProbability setAverage(Double average) {
        this.average = average;
        return this;
    }

    public Double getAverage() {
        return this.average;
    }

    public DocAnalysisOfficeLineProbability setMin(Double min) {
        this.min = min;
        return this;
    }

    public Double getMin() {
        return this.min;
    }

    @Override
    public String toString() {
        return "DocAnalysisOfficeLineProbability{" + "average=" + average + "\n" + "min=" + min + "\n" + "}";
    }

}