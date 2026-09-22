package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MaskInfo {
    /**
     * 0-没戴口罩；1-戴口罩
     */
    private Integer type;

    /**
     * 置信度，范围0~1
     */
    private Double probability;

    public MaskInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    public MaskInfo setProbability(Double probability) {
        this.probability = probability;
        return this;
    }

    public Double getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "MaskInfo{" + "type=" + type + "\n" + "probability=" + probability + "\n" + "}";
    }

}