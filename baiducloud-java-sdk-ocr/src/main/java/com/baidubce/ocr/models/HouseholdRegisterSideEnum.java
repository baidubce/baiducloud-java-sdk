package com.baidubce.ocr.models;

/**
 * Gets or Sets HouseholdRegisterSideEnum
 */
public enum HouseholdRegisterSideEnum {

    SUBPAGE("subpage"),

    HOMEPAGE("homepage");

    private String value;

    HouseholdRegisterSideEnum(String value) {
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