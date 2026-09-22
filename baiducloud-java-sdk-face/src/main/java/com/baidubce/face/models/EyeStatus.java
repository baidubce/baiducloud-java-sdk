package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EyeStatus {
    /**
     * 左眼状态，[0,1]，越接近0闭合可能性越大
     */
    @JsonProperty("left_eye")
    private Double leftEye;

    /**
     * 右眼状态，[0,1]，越接近0闭合可能性越大
     */
    @JsonProperty("right_eye")
    private Double rightEye;

    public EyeStatus setLeftEye(Double leftEye) {
        this.leftEye = leftEye;
        return this;
    }

    public Double getLeftEye() {
        return this.leftEye;
    }

    public EyeStatus setRightEye(Double rightEye) {
        this.rightEye = rightEye;
        return this;
    }

    public Double getRightEye() {
        return this.rightEye;
    }

    @Override
    public String toString() {
        return "EyeStatus{" + "leftEye=" + leftEye + "\n" + "rightEye=" + rightEye + "\n" + "}";
    }

}