package com.baidubce.cloudassistant.models;

/**
 * Gets or Sets Execution
 */
public enum Execution {

    SAVE("SAVE"),

    RUN("RUN"),

    SAVE_AND_RUN("SAVE_AND_RUN");

    private String value;

    Execution(String value) {
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