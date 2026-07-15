package com.baidubce.cloudassistant.models;

/**
 * Gets or Sets Scope
 */
public enum Scope {

    INDIVIDUAL("INDIVIDUAL"),

    GLOBAL("GLOBAL");

    private String value;

    Scope(String value) {
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