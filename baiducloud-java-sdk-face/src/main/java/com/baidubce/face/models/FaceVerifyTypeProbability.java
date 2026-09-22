package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceVerifyTypeProbability {
    /**
     * 类型
     */
    private String type;

    /**
     * 置信度，范围【0~1】，0最小、1最大
     */
    private Double probability;

    public FaceVerifyTypeProbability setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public FaceVerifyTypeProbability setProbability(Double probability) {
        this.probability = probability;
        return this;
    }

    public Double getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "FaceVerifyTypeProbability{" + "type=" + type + "\n" + "probability=" + probability + "\n" + "}";
    }

}