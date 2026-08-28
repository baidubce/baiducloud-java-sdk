package com.baidubce.ocr.models;

/**
 * Gets or Sets VehicleLicenseSideEnum
 */
public enum VehicleLicenseSideEnum {

    FRONT("front"),

    BACK("back");

    private String value;

    VehicleLicenseSideEnum(String value) {
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