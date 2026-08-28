package com.baidubce.ocr.models;

/**
 * Gets or Sets IdCardSideEnum
 */
public enum IdCardSideEnum {

    FRONT("front"),

    BACK("back");

    private String value;

    IdCardSideEnum(String value) {
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