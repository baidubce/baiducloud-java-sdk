package com.baidubce.ocr.models;

/**
 * Gets or Sets DocAnalysisOfficeDocSectionAttributeEnum
 */
public enum DocAnalysisOfficeDocSectionAttributeEnum {

    SECTION("section"),

    HEADER("header"),

    FOOTER("footer"),

    NUMBER("number"),

    FOOTNOTE("footnote");

    private String value;

    DocAnalysisOfficeDocSectionAttributeEnum(String value) {
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