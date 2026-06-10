package com.baidubce.bcc.models;

/**
 * Gets or Sets VolumeType
 */
public enum VolumeType {

    SYSTEM("System"),

    EPHEMERAL("Ephemeral"),

    CDS("Cds");

    private String value;

    VolumeType(String value) {
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