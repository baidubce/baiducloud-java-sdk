package com.baidubce.ocr.models;

/**
 * Gets or Sets BankCardTypeEnum
 */
public enum BankCardTypeEnum {

    VALUE_0(0),

    VALUE_1(1),

    VALUE_2(2),

    VALUE_3(3),

    VALUE_4(4);

    private Integer value;

    BankCardTypeEnum(Integer value) {
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