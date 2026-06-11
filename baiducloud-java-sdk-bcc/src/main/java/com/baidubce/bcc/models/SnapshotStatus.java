package com.baidubce.bcc.models;

/**
 * Gets or Sets SnapshotStatus
 */
public enum SnapshotStatus {

    CREATING("Creating"),

    CREATEDFAILED("CreatedFailed"),

    AVAILABLE("Available"),

    NOTAVAILABLE("NotAvailable");

    private String value;

    SnapshotStatus(String value) {
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