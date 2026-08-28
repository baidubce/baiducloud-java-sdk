package com.baidubce.ocr.models;

/**
 * Gets or Sets LicensePlateColorEnum
 */
public enum LicensePlateColorEnum {

    BLUE("blue"),

    GREEN("green"),

    YELLOW("yellow"),

    WHITE("white"),

    BLACK("black"),

    YELLOW_GREEN("yellow_green"),

    UNKNOW("unknow"),

    PENYIN("penyin");

    private String value;

    LicensePlateColorEnum(String value) {
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