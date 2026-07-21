package com.baidubce.as.models;

/**
 * Gets or Sets DecCmdStrategy
 */
public enum DecCmdStrategy {

    PROCEED("Proceed"),

    PAUSE("Pause");

    private String value;

    DecCmdStrategy(String value) {
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