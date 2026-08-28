package com.baidubce.ocr.models;

/**
 * Gets or Sets EducationPaperCutEduVlmTaskStatusEnum
 */
public enum EducationPaperCutEduVlmTaskStatusEnum {

    PENDING("pending"),

    PROCESSING("processing"),

    SUCCESS("success"),

    FAILED("failed");

    private String value;

    EducationPaperCutEduVlmTaskStatusEnum(String value) {
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