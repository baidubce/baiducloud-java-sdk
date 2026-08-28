package com.baidubce.ocr.models;

/**
 * Gets or Sets PaperSubjectEnum
 */
public enum PaperSubjectEnum {

    CHINESE("chinese"),

    MATH("math"),

    ENGLISH("english"),

    PHYSICS("physics"),

    CHEMISTRY("chemistry"),

    BIOLOGY("biology"),

    HISTORY("history"),

    GEOGRAPHY("geography"),

    POLITICS("politics");

    private String value;

    PaperSubjectEnum(String value) {
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