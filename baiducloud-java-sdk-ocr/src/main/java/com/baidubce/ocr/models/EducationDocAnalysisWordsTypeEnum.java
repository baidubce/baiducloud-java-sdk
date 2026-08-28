package com.baidubce.ocr.models;

/**
 * Gets or Sets EducationDocAnalysisWordsTypeEnum
 */
public enum EducationDocAnalysisWordsTypeEnum {

    HANDWRING_ONLY("handwring_only"),

    HANDPRINT_MIX("handprint_mix");

    private String value;

    EducationDocAnalysisWordsTypeEnum(String value) {
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