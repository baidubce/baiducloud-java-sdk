package com.baidubce.face.models;

/**
 * Gets or Sets FaceUpdateActionEnum
 */
public enum FaceUpdateActionEnum {

    UPDATE("UPDATE"),

    REPLACE("REPLACE");

    private String value;

    FaceUpdateActionEnum(String value) {
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