package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Title {
    /**
     * 仅字级和行级粒度返回，标题外接矩形坐标
     */
    private List<HandwritingGetBBox> bbox;

    /**
     * 标题文本内容
     */
    private String text;

    /**
     * 仅字级粒度返回，标题字级别详细列表
     */
    private List<HandwritingGetCharInfo> chars;

    public Title setBbox(List<HandwritingGetBBox> bbox) {
        this.bbox = bbox;
        return this;
    }

    public List<HandwritingGetBBox> getBbox() {
        return this.bbox;
    }

    public Title setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public Title setChars(List<HandwritingGetCharInfo> chars) {
        this.chars = chars;
        return this;
    }

    public List<HandwritingGetCharInfo> getChars() {
        return this.chars;
    }

    @Override
    public String toString() {
        return "Title{" + "bbox=" + bbox + "\n" + "text=" + text + "\n" + "chars=" + chars + "\n" + "}";
    }

}