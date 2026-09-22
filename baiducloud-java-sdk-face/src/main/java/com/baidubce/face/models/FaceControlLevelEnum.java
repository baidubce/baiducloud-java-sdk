package com.baidubce.face.models;

/**
 * Gets or Sets FaceControlLevelEnum
 */
public enum FaceControlLevelEnum {

    NONE("NONE"),

    LOW("LOW"),

    NORMAL("NORMAL"),

    HIGH("HIGH");

    private String value;

    FaceControlLevelEnum(String value) {
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