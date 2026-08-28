package com.baidubce.ocr.models;

/**
 * Gets or Sets MultiIdcardRiskTypeEnum
 */
public enum MultiIdcardRiskTypeEnum {

    NORMAL("normal"),

    COPY("copy"),

    SCREEN("screen"),

    SCAN("scan");

    private String value;

    MultiIdcardRiskTypeEnum(String value) {
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