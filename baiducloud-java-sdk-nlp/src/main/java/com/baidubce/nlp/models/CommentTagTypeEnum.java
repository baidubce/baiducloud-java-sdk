package com.baidubce.nlp.models;

/**
 * Gets or Sets CommentTagTypeEnum
 */
public enum CommentTagTypeEnum {

    VALUE_1(1),

    VALUE_2(2),

    VALUE_3(3),

    VALUE_4(4),

    VALUE_5(5),

    VALUE_6(6),

    VALUE_7(7),

    VALUE_8(8),

    VALUE_9(9),

    VALUE_10(10),

    VALUE_11(11),

    VALUE_12(12),

    VALUE_13(13);

    private Integer value;

    CommentTagTypeEnum(Integer value) {
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