package com.baidubce.ocr.models;

/**
 * Gets or Sets WordTypeEnum
 */
public enum WordTypeEnum {

    HANDWRITING("handwriting"),

    PRINT("print");

    private String value;

    WordTypeEnum(String value) {
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