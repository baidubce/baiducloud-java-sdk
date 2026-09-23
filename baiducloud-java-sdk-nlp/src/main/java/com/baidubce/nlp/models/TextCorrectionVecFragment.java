package com.baidubce.nlp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextCorrectionVecFragment {
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

    /**
     * 纠错释义
     */
    private String explain;

    /**
     * 详细的释义信息，说明常用字/词纠错的具体原因
     */
    @JsonProperty("explain_long")
    private String explainLong;

    /**
     * 涉政相关的结构化释义信息
     */
    @JsonProperty("explain_structure")
    private String explainStructure;

    /**
     * 建议操作类型，0:检查，1:交换，2:替换，3:插入，4:删除
     */
    private Integer operation;

    /**
     * 
     */
    private String label;

    /**
     * 模型置信度打分
     */
    private Double score;

    public TextCorrectionVecFragment setOriFrag(String oriFrag) {
        this.oriFrag = oriFrag;
        return this;
    }

    public String getOriFrag() {
        return this.oriFrag;
    }

    public TextCorrectionVecFragment setCorrectFrag(String correctFrag) {
        this.correctFrag = correctFrag;
        return this;
    }

    public String getCorrectFrag() {
        return this.correctFrag;
    }

    public TextCorrectionVecFragment setBeginPos(Integer beginPos) {
        this.beginPos = beginPos;
        return this;
    }

    public Integer getBeginPos() {
        return this.beginPos;
    }

    public TextCorrectionVecFragment setEndPos(Integer endPos) {
        this.endPos = endPos;
        return this;
    }

    public Integer getEndPos() {
        return this.endPos;
    }

    public TextCorrectionVecFragment setExplain(String explain) {
        this.explain = explain;
        return this;
    }

    public String getExplain() {
        return this.explain;
    }

    public TextCorrectionVecFragment setExplainLong(String explainLong) {
        this.explainLong = explainLong;
        return this;
    }

    public String getExplainLong() {
        return this.explainLong;
    }

    public TextCorrectionVecFragment setExplainStructure(String explainStructure) {
        this.explainStructure = explainStructure;
        return this;
    }

    public String getExplainStructure() {
        return this.explainStructure;
    }

    public TextCorrectionVecFragment setOperation(Integer operation) {
        this.operation = operation;
        return this;
    }

    public Integer getOperation() {
        return this.operation;
    }

    public TextCorrectionVecFragment setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return this.label;
    }

    public TextCorrectionVecFragment setScore(Double score) {
        this.score = score;
        return this;
    }

    public Double getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return "TextCorrectionVecFragment{" + "oriFrag=" + oriFrag + "\n" + "correctFrag=" + correctFrag + "\n" + "beginPos=" + beginPos + "\n" + "endPos=" + endPos + "\n"
                + "explain=" + explain + "\n" + "explainLong=" + explainLong + "\n" + "explainStructure=" + explainStructure + "\n" + "operation=" + operation + "\n" + "label="
                + label + "\n" + "score=" + score + "\n" + "}";
    }

}