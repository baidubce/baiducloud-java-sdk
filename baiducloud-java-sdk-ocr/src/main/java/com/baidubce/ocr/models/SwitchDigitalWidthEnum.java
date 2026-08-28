package com.baidubce.ocr.models;

/**
 * Gets or Sets SwitchDigitalWidthEnum
 */
public enum SwitchDigitalWidthEnum {

    AUTO("auto"),

    HALF("half"),

    FULL("full");

    private String value;

    SwitchDigitalWidthEnum(String value) {
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