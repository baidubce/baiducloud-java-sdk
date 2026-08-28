package com.baidubce.ocr.models;

/**
 * Gets or Sets AccuracyEnum
 */
public enum AccuracyEnum {

    NORMAL("normal"),

    HIGH("high");

    private String value;

    AccuracyEnum(String value) {
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