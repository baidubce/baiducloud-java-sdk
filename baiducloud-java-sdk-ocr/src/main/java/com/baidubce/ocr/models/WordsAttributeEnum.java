package com.baidubce.ocr.models;

/**
 * Gets or Sets WordsAttributeEnum
 */
public enum WordsAttributeEnum {

    HANDWRITING("handwriting"),

    PRINT("print");

    private String value;

    WordsAttributeEnum(String value) {
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