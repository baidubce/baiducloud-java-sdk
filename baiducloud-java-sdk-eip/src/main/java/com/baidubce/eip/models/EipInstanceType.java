package com.baidubce.eip.models;

/**
 * Gets or Sets EipInstanceType
 */
public enum EipInstanceType {

    NORMAL("normal"),

    SHARED("shared");

    private String value;

    EipInstanceType(String value) {
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