package com.baidubce.ocr.models;

/**
 * Gets or Sets ParserTaskStatusEnum
 */
public enum ParserTaskStatusEnum {

    PENDING("pending"),

    PROCESSING("processing"),

    SUCCESS("success"),

    FAILED("failed");

    private String value;

    ParserTaskStatusEnum(String value) {
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