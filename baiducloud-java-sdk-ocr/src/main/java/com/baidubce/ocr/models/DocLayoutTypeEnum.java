package com.baidubce.ocr.models;

/**
 * Gets or Sets DocLayoutTypeEnum
 */
public enum DocLayoutTypeEnum {

    TABLE("table"),

    FIGURE("figure"),

    TEXT("text"),

    TITLE("title"),

    CONTENTS("contents"),

    SEAL("seal"),

    TABLE_TITLE("table_title"),

    FIGURE_TITLE("figure_title"),

    DOC_TITLE("doc_title");

    private String value;

    DocLayoutTypeEnum(String value) {
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