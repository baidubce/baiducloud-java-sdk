package com.baidubce.as.models;

/**
 * Gets or Sets ExpansionStrategy
 */
public enum ExpansionStrategy {

    PRIORITY("Priority"),

    BALANCED("Balanced");

    private String value;

    ExpansionStrategy(String value) {
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