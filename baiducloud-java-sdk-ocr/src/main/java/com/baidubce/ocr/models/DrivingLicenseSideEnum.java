package com.baidubce.ocr.models;

/**
 * Gets or Sets DrivingLicenseSideEnum
 */
public enum DrivingLicenseSideEnum {

    FRONT("front"),

    BACK("back");

    private String value;

    DrivingLicenseSideEnum(String value) {
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