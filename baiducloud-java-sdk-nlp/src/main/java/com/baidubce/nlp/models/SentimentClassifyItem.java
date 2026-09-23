package com.baidubce.nlp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SentimentClassifyItem {
    /**
     * 表示情感极性分类结果，0:负向，1:中性，2:正向
     */
    private Integer sentiment;

    /**
     * 表示分类的置信度，取值范围[0,1]
     */
    private Float confidence;

    /**
     * 表示属于积极类别的概率，取值范围[0,1]
     */
    @JsonProperty("positive_prob")
    private Float positiveProb;

    /**
     * 表示属于消极类别的概率，取值范围[0,1]
     */
    @JsonProperty("negative_prob")
    private Float negativeProb;

    public SentimentClassifyItem setSentiment(Integer sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    public Integer getSentiment() {
        return this.sentiment;
    }

    public SentimentClassifyItem setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public SentimentClassifyItem setPositiveProb(Float positiveProb) {
        this.positiveProb = positiveProb;
        return this;
    }

    public Float getPositiveProb() {
        return this.positiveProb;
    }

    public SentimentClassifyItem setNegativeProb(Float negativeProb) {
        this.negativeProb = negativeProb;
        return this;
    }

    public Float getNegativeProb() {
        return this.negativeProb;
    }

    @Override
    public String toString() {
        return "SentimentClassifyItem{" + "sentiment=" + sentiment + "\n" + "confidence=" + confidence + "\n" + "positiveProb=" + positiveProb + "\n" + "negativeProb="
                + negativeProb + "\n" + "}";
    }

}