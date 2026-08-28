package com.baidubce.ocr.models;

/**
 * Gets or Sets VehicleLicenseRiskTypeEnum
 */
public enum VehicleLicenseRiskTypeEnum {

    NORMAL("normal"),

    COPY("copy"),

    SCREEN("screen");

    private String value;

    VehicleLicenseRiskTypeEnum(String value) {
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