package com.baidubce.image.models;

/**
 * Gets or Sets StyleOptionEnum
 */
public enum StyleOptionEnum {

    CARTOON("cartoon"),

    PENCIL("pencil"),

    COLOR_PENCIL("color_pencil"),

    WARM("warm"),

    WAVE("wave"),

    LAVENDER("lavender"),

    MONONOKE("mononoke"),

    SCREAM("scream"),

    GOTHIC("gothic");

    private String value;

    StyleOptionEnum(String value) {
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