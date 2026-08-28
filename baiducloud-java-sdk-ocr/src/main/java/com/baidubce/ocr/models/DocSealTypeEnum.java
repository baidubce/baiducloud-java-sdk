package com.baidubce.ocr.models;

/**
 * Gets or Sets DocSealTypeEnum
 */
public enum DocSealTypeEnum {

    CIRCLE("circle"),

    ELLIPSE("ellipse"),

    RECTANGLE("rectangle");

    private String value;

    DocSealTypeEnum(String value) {
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