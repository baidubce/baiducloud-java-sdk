package com.baidubce.ocr.models;

/**
 * Gets or Sets QuestionElementTypeEnum
 */
public enum QuestionElementTypeEnum {

    VALUE_0("0"),

    VALUE_1("1"),

    VALUE_2("2"),

    VALUE_3("3"),

    VALUE_4("4"),

    VALUE_5("5");

    private String value;

    QuestionElementTypeEnum(String value) {
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