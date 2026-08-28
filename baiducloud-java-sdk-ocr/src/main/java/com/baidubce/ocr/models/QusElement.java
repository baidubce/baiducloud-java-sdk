package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QusElement {
    /**
     * 题目元素类型
     */
    @JsonProperty("elem_type")
    private String elemType;

    /**
     * 题目元素置信度
     */
    @JsonProperty("elem_probability")
    private Double elemProbability;

    /**
     * elemLocation
     */
    @JsonProperty("elem_location")
    private ElemLocation elemLocation;

    /**
     * 题目元素的文本信息
     */
    @JsonProperty("elem_word")
    private List<ElemWord> elemWord;

    public QusElement setElemType(String elemType) {
        this.elemType = elemType;
        return this;
    }

    public String getElemType() {
        return this.elemType;
    }

    public QusElement setElemProbability(Double elemProbability) {
        this.elemProbability = elemProbability;
        return this;
    }

    public Double getElemProbability() {
        return this.elemProbability;
    }

    public QusElement setElemLocation(ElemLocation elemLocation) {
        this.elemLocation = elemLocation;
        return this;
    }

    public ElemLocation getElemLocation() {
        return this.elemLocation;
    }

    public QusElement setElemWord(List<ElemWord> elemWord) {
        this.elemWord = elemWord;
        return this;
    }

    public List<ElemWord> getElemWord() {
        return this.elemWord;
    }

    @Override
    public String toString() {
        return "QusElement{" + "elemType=" + elemType + "\n" + "elemProbability=" + elemProbability + "\n" + "elemLocation=" + elemLocation + "\n" + "elemWord=" + elemWord + "\n"
                + "}";
    }

}