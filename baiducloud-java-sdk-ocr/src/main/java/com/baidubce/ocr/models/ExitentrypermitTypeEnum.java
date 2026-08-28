package com.baidubce.ocr.models;

/**
 * Gets or Sets ExitentrypermitTypeEnum
 */
public enum ExitentrypermitTypeEnum {

    HK_MC_PASSPORT_FRONT("hk_mc_passport_front"),

    HK_MC_PASSPORT_BACK("hk_mc_passport_back"),

    TW_PASSPORT_FRONT("tw_passport_front"),

    TW_PASSPORT_BACK("tw_passport_back"),

    TW_RETURN_PASSPORT_FRONT("tw_return_passport_front"),

    TW_RETURN_PASSPORT_BACK("tw_return_passport_back"),

    HK_MC_RETURN_PASSPORT_FRONT("hk_mc_return_passport_front"),

    HK_MC_RETURN_PASSPORT_BACK("hk_mc_return_passport_back");

    private String value;

    ExitentrypermitTypeEnum(String value) {
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