package com.baidubce.ocr.models;

/**
 * Gets or Sets CorrectQuestionTypeEnum
 */
public enum CorrectQuestionTypeEnum {

    VALUE_0(0),

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

    VALUE_17(17),

    VALUE_18(18),

    VALUE_19(19),

    VALUE_401(401),

    VALUE_402(402),

    VALUE_801(801),

    VALUE_902(902);

    private Integer value;

    CorrectQuestionTypeEnum(Integer value) {
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