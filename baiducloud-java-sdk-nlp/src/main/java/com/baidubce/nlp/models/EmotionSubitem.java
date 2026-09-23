package com.baidubce.nlp.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmotionSubitem {
    /**
     * 
     */
    private String label;

    /**
     * 情绪二级分类标签对应的概率
     */
    private Double prob;

    public EmotionSubitem setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return this.label;
    }

    public EmotionSubitem setProb(Double prob) {
        this.prob = prob;
        return this;
    }

    public Double getProb() {
        return this.prob;
    }

    @Override
    public String toString() {
        return "EmotionSubitem{" + "label=" + label + "\n" + "prob=" + prob + "\n" + "}";
    }

}