package com.baidubce.cloudassistant.models;

/**
 * Gets or Sets Id
 */
public enum Id {

    COMMAND("COMMAND"),

    FILE_UPLOAD("FILE_UPLOAD");

    private String value;

    Id(String value) {
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