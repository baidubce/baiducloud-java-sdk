package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultipleInvoiceWordsResult {
    /**
     * 票据类型，如 air_ticket、vat_invoice 等
     */
    private String type;

    /**
     * 票据位置上边距
     */
    private Integer top;

    /**
     * 票据位置左边距
     */
    private Integer left;

    /**
     * 票据宽度
     */
    private Integer width;

    /**
     * 票据高度
     */
    private Integer height;

    /**
     * 票据检测置信度
     */
    private Float probability;

    /**
     * result
     */
    private MultipleInvoiceResult result;

    public MultipleInvoiceWordsResult setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public MultipleInvoiceWordsResult setTop(Integer top) {
        this.top = top;
        return this;
    }

    public Integer getTop() {
        return this.top;
    }

    public MultipleInvoiceWordsResult setLeft(Integer left) {
        this.left = left;
        return this;
    }

    public Integer getLeft() {
        return this.left;
    }

    public MultipleInvoiceWordsResult setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getWidth() {
        return this.width;
    }

    public MultipleInvoiceWordsResult setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getHeight() {
        return this.height;
    }

    public MultipleInvoiceWordsResult setProbability(Float probability) {
        this.probability = probability;
        return this;
    }

    public Float getProbability() {
        return this.probability;
    }

    public MultipleInvoiceWordsResult setResult(MultipleInvoiceResult result) {
        this.result = result;
        return this;
    }

    public MultipleInvoiceResult getResult() {
        return this.result;
    }

    @Override
    public String toString() {
        return "MultipleInvoiceWordsResult{" + "type=" + type + "\n" + "top=" + top + "\n" + "left=" + left + "\n" + "width=" + width + "\n" + "height=" + height + "\n"
                + "probability=" + probability + "\n" + "result=" + result + "\n" + "}";
    }

}