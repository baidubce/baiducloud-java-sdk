package com.baidubce.ocr.models;

/**
 * Gets or Sets FourFactorsMatchResultEnum
 */
public enum FourFactorsMatchResultEnum {

    VALUE_0("0"),

    VALUE_1("1"),

    VALUE_2("2");

    private String value;

    FourFactorsMatchResultEnum(String value) {
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