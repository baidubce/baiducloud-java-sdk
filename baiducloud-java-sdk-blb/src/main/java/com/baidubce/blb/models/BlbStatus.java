package com.baidubce.blb.models;

/**
 * Gets or Sets BlbStatus
 */
public enum BlbStatus {

    CREATING("creating"),

    AVAILABLE("available"),

    UPDATING("updating"),

    PAUSED("paused"),

    UNAVAILABLE("unavailable");

    private String value;

    BlbStatus(String value) {
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