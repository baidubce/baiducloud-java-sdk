package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TollInvoiceWordsResult {
    /**
     * 发票代码
     */
    @JsonProperty("InvoiceCode")
    private String invoiceCode;

    /**
     * 发票号码
     */
    @JsonProperty("InvoiceNum")
    private String invoiceNum;

    /**
     * 入口
     */
    @JsonProperty("Entrance")
    private String entrance;

    /**
     * 出口
     */
    @JsonProperty("Exit")
    private String exit;

    /**
     * 日期
     */
    @JsonProperty("Date")
    private String date;

    /**
     * 时间
     */
    @JsonProperty("Time")
    private String time;

    /**
     * 金额
     */
    @JsonProperty("Fare")
    private String fare;

    /**
     * 省
     */
    @JsonProperty("Province")
    private String province;

    /**
     * 市
     */
    @JsonProperty("City")
    private String city;

    public TollInvoiceWordsResult setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }

    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public TollInvoiceWordsResult setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
        return this;
    }

    public String getInvoiceNum() {
        return this.invoiceNum;
    }

    public TollInvoiceWordsResult setEntrance(String entrance) {
        this.entrance = entrance;
        return this;
    }

    public String getEntrance() {
        return this.entrance;
    }

    public TollInvoiceWordsResult setExit(String exit) {
        this.exit = exit;
        return this;
    }

    public String getExit() {
        return this.exit;
    }

    public TollInvoiceWordsResult setDate(String date) {
        this.date = date;
        return this;
    }

    public String getDate() {
        return this.date;
    }

    public TollInvoiceWordsResult setTime(String time) {
        this.time = time;
        return this;
    }

    public String getTime() {
        return this.time;
    }

    public TollInvoiceWordsResult setFare(String fare) {
        this.fare = fare;
        return this;
    }

    public String getFare() {
        return this.fare;
    }

    public TollInvoiceWordsResult setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getProvince() {
        return this.province;
    }

    public TollInvoiceWordsResult setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCity() {
        return this.city;
    }

    @Override
    public String toString() {
        return "TollInvoiceWordsResult{" + "invoiceCode=" + invoiceCode + "\n" + "invoiceNum=" + invoiceNum + "\n" + "entrance=" + entrance + "\n" + "exit=" + exit + "\n"
                + "date=" + date + "\n" + "time=" + time + "\n" + "fare=" + fare + "\n" + "province=" + province + "\n" + "city=" + city + "\n" + "}";
    }

}