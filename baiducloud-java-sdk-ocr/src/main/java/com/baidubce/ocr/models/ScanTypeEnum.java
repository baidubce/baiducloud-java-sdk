package com.baidubce.ocr.models;

/**
 * Gets or Sets ScanTypeEnum
 */
public enum ScanTypeEnum {

    VALUE_1(1),

    VALUE_2(2),

    VALUE_3(3);

    private Integer value;

    ScanTypeEnum(Integer value) {
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