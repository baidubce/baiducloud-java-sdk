package com.baidubce.ocr.models;

/**
 * Gets or Sets IdCardImageStatusEnum
 */
public enum IdCardImageStatusEnum {

    NORMAL("normal"),

    REVERSED_SIDE("reversed_side"),

    NON_IDCARD("non_idcard"),

    BLURRED("blurred"),

    OTHER_TYPE_CARD("other_type_card"),

    OVER_EXPOSURE("over_exposure"),

    OVER_DARK("over_dark"),

    UNKNOWN("unknown");

    private String value;

    IdCardImageStatusEnum(String value) {
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