package com.baidubce.ocr.models;

/**
 * Gets or Sets WebImageLocRecognizeGranularityEnum
 */
public enum WebImageLocRecognizeGranularityEnum {

    BIG("big"),

    SMALL("small");

    private String value;

    WebImageLocRecognizeGranularityEnum(String value) {
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