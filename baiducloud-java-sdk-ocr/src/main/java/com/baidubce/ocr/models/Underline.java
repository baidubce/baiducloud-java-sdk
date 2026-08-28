package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Underline {
    /**
     * points
     */
    private Points points;

    /**
     * 下划线置信度，取值范围在[0，1]之间
     */
    private Double prob;

    public Underline setPoints(Points points) {
        this.points = points;
        return this;
    }

    public Points getPoints() {
        return this.points;
    }

    public Underline setProb(Double prob) {
        this.prob = prob;
        return this;
    }

    public Double getProb() {
        return this.prob;
    }

    @Override
    public String toString() {
        return "Underline{" + "points=" + points + "\n" + "prob=" + prob + "\n" + "}";
    }

}