package com.baidubce.ocr.models;

/**
 * Gets or Sets BarcodeTypeEnum
 */
public enum BarcodeTypeEnum {

    UPC_A("UPC_A"),

    UPC_E("UPC_E"),

    EAN_13("EAN_13"),

    EAN_8("EAN_8"),

    CODE_39("CODE_39"),

    CODE_93("CODE_93"),

    CODE_128("CODE_128"),

    ITF("ITF"),

    CODABAR("CODABAR"),

    QR_CODE("QR_CODE"),

    DATA_MATRIX("DATA_MATRIX"),

    AZTEC("AZTEC"),

    PDF_417("PDF_417");

    private String value;

    BarcodeTypeEnum(String value) {
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