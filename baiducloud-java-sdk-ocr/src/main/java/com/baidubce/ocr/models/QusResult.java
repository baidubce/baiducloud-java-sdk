package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QusResult {
    /**
     * 检测到的题目类型
     */
    @JsonProperty("qus_type")
    private String qusType;

    /**
     * 题目置信度
     */
    @JsonProperty("qus_probability")
    private Double qusProbability;

    /**
     * elemText
     */
    @JsonProperty("elem_text")
    private ElemText elemText;

    /**
     * qusLocation
     */
    @JsonProperty("qus_location")
    private QusLocation qusLocation;

    /**
     * 题目元素信息
     */
    @JsonProperty("qus_element")
    private List<QusElement> qusElement;

    public QusResult setQusType(String qusType) {
        this.qusType = qusType;
        return this;
    }

    public String getQusType() {
        return this.qusType;
    }

    public QusResult setQusProbability(Double qusProbability) {
        this.qusProbability = qusProbability;
        return this;
    }

    public Double getQusProbability() {
        return this.qusProbability;
    }

    public QusResult setElemText(ElemText elemText) {
        this.elemText = elemText;
        return this;
    }

    public ElemText getElemText() {
        return this.elemText;
    }

    public QusResult setQusLocation(QusLocation qusLocation) {
        this.qusLocation = qusLocation;
        return this;
    }

    public QusLocation getQusLocation() {
        return this.qusLocation;
    }

    public QusResult setQusElement(List<QusElement> qusElement) {
        this.qusElement = qusElement;
        return this;
    }

    public List<QusElement> getQusElement() {
        return this.qusElement;
    }

    @Override
    public String toString() {
        return "QusResult{" + "qusType=" + qusType + "\n" + "qusProbability=" + qusProbability + "\n" + "elemText=" + elemText + "\n" + "qusLocation=" + qusLocation + "\n"
                + "qusElement=" + qusElement + "\n" + "}";
    }

}