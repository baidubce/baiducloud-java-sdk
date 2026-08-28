package com.baidubce.ocr.models;

/**
 * Gets or Sets PaperCutLanguageTypeEnum
 */
public enum PaperCutLanguageTypeEnum {

    CHN_ENG("CHN_ENG"),

    ENG("ENG");

    private String value;

    PaperCutLanguageTypeEnum(String value) {
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