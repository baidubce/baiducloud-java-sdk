package com.baidubce.ocr.models;

/**
 * Gets or Sets BusinessLicenseRiskTypeEnum
 */
public enum BusinessLicenseRiskTypeEnum {

    NORMAL("normal"),

    COPY("copy"),

    SCREEN("screen"),

    SCAN("scan");

    private String value;

    BusinessLicenseRiskTypeEnum(String value) {
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