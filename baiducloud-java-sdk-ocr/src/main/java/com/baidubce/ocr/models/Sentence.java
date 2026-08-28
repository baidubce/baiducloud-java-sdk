package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sentence {
    /**
     * 仅字级和行级粒度返回，句子轮廓坐标列表
     */
    private List<HandwritingGetBBox> bbox;

    /**
     * 句子唯一标识符
     */
    private String sentenceId;

    /**
     * 句子文本内容
     */
    private String text;

    /**
     * 仅字级和行级粒度返回，句行映射片段，描述该句子对应的行及起止位置
     */
    private List<LineSegment> lineSegments;

    public Sentence setBbox(List<HandwritingGetBBox> bbox) {
        this.bbox = bbox;
        return this;
    }

    public List<HandwritingGetBBox> getBbox() {
        return this.bbox;
    }

    public Sentence setSentenceId(String sentenceId) {
        this.sentenceId = sentenceId;
        return this;
    }

    public String getSentenceId() {
        return this.sentenceId;
    }

    public Sentence setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public Sentence setLineSegments(List<LineSegment> lineSegments) {
        this.lineSegments = lineSegments;
        return this;
    }

    public List<LineSegment> getLineSegments() {
        return this.lineSegments;
    }

    @Override
    public String toString() {
        return "Sentence{" + "bbox=" + bbox + "\n" + "sentenceId=" + sentenceId + "\n" + "text=" + text + "\n" + "lineSegments=" + lineSegments + "\n" + "}";
    }

}