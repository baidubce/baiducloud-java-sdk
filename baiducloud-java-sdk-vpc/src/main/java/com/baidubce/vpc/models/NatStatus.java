package com.baidubce.vpc.models;

/**
 * Gets or Sets NatStatus
 */
public enum NatStatus {

    ACTIVE("active"),

    UPDATING("updating"),

    UNCONFIGURED("unconfigured"),

    DOWN("down"),

    BUILDING("building"),

    ERROR("error"),

    DELETING("deleting"),

    DELETED("deleted"),

    STARTING("starting"),

    CONFIGURING("configuring"),

    REBOOTING("rebooting"),

    STOPPING("stopping");

    private String value;

    NatStatus(String value) {
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