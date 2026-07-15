package com.baidubce.cloudassistant.models;

/**
 * Gets or Sets State
 */
public enum State {

    FAILED("FAILED"),

    RUNNING("RUNNING"),

    SUCCESS("SUCCESS");

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