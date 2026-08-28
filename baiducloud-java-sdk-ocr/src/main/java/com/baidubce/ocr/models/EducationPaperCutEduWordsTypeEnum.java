package com.baidubce.ocr.models;

/**
 * Gets or Sets EducationPaperCutEduWordsTypeEnum
 */
public enum EducationPaperCutEduWordsTypeEnum {

    HANDWRING_ONLY("handwring_only"),

    HANDPRINT_MIX("handprint_mix");

    private String value;

    EducationPaperCutEduWordsTypeEnum(String value) {
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