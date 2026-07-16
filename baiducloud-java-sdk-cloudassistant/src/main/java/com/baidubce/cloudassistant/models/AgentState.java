package com.baidubce.cloudassistant.models;

/**
 * Gets or Sets AgentState
 */
public enum AgentState {

    ONLINE("ONLINE"),

    OFFLINE("OFFLINE");

    private String value;

    AgentState(String value) {
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