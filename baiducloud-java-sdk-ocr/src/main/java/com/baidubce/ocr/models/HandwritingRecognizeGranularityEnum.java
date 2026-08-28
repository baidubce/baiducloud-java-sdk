package com.baidubce.ocr.models;

/**
 * Gets or Sets HandwritingRecognizeGranularityEnum
 */
public enum HandwritingRecognizeGranularityEnum {

    BIG("big"),

    SMALL("small");

    private String value;

    HandwritingRecognizeGranularityEnum(String value) {
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