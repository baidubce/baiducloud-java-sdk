package com.baidubce.cloudassistant.models;

/**
 * Gets or Sets CommandType
 */
public enum CommandType {

    SHELL("SHELL"),

    POWERSHELL("POWERSHELL");

    private String value;

    CommandType(String value) {
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