package com.baidubce.face.models;

/**
 * Gets or Sets FaceImageTypeEnum
 */
public enum FaceImageTypeEnum {

    BASE64("BASE64"),

    FACE_TOKEN("FACE_TOKEN");

    private String value;

    FaceImageTypeEnum(String value) {
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