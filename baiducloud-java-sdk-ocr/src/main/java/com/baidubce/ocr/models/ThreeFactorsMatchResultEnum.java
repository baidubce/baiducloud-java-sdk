package com.baidubce.ocr.models;

/**
 * Gets or Sets ThreeFactorsMatchResultEnum
 */
public enum ThreeFactorsMatchResultEnum {

    VALUE_0("0"),

    VALUE_1("1"),

    VALUE_2("2");

    private String value;

    ThreeFactorsMatchResultEnum(String value) {
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