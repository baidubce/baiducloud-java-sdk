package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandwritingGetEssayOverall {
    /**
     * 作文题目文本
     */
    private String titleText;

    /**
     * 作文正文文本
     */
    private String contentText;

    public HandwritingGetEssayOverall setTitleText(String titleText) {
        this.titleText = titleText;
        return this;
    }

    public String getTitleText() {
        return this.titleText;
    }

    public HandwritingGetEssayOverall setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

    public String getContentText() {
        return this.contentText;
    }

    @Override
    public String toString() {
        return "HandwritingGetEssayOverall{" + "titleText=" + titleText + "\n" + "contentText=" + contentText + "\n" + "}";
    }

}