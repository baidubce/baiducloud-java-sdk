package com.baidubce.ocr.models;

/**
 * Gets or Sets ThreeFactorsVerifyResultEnum
 */
public enum ThreeFactorsVerifyResultEnum {

    VALUE_1("1"),

    VALUE_0("0"),

    VALUE_2("2");

    private String value;

    ThreeFactorsVerifyResultEnum(String value) {
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