package com.baidubce.face.models;

/**
 * Gets or Sets FaceAttrActionEnum
 */
public enum FaceAttrActionEnum {

    TO_KID("TO_KID"),

    TO_OLD("TO_OLD"),

    TO_FEMALE("TO_FEMALE"),

    TO_MALE("TO_MALE"),

    V2_AGE("V2_AGE"),

    V2_GENDER("V2_GENDER");

    private String value;

    FaceAttrActionEnum(String value) {
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