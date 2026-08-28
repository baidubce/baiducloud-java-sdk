package com.baidubce.ocr.models;

/**
 * Gets or Sets AccurateLanguageTypeExEnum
 */
public enum AccurateLanguageTypeExEnum {

    AUTO_DETECT("auto_detect"),

    CHN_ENG("CHN_ENG"),

    ENG("ENG"),

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

    AccurateLanguageTypeExEnum(String value) {
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