package com.baidubce.ocr.models;

/**
 * Gets or Sets ParserLanguageTypeEnum
 */
public enum ParserLanguageTypeEnum {

    CHN_ENG("CHN_ENG"),

    JAP("JAP"),

    KOR("KOR"),

    FRE("FRE"),

    SPA("SPA"),

    POR("POR"),

    GER("GER"),

    ITA("ITA"),

    RUS("RUS"),

    DAN("DAN"),

    DUT("DUT"),

    MAL("MAL"),

    SWE("SWE"),

    IND("IND"),

    POL("POL"),

    ROM("ROM"),

    TUR("TUR"),

    GRE("GRE"),

    HUN("HUN"),

    THA("THA"),

    VIE("VIE"),

    ARA("ARA"),

    HIN("HIN");

    private String value;

    ParserLanguageTypeEnum(String value) {
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