package com.baidubce.as.models;

/**
 * Gets or Sets Type
 */
public enum Type {

    CRONTAB("CRONTAB"),

    ALARM("ALARM"),

    PERIOD("PERIOD");

    private String value;

    Type(String value) {
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