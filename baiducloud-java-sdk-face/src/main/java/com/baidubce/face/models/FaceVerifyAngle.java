package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceVerifyAngle {
    /**
     * 三维旋转之左右旋转角[-90(左), 90(右)]
     */
    private Double yaw;

    /**
     * 三维旋转之俯仰角度[-90(上), 90(下)]
     */
    private Double pitch;

    /**
     * 平面内旋转角[-180(逆时针), 180(顺时针)]
     */
    private Double roll;

    public FaceVerifyAngle setYaw(Double yaw) {
        this.yaw = yaw;
        return this;
    }

    public Double getYaw() {
        return this.yaw;
    }

    public FaceVerifyAngle setPitch(Double pitch) {
        this.pitch = pitch;
        return this;
    }

    public Double getPitch() {
        return this.pitch;
    }

    public FaceVerifyAngle setRoll(Double roll) {
        this.roll = roll;
        return this;
    }

    public Double getRoll() {
        return this.roll;
    }

    @Override
    public String toString() {
        return "FaceVerifyAngle{" + "yaw=" + yaw + "\n" + "pitch=" + pitch + "\n" + "roll=" + roll + "\n" + "}";
    }

}