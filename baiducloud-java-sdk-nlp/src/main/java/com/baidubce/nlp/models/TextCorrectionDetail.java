package com.baidubce.nlp.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextCorrectionDetail {
    /**
     * 子句id，子句为最细标点符号切割粒度
     */
    @JsonProperty("sentence_id")
    private Integer sentenceId;

    /**
     * 原始子句文本
     */
    private String sentence;

    /**
     * 纠正后的子句文本
     */
    @JsonProperty("sentence_fixed")
    private String sentenceFixed;

    /**
     * 替换候选片段信息
     */
    @JsonProperty("vec_fragment")
    private List<TextCorrectionVecFragment> vecFragment;

    /**
     * 子句在content中的起始位置
     */
    @JsonProperty("begin_sentence_offset")
    private Integer beginSentenceOffset;

    /**
     * 子句在content中的结尾位置
     */
    @JsonProperty("end_sentence_offset")
    private Integer endSentenceOffset;

    /**
     * 子句所属句子在content中的起始位置
     */
    @JsonProperty("begin_psent_cont_offset")
    private Integer beginPsentContOffset;

    /**
     * 子句所属句子在content中的结尾位置
     */
    @JsonProperty("end_psent_cont_offset")
    private Integer endPsentContOffset;

    public TextCorrectionDetail setSentenceId(Integer sentenceId) {
        this.sentenceId = sentenceId;
        return this;
    }

    public Integer getSentenceId() {
        return this.sentenceId;
    }

    public TextCorrectionDetail setSentence(String sentence) {
        this.sentence = sentence;
        return this;
    }

    public String getSentence() {
        return this.sentence;
    }

    public TextCorrectionDetail setSentenceFixed(String sentenceFixed) {
        this.sentenceFixed = sentenceFixed;
        return this;
    }

    public String getSentenceFixed() {
        return this.sentenceFixed;
    }

    public TextCorrectionDetail setVecFragment(List<TextCorrectionVecFragment> vecFragment) {
        this.vecFragment = vecFragment;
        return this;
    }

    public List<TextCorrectionVecFragment> getVecFragment() {
        return this.vecFragment;
    }

    public TextCorrectionDetail setBeginSentenceOffset(Integer beginSentenceOffset) {
        this.beginSentenceOffset = beginSentenceOffset;
        return this;
    }

    public Integer getBeginSentenceOffset() {
        return this.beginSentenceOffset;
    }

    public TextCorrectionDetail setEndSentenceOffset(Integer endSentenceOffset) {
        this.endSentenceOffset = endSentenceOffset;
        return this;
    }

    public Integer getEndSentenceOffset() {
        return this.endSentenceOffset;
    }

    public TextCorrectionDetail setBeginPsentContOffset(Integer beginPsentContOffset) {
        this.beginPsentContOffset = beginPsentContOffset;
        return this;
    }

    public Integer getBeginPsentContOffset() {
        return this.beginPsentContOffset;
    }

    public TextCorrectionDetail setEndPsentContOffset(Integer endPsentContOffset) {
        this.endPsentContOffset = endPsentContOffset;
        return this;
    }

    public Integer getEndPsentContOffset() {
        return this.endPsentContOffset;
    }

    @Override
    public String toString() {
        return "TextCorrectionDetail{" + "sentenceId=" + sentenceId + "\n" + "sentence=" + sentence + "\n" + "sentenceFixed=" + sentenceFixed + "\n" + "vecFragment=" + vecFragment
                + "\n" + "beginSentenceOffset=" + beginSentenceOffset + "\n" + "endSentenceOffset=" + endSentenceOffset + "\n" + "beginPsentContOffset=" + beginPsentContOffset
                + "\n" + "endPsentContOffset=" + endPsentContOffset + "\n" + "}";
    }

}