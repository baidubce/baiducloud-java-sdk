package com.baidubce.ocr.models;

/**
 * Gets or Sets EducationCorrectEduTaskStatusEnum
 */
public enum EducationCorrectEduTaskStatusEnum {

    PENDING("pending"),

    PROCESSING("processing"),

    SUCCESS("success"),

    FAILED("failed");

    private String value;

    EducationCorrectEduTaskStatusEnum(String value) {
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