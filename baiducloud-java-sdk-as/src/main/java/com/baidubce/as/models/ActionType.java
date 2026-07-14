package com.baidubce.as.models;

/**
 * Gets or Sets ActionType
 */
public enum ActionType {

    INCREASE("INCREASE"),

    DECREASE("DECREASE"),

    ADJUST("ADJUST");

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