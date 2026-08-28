package com.baidubce.ocr.models;

/**
 * Gets or Sets VatInvoiceTypeEnum
 */
public enum VatInvoiceTypeEnum {

    NORMAL("normal"),

    ROLL("roll");

    private String value;

    VatInvoiceTypeEnum(String value) {
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