package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Line {
    /**
     * 行的唯一标识符
     */
    private String lineId;

    /**
     * 该行的文本内容
     */
    private String text;

    /**
     * bbox
     */
    private HandwritingGetBBox bbox;

    /**
     * 该行所属段落的ID，关联paragraphs
     */
    private String paragraphId;

    /**
     * 仅字级粒度返回，行内单字/字符详细列表
     */
    private List<HandwritingGetCharInfo> chars;

    public Line setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }

    public String getLineId() {
        return this.lineId;
    }

    public Line setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public Line setBbox(HandwritingGetBBox bbox) {
        this.bbox = bbox;
        return this;
    }

    public HandwritingGetBBox getBbox() {
        return this.bbox;
    }

    public Line setParagraphId(String paragraphId) {
        this.paragraphId = paragraphId;
        return this;
    }

    public String getParagraphId() {
        return this.paragraphId;
    }

    public Line setChars(List<HandwritingGetCharInfo> chars) {
        this.chars = chars;
        return this;
    }

    public List<HandwritingGetCharInfo> getChars() {
        return this.chars;
    }

    @Override
    public String toString() {
        return "Line{" + "lineId=" + lineId + "\n" + "text=" + text + "\n" + "bbox=" + bbox + "\n" + "paragraphId=" + paragraphId + "\n" + "chars=" + chars + "\n" + "}";
    }

}