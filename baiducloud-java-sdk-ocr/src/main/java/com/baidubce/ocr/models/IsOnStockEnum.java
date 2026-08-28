package com.baidubce.ocr.models;

/**
 * Gets or Sets IsOnStockEnum
 */
public enum IsOnStockEnum {

    VALUE_0("0"),

    VALUE_1("1");

    private String value;

    IsOnStockEnum(String value) {
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