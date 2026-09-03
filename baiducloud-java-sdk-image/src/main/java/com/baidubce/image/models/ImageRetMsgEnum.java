package com.baidubce.image.models;

/**
 * Gets or Sets ImageRetMsgEnum
 */
public enum ImageRetMsgEnum {

    SUCCESS("success"),

    PROCESSING("processing");

    private String value;

    ImageRetMsgEnum(String value) {
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