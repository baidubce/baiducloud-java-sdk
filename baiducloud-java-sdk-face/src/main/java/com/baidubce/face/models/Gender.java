package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Gender {
    /**
     * male:男性 female:女性
     */
    private String type;

    /**
     * 性别置信度，范围0~1
     */
    private Double probability;

    public Gender setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Gender setProbability(Double probability) {
        this.probability = probability;
        return this;
    }

    public Double getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "Gender{" + "type=" + type + "\n" + "probability=" + probability + "\n" + "}";
    }

}