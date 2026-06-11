package com.baidubce.bcc.models;

/**
 * Gets or Sets ImageType
 */
public enum ImageType {

    ALL("All"),

    SYSTEM("System"),

    CUSTOM("Custom"),

    INTEGRATION("Integration"),

    SHARING("Sharing"),

    BBCSYSTEM("BbcSystem"),

    BBCCUSTOM("BbcCustom"),

    GPUBCCSYSTEM("GpuBccSystem"),

    GPUBCCCUSTOM("GpuBccCustom"),

    GPUBBCSYSTEM("GpuBbcSystem"),

    GPUBBCCUSTOM("GpuBbcCustom"),

    EBCTOTAL("EbcTotal"),

    EBCSYSTEM("EbcSystem"),

    EBCCUSTOM("EbcCustom"),

    FPGABCCSYSTEM("FpgaBccSystem"),

    FPGABCCCUSTOM("FpgaBccCustom");

    private String value;

    ImageType(String value) {
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