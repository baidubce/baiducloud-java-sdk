package com.baidubce.image.models;

/**
 * Gets or Sets TagLogicEnum
 */
public enum TagLogicEnum {

    VALUE_0(0),

    VALUE_1(1);

    private Integer value;

    TagLogicEnum(Integer value) {
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