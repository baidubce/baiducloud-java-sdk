package com.baidubce.ocr.models;

/**
 * Gets or Sets WebImageDirectionEnum
 */
public enum WebImageDirectionEnum {

    VALUE_MINUS_1(-1),

    VALUE_0(0),

    VALUE_1(1),

    VALUE_2(2),

    VALUE_3(3);

    private Integer value;

    WebImageDirectionEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}