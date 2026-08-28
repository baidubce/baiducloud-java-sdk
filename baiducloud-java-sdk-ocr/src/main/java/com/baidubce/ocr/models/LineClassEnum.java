package com.baidubce.ocr.models;

/**
 * Gets or Sets LineClassEnum
 */
public enum LineClassEnum {

    KEY("key"),

    VALUE("value"),

    TABLE_VALUE("table_value"),

    OTHER("other");

    private String value;

    LineClassEnum(String value) {
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