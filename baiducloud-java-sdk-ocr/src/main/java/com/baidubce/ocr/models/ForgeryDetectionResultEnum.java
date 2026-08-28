package com.baidubce.ocr.models;

/**
 * Gets or Sets ForgeryDetectionResultEnum
 */
public enum ForgeryDetectionResultEnum {

    FAKE("fake"),

    REAL("real");

    private String value;

    ForgeryDetectionResultEnum(String value) {
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