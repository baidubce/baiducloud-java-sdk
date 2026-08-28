package com.baidubce.ocr.models;

/**
 * Gets or Sets PaddleVlParserTaskStatusEnum
 */
public enum PaddleVlParserTaskStatusEnum {

    PENDING("pending"),

    PROCESSING("processing"),

    SUCCESS("success"),

    FAILED("failed");

    private String value;

    PaddleVlParserTaskStatusEnum(String value) {
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