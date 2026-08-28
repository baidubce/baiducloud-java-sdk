package com.baidubce.ocr.models;

/**
 * Gets or Sets WordtypeAttriEnum
 */
public enum WordtypeAttriEnum {

    HANDWRITING("handwriting"),

    PRINT("print");

    private String value;

    WordtypeAttriEnum(String value) {
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