package com.baidubce.ocr.models;

/**
 * Gets or Sets AccurateRecognizeGranularityEnum
 */
public enum AccurateRecognizeGranularityEnum {

    BIG("big"),

    SMALL("small");

    private String value;

    AccurateRecognizeGranularityEnum(String value) {
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