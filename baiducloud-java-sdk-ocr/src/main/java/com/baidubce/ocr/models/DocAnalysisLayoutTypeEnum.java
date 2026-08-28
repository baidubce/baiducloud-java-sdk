package com.baidubce.ocr.models;

/**
 * Gets or Sets DocAnalysisLayoutTypeEnum
 */
public enum DocAnalysisLayoutTypeEnum {

    TABLE("table"),

    FIGURE("figure"),

    TEXT("text"),

    TITLE("title"),

    CONTENTS("contents");

    private String value;

    DocAnalysisLayoutTypeEnum(String value) {
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