package com.baidubce.ocr.models;

/**
 * Gets or Sets BankcardCompleteStatusEnum
 */
public enum BankcardCompleteStatusEnum {

    VALUE_0(0),

    VALUE_1(1);

    private Integer value;

    BankcardCompleteStatusEnum(Integer value) {
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