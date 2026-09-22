package com.baidubce.face.models;

/**
 * Gets or Sets FaceTypeEnum
 */
public enum FaceTypeEnum {

    LIVE("LIVE"),

    IDCARD("IDCARD"),

    WATERMARK("WATERMARK"),

    CERT("CERT"),

    INFRARED("INFRARED"),

    HYBRID("HYBRID");

    private String value;

    FaceTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}