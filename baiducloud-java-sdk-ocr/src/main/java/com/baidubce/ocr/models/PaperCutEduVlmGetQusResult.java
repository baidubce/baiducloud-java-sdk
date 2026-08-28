package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaperCutEduVlmGetQusResult {
    /**
     * 题号
     */
    @JsonProperty("qus_id")
    private Integer qusId;

    /**
     * location
     */
    private PaperCutEduVlmLocation location;

    /**
     * qusElements
     */
    @JsonProperty("qus_elements")
    private QusElements qusElements;

    public PaperCutEduVlmGetQusResult setQusId(Integer qusId) {
        this.qusId = qusId;
        return this;
    }

    public Integer getQusId() {
        return this.qusId;
    }

    public PaperCutEduVlmGetQusResult setLocation(PaperCutEduVlmLocation location) {
        this.location = location;
        return this;
    }

    public PaperCutEduVlmLocation getLocation() {
        return this.location;
    }

    public PaperCutEduVlmGetQusResult setQusElements(QusElements qusElements) {
        this.qusElements = qusElements;
        return this;
    }

    public QusElements getQusElements() {
        return this.qusElements;
    }

    @Override
    public String toString() {
        return "PaperCutEduVlmGetQusResult{" + "qusId=" + qusId + "\n" + "location=" + location + "\n" + "qusElements=" + qusElements + "\n" + "}";
    }

}