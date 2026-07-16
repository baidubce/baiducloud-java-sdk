package com.baidubce.cloudassistant.models;

/**
 * Gets or Sets ActionType
 */
public enum ActionType {

    COMMAND("COMMAND"),

    FILE_UPLOAD("FILE_UPLOAD");

    private String value;

    ActionType(String value) {
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