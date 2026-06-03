package com.baidubce.rapidfs.models;

/**
 * Gets or Sets BsmAgentStatus
 */
public enum BsmAgentStatus {

    ONLINE("ONLINE"),

    OFFLINE("OFFLINE");

    private String value;

    BsmAgentStatus(String value) {
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