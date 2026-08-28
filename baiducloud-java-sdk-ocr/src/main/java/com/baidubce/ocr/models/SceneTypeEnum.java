package com.baidubce.ocr.models;

/**
 * Gets or Sets SceneTypeEnum
 */
public enum SceneTypeEnum {

    PAPER("paper"),

    ANSWER_SHEET("answer_sheet");

    private String value;

    SceneTypeEnum(String value) {
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