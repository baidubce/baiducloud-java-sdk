package com.baidubce.cloudassistant.models;

/**
 * Gets or Sets InstanceType
 */
public enum InstanceType {

    BCC("BCC"),

    BBC("BBC");

    private String value;

    InstanceType(String value) {
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