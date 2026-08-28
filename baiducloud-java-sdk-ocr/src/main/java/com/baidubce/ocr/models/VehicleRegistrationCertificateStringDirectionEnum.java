package com.baidubce.ocr.models;

/**
 * Gets or Sets VehicleRegistrationCertificateStringDirectionEnum
 */
public enum VehicleRegistrationCertificateStringDirectionEnum {

    VALUE_MINUS_1("-1"),

    VALUE_0("0"),

    VALUE_1("1"),

    VALUE_2("2"),

    VALUE_3("3");

    private String value;

    VehicleRegistrationCertificateStringDirectionEnum(String value) {
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