package com.baidubce.ocr.models;

/**
 * Gets or Sets CoverInfoEnum
 */
public enum CoverInfoEnum {

    INCOMPLETE("incomplete"),

    COMPLETE("complete");

    private String value;

    CoverInfoEnum(String value) {
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