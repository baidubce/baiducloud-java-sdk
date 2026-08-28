package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusTicketWordsResult {
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
     * 出发站
     */
    @JsonProperty("StartingStation")
    private String startingStation;

    /**
     * 金额
     */
    @JsonProperty("Fare")
    private String fare;

    /**
     * 身份证号
     */
    @JsonProperty("IdNum")
    private String idNum;

    /**
     * 到达站
     */
    @JsonProperty("DestinationStation")
    private String destinationStation;

    /**
     * 姓名
     */
    @JsonProperty("Name")
    private String name;

    public BusTicketWordsResult setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }

    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public BusTicketWordsResult setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
        return this;
    }

    public String getInvoiceNum() {
        return this.invoiceNum;
    }

    public BusTicketWordsResult setDate(String date) {
        this.date = date;
        return this;
    }

    public String getDate() {
        return this.date;
    }

    public BusTicketWordsResult setTime(String time) {
        this.time = time;
        return this;
    }

    public String getTime() {
        return this.time;
    }

    public BusTicketWordsResult setStartingStation(String startingStation) {
        this.startingStation = startingStation;
        return this;
    }

    public String getStartingStation() {
        return this.startingStation;
    }

    public BusTicketWordsResult setFare(String fare) {
        this.fare = fare;
        return this;
    }

    public String getFare() {
        return this.fare;
    }

    public BusTicketWordsResult setIdNum(String idNum) {
        this.idNum = idNum;
        return this;
    }

    public String getIdNum() {
        return this.idNum;
    }

    public BusTicketWordsResult setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
        return this;
    }

    public String getDestinationStation() {
        return this.destinationStation;
    }

    public BusTicketWordsResult setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "BusTicketWordsResult{" + "invoiceCode=" + invoiceCode + "\n" + "invoiceNum=" + invoiceNum + "\n" + "date=" + date + "\n" + "time=" + time + "\n"
                + "startingStation=" + startingStation + "\n" + "fare=" + fare + "\n" + "idNum=" + idNum + "\n" + "destinationStation=" + destinationStation + "\n" + "name="
                + name + "\n" + "}";
    }

}