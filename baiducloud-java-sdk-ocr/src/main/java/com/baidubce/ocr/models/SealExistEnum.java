package com.baidubce.ocr.models;

/**
 * Gets or Sets SealExistEnum
 */
public enum SealExistEnum {

    VALUE_0("0"),

    VALUE_1("1");

    private String value;

    SealExistEnum(String value) {
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