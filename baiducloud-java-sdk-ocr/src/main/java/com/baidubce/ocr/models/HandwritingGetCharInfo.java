package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandwritingGetCharInfo {
    /**
     * 该字符是否为标点符号
     */
    private String isPunctuation;

    /**
     * bbox
     */
    private HandwritingGetBBox bbox;

    /**
     * 单个字符
     */
    @JsonProperty("char")
    private String ocrChar;

    /**
     * 字符索引
     */
    private String index;

    public HandwritingGetCharInfo setIsPunctuation(String isPunctuation) {
        this.isPunctuation = isPunctuation;
        return this;
    }

    public String getIsPunctuation() {
        return this.isPunctuation;
    }

    public HandwritingGetCharInfo setBbox(HandwritingGetBBox bbox) {
        this.bbox = bbox;
        return this;
    }

    public HandwritingGetBBox getBbox() {
        return this.bbox;
    }

    public HandwritingGetCharInfo setChar(String ocrChar) {
        this.ocrChar = ocrChar;
        return this;
    }

    public String getChar() {
        return this.ocrChar;
    }

    public HandwritingGetCharInfo setIndex(String index) {
        this.index = index;
        return this;
    }

    public String getIndex() {
        return this.index;
    }

    @Override
    public String toString() {
        return "HandwritingGetCharInfo{" + "isPunctuation=" + isPunctuation + "\n" + "bbox=" + bbox + "\n" + "ocrChar=" + ocrChar + "\n" + "index=" + index + "\n" + "}";
    }

}