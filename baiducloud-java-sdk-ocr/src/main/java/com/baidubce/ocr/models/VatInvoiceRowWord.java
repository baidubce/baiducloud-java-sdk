package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VatInvoiceRowWord {
    /**
     * 行号
     */
    private String row;

    /**
     * 内容
     */
    private String word;

    public VatInvoiceRowWord setRow(String row) {
        this.row = row;
        return this;
    }

    public String getRow() {
        return this.row;
    }

    public VatInvoiceRowWord setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public String toString() {
        return "VatInvoiceRowWord{" + "row=" + row + "\n" + "word=" + word + "\n" + "}";
    }

}