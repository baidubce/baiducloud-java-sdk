package com.baidubce.bcc.models;

/**
 * Gets or Sets VolumeStatus
 */
public enum VolumeStatus {

    CREATING("Creating"),

    AVAILABLE("Available"),

    ATTACHING("Attaching"),

    NOTAVAILABLE("NotAvailable"),

    INUSE("InUse"),

    DETACHING("Detaching"),

    DELETING("Deleting"),

    DELETED("Deleted"),

    SCALING("Scaling"),

    EXPIRED("Expired"),

    ERROR("Error"),

    SNAPSHOTPROCESSING("SnapshotProcessing"),

    IMAGEPROCESSING("ImageProcessing"),

    RECHARGING("Recharging");

    private String value;

    VolumeStatus(String value) {
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