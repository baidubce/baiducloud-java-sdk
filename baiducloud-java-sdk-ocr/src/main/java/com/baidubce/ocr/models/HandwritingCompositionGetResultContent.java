package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandwritingCompositionGetResultContent {
    /**
     * 仅字级和行级粒度返回，行级信息列表
     */
    private List<List<Line>> lines;

    /**
     * 段落级逻辑信息列表
     */
    private List<Paragraph> paragraphs;

    public HandwritingCompositionGetResultContent setLines(List<List<Line>> lines) {
        this.lines = lines;
        return this;
    }

    public List<List<Line>> getLines() {
        return this.lines;
    }

    public HandwritingCompositionGetResultContent setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
        return this;
    }

    public List<Paragraph> getParagraphs() {
        return this.paragraphs;
    }

    @Override
    public String toString() {
        return "HandwritingCompositionGetResultContent{" + "lines=" + lines + "\n" + "paragraphs=" + paragraphs + "\n" + "}";
    }

}