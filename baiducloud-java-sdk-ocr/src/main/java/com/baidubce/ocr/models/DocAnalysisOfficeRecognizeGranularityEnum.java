package com.baidubce.ocr.models;

/**
 * Gets or Sets DocAnalysisOfficeRecognizeGranularityEnum
 */
public enum DocAnalysisOfficeRecognizeGranularityEnum {

    BIG("big"),

    SMALL("small");

    private String value;

    DocAnalysisOfficeRecognizeGranularityEnum(String value) {
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