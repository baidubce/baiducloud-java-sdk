package com.baidubce.cloudassistant.models;

/**
 * Gets or Sets KeywordType
 */
public enum KeywordType {

    INSTANCEID("instanceId"),

    INTERNALIP("internalIp");

    private String value;

    KeywordType(String value) {
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