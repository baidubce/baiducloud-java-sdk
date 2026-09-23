package com.baidubce.nlp.models;

/**
 * Gets or Sets TextCorrectionLabelEnum
 */
public enum TextCorrectionLabelEnum {

    VALUE_010100("010100"),

    VALUE_010200("010200"),

    VALUE_010600("010600"),

    VALUE_020100("020100"),

    VALUE_020200("020200"),

    VALUE_020300("020300"),

    VALUE_030100("030100"),

    VALUE_030200("030200"),

    VALUE_030300("030300"),

    VALUE_030400("030400"),

    VALUE_040101("040101"),

    VALUE_040102("040102"),

    VALUE_040200("040200"),

    VALUE_040300("040300"),

    VALUE_040400("040400"),

    VALUE_060100("060100"),

    VALUE_060200("060200"),

    VALUE_060300("060300");

    private String value;

    TextCorrectionLabelEnum(String value) {
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