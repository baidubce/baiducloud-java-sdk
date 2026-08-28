package com.baidubce.ocr.models;

/**
 * Gets or Sets ShieldStatusEnum
 */
public enum ShieldStatusEnum {

    VALUE_0("0"),

    VALUE_1("1");

    private String value;

    ShieldStatusEnum(String value) {
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