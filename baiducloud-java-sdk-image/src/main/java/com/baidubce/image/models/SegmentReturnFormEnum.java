package com.baidubce.image.models;

/**
 * Gets or Sets SegmentReturnFormEnum
 */
public enum SegmentReturnFormEnum {

    RGBA("rgba"),

    MASK("mask");

    private String value;

    SegmentReturnFormEnum(String value) {
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