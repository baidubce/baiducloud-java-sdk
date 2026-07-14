package com.baidubce.as.models;

/**
 * Gets or Sets Status
 */
public enum Status {

    CREATING("CREATING"),

    RUNNING("RUNNING"),

    SCALING_UP("SCALING_UP"),

    SCALING_DOWN("SCALING_DOWN"),

    ATTACHING_NODE("ATTACHING_NODE"),

    DETACHING_NODE("DETACHING_NODE"),

    DELETING("DELETING"),

    BINDING_BLB("BINDING_BLB"),

    UNBINDING_BLB("UNBINDING_BLB"),

    COOLDOWN("COOLDOWN"),

    PAUSE("PAUSE"),

    DELETED("DELETED");

    private String value;

    Status(String value) {
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