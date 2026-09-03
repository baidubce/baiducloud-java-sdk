package com.baidubce.image.models;

/**
 * Gets or Sets SegmentMethodEnum
 */
public enum SegmentMethodEnum {

    AUTO("auto"),

    CONTROL("control");

    private String value;

    SegmentMethodEnum(String value) {
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