package com.baidubce.vpc.models;

/**
 * Gets or Sets PeerConnStatus
 */
public enum PeerConnStatus {

    CREATING("creating"),

    CONSULTING("consulting"),

    CONSULT_FAILED("consult_failed"),

    ACTIVE("active"),

    DOWN("down"),

    STARTING("starting"),

    STOPPING("stopping"),

    DELETING("deleting"),

    DELETED("deleted"),

    EXPIRED("expired"),

    ERROR("error"),

    UPDATING("updating");

    private String value;

    PeerConnStatus(String value) {
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