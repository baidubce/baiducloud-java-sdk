package com.baidubce.bcc.models;

/**
 * Gets or Sets ImageStatus
 */
public enum ImageStatus {

    CREATING("Creating"),

    CREATEDFAILED("CreatedFailed"),

    AVAILABLE("Available"),

    NOTAVAILABLE("NotAvailable"),

    ERROR("Error");

    private String value;

    ImageStatus(String value) {
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