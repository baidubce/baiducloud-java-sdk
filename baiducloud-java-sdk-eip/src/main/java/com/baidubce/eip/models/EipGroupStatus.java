package com.baidubce.eip.models;

/**
 * Gets or Sets EipGroupStatus
 */
public enum EipGroupStatus {

    AVAILABLE("available"),

    PAUSED("paused"),

    EXPIRED("expired"),

    DELETING("deleting");

    private String value;

    EipGroupStatus(String value) {
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