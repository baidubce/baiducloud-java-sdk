package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardQuality {
    /**
     * 是否清晰
     */
    @JsonProperty("IsClear")
    private Integer isClear;

    /**
     * 清晰度概率
     */
    @JsonProperty("IsClear_probability")
    private Double isClearProbability;

    /**
     * 是否边框完整
     */
    @JsonProperty("IsComplete")
    private Integer isComplete;

    /**
     * 完整度概率
     */
    @JsonProperty("IsComplete_probability")
    private Double isCompleteProbability;

    public CardQuality setIsClear(Integer isClear) {
        this.isClear = isClear;
        return this;
    }

    public Integer getIsClear() {
        return this.isClear;
    }

    public CardQuality setIsClearProbability(Double isClearProbability) {
        this.isClearProbability = isClearProbability;
        return this;
    }

    public Double getIsClearProbability() {
        return this.isClearProbability;
    }

    public CardQuality setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
        return this;
    }

    public Integer getIsComplete() {
        return this.isComplete;
    }

    public CardQuality setIsCompleteProbability(Double isCompleteProbability) {
        this.isCompleteProbability = isCompleteProbability;
        return this;
    }

    public Double getIsCompleteProbability() {
        return this.isCompleteProbability;
    }

    @Override
    public String toString() {
        return "CardQuality{" + "isClear=" + isClear + "\n" + "isClearProbability=" + isClearProbability + "\n" + "isComplete=" + isComplete + "\n" + "isCompleteProbability="
                + isCompleteProbability + "\n" + "}";
    }

}