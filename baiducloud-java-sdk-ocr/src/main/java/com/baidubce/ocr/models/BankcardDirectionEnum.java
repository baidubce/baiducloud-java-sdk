package com.baidubce.ocr.models;

/**
 * Gets or Sets BankcardDirectionEnum
 */
public enum BankcardDirectionEnum {

    VALUE_MINUS_1(-1),

    VALUE_0(0),

    VALUE_1(1),

    VALUE_2(2),

    VALUE_3(3);

    private Integer value;

    BankcardDirectionEnum(Integer value) {
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