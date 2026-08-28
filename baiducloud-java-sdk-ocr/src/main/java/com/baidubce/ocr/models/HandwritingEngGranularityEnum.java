package com.baidubce.ocr.models;

/**
 * Gets or Sets HandwritingEngGranularityEnum
 */
public enum HandwritingEngGranularityEnum {

    LETTER("letter"),

    WORD("word");

    private String value;

    HandwritingEngGranularityEnum(String value) {
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