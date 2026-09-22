package com.baidubce.face.models;

/**
 * Gets or Sets FaceRegisterActionEnum
 */
public enum FaceRegisterActionEnum {

    APPEND("APPEND"),

    REPLACE("REPLACE");

    private String value;

    FaceRegisterActionEnum(String value) {
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