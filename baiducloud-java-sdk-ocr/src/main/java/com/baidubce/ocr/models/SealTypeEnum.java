package com.baidubce.ocr.models;

/**
 * Gets or Sets SealTypeEnum
 */
public enum SealTypeEnum {

    CIRCLE("circle"),

    ELLIPSE("ellipse"),

    RECTANGLE("rectangle"),

    PERFORATION("perforation");

    private String value;

    SealTypeEnum(String value) {
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