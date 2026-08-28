package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuotaInvoiceWordsResult {
    /**
     * 发票代码
     */
    @JsonProperty("invoice_code")
    private String invoiceCode;

    /**
     * 发票号码
     */
    @JsonProperty("invoice_number")
    private String invoiceNumber;

    /**
     * 金额
     */
    @JsonProperty("invoice_rate")
    private String invoiceRate;

    /**
     * 发票所在地
     */
    private String location;

    /**
     * 发票金额小写
     */
    @JsonProperty("invoice_rate_lowercase")
    private String invoiceRateLowercase;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    public QuotaInvoiceWordsResult setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }

    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public QuotaInvoiceWordsResult setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public QuotaInvoiceWordsResult setInvoiceRate(String invoiceRate) {
        this.invoiceRate = invoiceRate;
        return this;
    }

    public String getInvoiceRate() {
        return this.invoiceRate;
    }

    public QuotaInvoiceWordsResult setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getLocation() {
        return this.location;
    }

    public QuotaInvoiceWordsResult setInvoiceRateLowercase(String invoiceRateLowercase) {
        this.invoiceRateLowercase = invoiceRateLowercase;
        return this;
    }

    public String getInvoiceRateLowercase() {
        return this.invoiceRateLowercase;
    }

    public QuotaInvoiceWordsResult setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getProvince() {
        return this.province;
    }

    public QuotaInvoiceWordsResult setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCity() {
        return this.city;
    }

    @Override
    public String toString() {
        return "QuotaInvoiceWordsResult{" + "invoiceCode=" + invoiceCode + "\n" + "invoiceNumber=" + invoiceNumber + "\n" + "invoiceRate=" + invoiceRate + "\n" + "location="
                + location + "\n" + "invoiceRateLowercase=" + invoiceRateLowercase + "\n" + "province=" + province + "\n" + "city=" + city + "\n" + "}";
    }

}