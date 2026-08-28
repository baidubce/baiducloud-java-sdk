package com.baidubce.ocr.models;

/**
 * Gets or Sets NumbersRecognizeGranularityEnum
 */
public enum NumbersRecognizeGranularityEnum {

    BIG("big"),

    SMALL("small");

    private String value;

    NumbersRecognizeGranularityEnum(String value) {
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