package com.baidubce.face.models;

/**
 * Gets or Sets FaceMergeDegreeEnum
 */
public enum FaceMergeDegreeEnum {

    LOW("LOW"),

    NORMAL("NORMAL"),

    HIGH("HIGH"),

    COMPLETE("COMPLETE");

    private String value;

    FaceMergeDegreeEnum(String value) {
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