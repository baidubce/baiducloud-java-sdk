package com.baidubce.cloudassistant.models;

/**
 * Gets or Sets Type
 */
public enum Type {

    SHELL("SHELL"),

    POWERSHELL("POWERSHELL");

    private String value;

    Type(String value) {
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