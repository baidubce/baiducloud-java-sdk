package com.baidubce.vpc.models;

/**
 * Gets or Sets DnsStatus
 */
public enum DnsStatus {

    CLOSE("close"),

    WAIT("wait"),

    SYNCING("syncing"),

    OPEN("open"),

    CLOSING("closing");

    private String value;

    DnsStatus(String value) {
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