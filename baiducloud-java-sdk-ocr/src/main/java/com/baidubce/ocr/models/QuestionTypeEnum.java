package com.baidubce.ocr.models;

/**
 * Gets or Sets QuestionTypeEnum
 */
public enum QuestionTypeEnum {

    VALUE_0("0"),

    VALUE_1("1"),

    VALUE_2("2"),

    VALUE_3("3"),

    VALUE_4("4");

    private String value;

    QuestionTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}