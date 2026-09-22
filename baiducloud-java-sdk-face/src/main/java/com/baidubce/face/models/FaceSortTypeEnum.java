package com.baidubce.face.models;

/**
 * Gets or Sets FaceSortTypeEnum
 */
public enum FaceSortTypeEnum {

    VALUE_0(0),

    VALUE_1(1);

    private Integer value;

    FaceSortTypeEnum(Integer value) {
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