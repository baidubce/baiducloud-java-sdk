package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Paragraph {
    /**
     * 仅字级和行级粒度返回，段落轮廓坐标列表，可能含多个框
     */
    private List<HandwritingGetBBox> bbox;

    /**
     * 段落唯一标识符（如p1）
     */
    private String paragraphId;

    /**
     * 仅字级和行级粒度返回，是否分栏。1：分栏，0：不分栏
     */
    private Integer isColumn;

    /**
     * 段落完整文本
     */
    private String text;

    /**
     * 段落内的句子列表
     */
    private List<Sentence> sentences;

    public Paragraph setBbox(List<HandwritingGetBBox> bbox) {
        this.bbox = bbox;
        return this;
    }

    public List<HandwritingGetBBox> getBbox() {
        return this.bbox;
    }

    public Paragraph setParagraphId(String paragraphId) {
        this.paragraphId = paragraphId;
        return this;
    }

    public String getParagraphId() {
        return this.paragraphId;
    }

    public Paragraph setIsColumn(Integer isColumn) {
        this.isColumn = isColumn;
        return this;
    }

    public Integer getIsColumn() {
        return this.isColumn;
    }

    public Paragraph setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public Paragraph setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
        return this;
    }

    public List<Sentence> getSentences() {
        return this.sentences;
    }

    @Override
    public String toString() {
        return "Paragraph{" + "bbox=" + bbox + "\n" + "paragraphId=" + paragraphId + "\n" + "isColumn=" + isColumn + "\n" + "text=" + text + "\n" + "sentences=" + sentences + "\n"
                + "}";
    }

}