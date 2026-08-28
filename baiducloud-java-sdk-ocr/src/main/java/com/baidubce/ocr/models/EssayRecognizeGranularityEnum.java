package com.baidubce.ocr.models;

/**
 * Gets or Sets EssayRecognizeGranularityEnum
 */
public enum EssayRecognizeGranularityEnum {

    LINE("line"),

    WORD("word"),

    NONE("none");

    private String value;

    EssayRecognizeGranularityEnum(String value) {
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