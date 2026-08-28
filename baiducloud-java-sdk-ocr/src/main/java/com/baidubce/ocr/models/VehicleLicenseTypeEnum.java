package com.baidubce.ocr.models;

/**
 * Gets or Sets VehicleLicenseTypeEnum
 */
public enum VehicleLicenseTypeEnum {

    VEHICLE_FRONT("vehicle_front"),

    VEHICLE_BACK("vehicle_back"),

    DRIVING_FRONT("driving_front"),

    DRIVING_BACK("driving_back");

    private String value;

    VehicleLicenseTypeEnum(String value) {
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