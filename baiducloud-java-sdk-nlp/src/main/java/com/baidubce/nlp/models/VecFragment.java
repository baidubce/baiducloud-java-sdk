package com.baidubce.nlp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VecFragment {
    /**
     * 原片段
     */
    @JsonProperty("ori_frag")
    private String oriFrag;

    /**
     * 替换片段
     */
    @JsonProperty("correct_frag")
    private String correctFrag;

    /**
     * 片段起始
     */
    @JsonProperty("begin_pos")
    private Integer beginPos;

    /**
     * 片段结尾
     */
    @JsonProperty("end_pos")
    private Integer endPos;

    public VecFragment setOriFrag(String oriFrag) {
        this.oriFrag = oriFrag;
        return this;
    }

    public String getOriFrag() {
        return this.oriFrag;
    }

    public VecFragment setCorrectFrag(String correctFrag) {
        this.correctFrag = correctFrag;
        return this;
    }

    public String getCorrectFrag() {
        return this.correctFrag;
    }

    public VecFragment setBeginPos(Integer beginPos) {
        this.beginPos = beginPos;
        return this;
    }

    public Integer getBeginPos() {
        return this.beginPos;
    }

    public VecFragment setEndPos(Integer endPos) {
        this.endPos = endPos;
        return this;
    }

    public Integer getEndPos() {
        return this.endPos;
    }

    @Override
    public String toString() {
        return "VecFragment{" + "oriFrag=" + oriFrag + "\n" + "correctFrag=" + correctFrag + "\n" + "beginPos=" + beginPos + "\n" + "endPos=" + endPos + "\n" + "}";
    }

}