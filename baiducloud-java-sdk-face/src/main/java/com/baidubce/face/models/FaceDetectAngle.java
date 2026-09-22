package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceDetectAngle {
    /**
     * 
     */
    private Double yaw;

    /**
     * 
     */
    private Double pitch;

    /**
     * 
     */
    private Double roll;

    public FaceDetectAngle setYaw(Double yaw) {
        this.yaw = yaw;
        return this;
    }

    public Double getYaw() {
        return this.yaw;
    }

    public FaceDetectAngle setPitch(Double pitch) {
        this.pitch = pitch;
        return this;
    }

    public Double getPitch() {
        return this.pitch;
    }

    public FaceDetectAngle setRoll(Double roll) {
        this.roll = roll;
        return this;
    }

    public Double getRoll() {
        return this.roll;
    }

    @Override
    public String toString() {
        return "FaceDetectAngle{" + "yaw=" + yaw + "\n" + "pitch=" + pitch + "\n" + "roll=" + roll + "\n" + "}";
    }

}