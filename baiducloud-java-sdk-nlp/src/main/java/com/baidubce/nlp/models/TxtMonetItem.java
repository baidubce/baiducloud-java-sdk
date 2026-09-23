package com.baidubce.nlp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TxtMonetItem {
    /**
     * 每个query的返回结果
     */
    private String text;

    /**
     * 返回结果的起始位置概率和结束位置概率的乘积
     */
    private Float prob;

    /**
     * 返回结果的起始位置
     */
    @JsonProperty("start_offset")
    private Integer startOffset;

    /**
     * 返回结果的结束位置
     */
    @JsonProperty("end_offset")
    private Integer endOffset;

    public TxtMonetItem setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public TxtMonetItem setProb(Float prob) {
        this.prob = prob;
        return this;
    }

    public Float getProb() {
        return this.prob;
    }

    public TxtMonetItem setStartOffset(Integer startOffset) {
        this.startOffset = startOffset;
        return this;
    }

    public Integer getStartOffset() {
        return this.startOffset;
    }

    public TxtMonetItem setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    public Integer getEndOffset() {
        return this.endOffset;
    }

    @Override
    public String toString() {
        return "TxtMonetItem{" + "text=" + text + "\n" + "prob=" + prob + "\n" + "startOffset=" + startOffset + "\n" + "endOffset=" + endOffset + "\n" + "}";
    }

}