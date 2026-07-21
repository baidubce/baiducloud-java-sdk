package com.baidubce.as.models;

/**
 * Gets or Sets ShrinkageStrategy
 */
public enum ShrinkageStrategy {

    EARLIER("Earlier"),

    LATER("Later");

    private String value;

    ShrinkageStrategy(String value) {
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