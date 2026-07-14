package com.baidubce.as.models;

/**
 * Gets or Sets State
 */
public enum State {

    ENABLE("ENABLE"),

    DISABLE("DISABLE");

    private String value;

    State(String value) {
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