package com.baidubce.ocr.models;

/**
 * Gets or Sets GeneralRecognizeGranularityEnum
 */
public enum GeneralRecognizeGranularityEnum {

    BIG("big"),

    SMALL("small");

    private String value;

    GeneralRecognizeGranularityEnum(String value) {
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