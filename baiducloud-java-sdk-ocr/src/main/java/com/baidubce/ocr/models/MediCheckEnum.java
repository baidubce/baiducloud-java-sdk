package com.baidubce.ocr.models;

/**
 * Gets or Sets MediCheckEnum
 */
public enum MediCheckEnum {

    VALUE_0(0),

    VALUE_1(1);

    private Integer value;

    MediCheckEnum(Integer value) {
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