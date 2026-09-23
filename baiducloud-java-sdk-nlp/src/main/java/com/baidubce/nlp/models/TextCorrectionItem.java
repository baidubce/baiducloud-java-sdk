package com.baidubce.nlp.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextCorrectionItem {
    /**
     * 纠错前的文本
     */
    private String text;

    /**
     * 纠错后的文本
     */
    @JsonProperty("correct_query")
    private String correctQuery;

    /**
     * content的长度
     */
    @JsonProperty("content_len")
    private Integer contentLen;

    /**
     * 纠错信息列表
     */
    private List<TextCorrectionDetail> details;

    /**
     * 纠错片段数量
     */
    @JsonProperty("error_num")
    private Integer errorNum;

    public TextCorrectionItem setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public TextCorrectionItem setCorrectQuery(String correctQuery) {
        this.correctQuery = correctQuery;
        return this;
    }

    public String getCorrectQuery() {
        return this.correctQuery;
    }

    public TextCorrectionItem setContentLen(Integer contentLen) {
        this.contentLen = contentLen;
        return this;
    }

    public Integer getContentLen() {
        return this.contentLen;
    }

    public TextCorrectionItem setDetails(List<TextCorrectionDetail> details) {
        this.details = details;
        return this;
    }

    public List<TextCorrectionDetail> getDetails() {
        return this.details;
    }

    public TextCorrectionItem setErrorNum(Integer errorNum) {
        this.errorNum = errorNum;
        return this;
    }

    public Integer getErrorNum() {
        return this.errorNum;
    }

    @Override
    public String toString() {
        return "TextCorrectionItem{" + "text=" + text + "\n" + "correctQuery=" + correctQuery + "\n" + "contentLen=" + contentLen + "\n" + "details=" + details + "\n"
                + "errorNum=" + errorNum + "\n" + "}";
    }

}