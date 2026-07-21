package com.baidubce.as.models;

/**
 * Gets or Sets IncCmdStrategy
 */
public enum IncCmdStrategy {

    PROCEED("Proceed"),

    PAUSE("Pause");

    private String value;

    IncCmdStrategy(String value) {
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