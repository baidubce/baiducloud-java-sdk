package com.baidubce.ocr.models;

/**
 * Gets or Sets EducationDocAnalysisRecognizeGranularityEnum
 */
public enum EducationDocAnalysisRecognizeGranularityEnum {

    BIG("big"),

    SMALL("small");

    private String value;

    EducationDocAnalysisRecognizeGranularityEnum(String value) {
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