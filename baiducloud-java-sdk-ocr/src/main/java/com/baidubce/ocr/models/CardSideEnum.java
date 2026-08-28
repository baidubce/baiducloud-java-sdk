package com.baidubce.ocr.models;

/**
 * Gets or Sets CardSideEnum
 */
public enum CardSideEnum {

    IDCARD_FRONT("idcard_front"),

    IDCARD_BACK("idcard_back");

    private String value;

    CardSideEnum(String value) {
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