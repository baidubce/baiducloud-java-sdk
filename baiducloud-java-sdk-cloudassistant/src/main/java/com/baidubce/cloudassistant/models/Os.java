package com.baidubce.cloudassistant.models;

/**
 * Gets or Sets Os
 */
public enum Os {

    LINUX("LINUX"),

    WINDOWS("WINDOWS");

    private String value;

    Os(String value) {
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