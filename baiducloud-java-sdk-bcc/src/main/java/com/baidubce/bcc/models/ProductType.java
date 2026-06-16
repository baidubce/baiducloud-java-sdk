package com.baidubce.bcc.models;

/**
 * Gets or Sets ProductType
 */
public enum ProductType {

    PREPAID("Prepaid"),

    POSTPAID("Postpaid");

    private String value;

    ProductType(String value) {
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