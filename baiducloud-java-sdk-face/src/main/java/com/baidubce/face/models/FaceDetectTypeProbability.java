package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceDetectTypeProbability {
    /**
     * 类型
     */
    private String type;

    /**
     * 置信度，范围0~1
     */
    private Double probability;

    public FaceDetectTypeProbability setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public FaceDetectTypeProbability setProbability(Double probability) {
        this.probability = probability;
        return this;
    }

    public Double getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "FaceDetectTypeProbability{" + "type=" + type + "\n" + "probability=" + probability + "\n" + "}";
    }

}