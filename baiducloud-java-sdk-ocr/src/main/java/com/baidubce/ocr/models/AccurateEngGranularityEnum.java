package com.baidubce.ocr.models;

/**
 * Gets or Sets AccurateEngGranularityEnum
 */
public enum AccurateEngGranularityEnum {

    LETTER("letter"),

    WORD("word");

    private String value;

    AccurateEngGranularityEnum(String value) {
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