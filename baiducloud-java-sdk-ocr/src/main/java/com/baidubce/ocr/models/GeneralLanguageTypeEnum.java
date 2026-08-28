package com.baidubce.ocr.models;

/**
 * Gets or Sets GeneralLanguageTypeEnum
 */
public enum GeneralLanguageTypeEnum {

    CHN_ENG("CHN_ENG"),

    ENG("ENG"),

    JAP("JAP"),

    KOR("KOR"),

    FRE("FRE"),

    SPA("SPA"),

    POR("POR"),

    GER("GER"),

    ITA("ITA"),

    RUS("RUS");

    private String value;

    GeneralLanguageTypeEnum(String value) {
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