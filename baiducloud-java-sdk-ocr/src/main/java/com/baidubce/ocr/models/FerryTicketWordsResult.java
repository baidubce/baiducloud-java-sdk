package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FerryTicketWordsResult {
    /**
     * 发票类型
     */
    @JsonProperty("InvoiceType")
    private String invoiceType;

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
     * 出发地点
     */
    @JsonProperty("StartingStation")
    private String startingStation;

    /**
     * 到达地点
     */
    @JsonProperty("DestinationStation")
    private String destinationStation;

    /**
     * 总金额
     */
    @JsonProperty("Fare")
    private String fare;

    /**
     * 开票日期
     */
    @JsonProperty("InvoiceDate")
    private String invoiceDate;

    /**
     * 条形码识别结果
     */
    @JsonProperty("BarCode")
    private String barCode;

    /**
     * 条形码编号
     */
    @JsonProperty("BarCodeNum")
    private String barCodeNum;

    /**
     * 城市
     */
    @JsonProperty("City")
    private String city;

    /**
     * 发票标题
     */
    @JsonProperty("InvoiceTitle")
    private String invoiceTitle;

    /**
     * 省份
     */
    @JsonProperty("Province")
    private String province;

    /**
     * 二维码识别结果
     */
    @JsonProperty("QrCode")
    private String qrCode;

    /**
     * 时间
     */
    @JsonProperty("Time")
    private String time;

    /**
     * 乘船时间
     */
    @JsonProperty("TicketTime")
    private String ticketTime;

    /**
     * 乘船日期
     */
    @JsonProperty("TicketDate")
    private String ticketDate;

    /**
     * 身份证号
     */
    @JsonProperty("IdCard")
    private String idCard;

    /**
     * 乘客姓名
     */
    @JsonProperty("PassengerName")
    private String passengerName;

    public FerryTicketWordsResult setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }

    public String getInvoiceType() {
        return this.invoiceType;
    }

    public FerryTicketWordsResult setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }

    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public FerryTicketWordsResult setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
        return this;
    }

    public String getInvoiceNum() {
        return this.invoiceNum;
    }

    public FerryTicketWordsResult setStartingStation(String startingStation) {
        this.startingStation = startingStation;
        return this;
    }

    public String getStartingStation() {
        return this.startingStation;
    }

    public FerryTicketWordsResult setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
        return this;
    }

    public String getDestinationStation() {
        return this.destinationStation;
    }

    public FerryTicketWordsResult setFare(String fare) {
        this.fare = fare;
        return this;
    }

    public String getFare() {
        return this.fare;
    }

    public FerryTicketWordsResult setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public FerryTicketWordsResult setBarCode(String barCode) {
        this.barCode = barCode;
        return this;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public FerryTicketWordsResult setBarCodeNum(String barCodeNum) {
        this.barCodeNum = barCodeNum;
        return this;
    }

    public String getBarCodeNum() {
        return this.barCodeNum;
    }

    public FerryTicketWordsResult setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCity() {
        return this.city;
    }

    public FerryTicketWordsResult setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
        return this;
    }

    public String getInvoiceTitle() {
        return this.invoiceTitle;
    }

    public FerryTicketWordsResult setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getProvince() {
        return this.province;
    }

    public FerryTicketWordsResult setQrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }

    public String getQrCode() {
        return this.qrCode;
    }

    public FerryTicketWordsResult setTime(String time) {
        this.time = time;
        return this;
    }

    public String getTime() {
        return this.time;
    }

    public FerryTicketWordsResult setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
        return this;
    }

    public String getTicketTime() {
        return this.ticketTime;
    }

    public FerryTicketWordsResult setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
        return this;
    }

    public String getTicketDate() {
        return this.ticketDate;
    }

    public FerryTicketWordsResult setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }

    public String getIdCard() {
        return this.idCard;
    }

    public FerryTicketWordsResult setPassengerName(String passengerName) {
        this.passengerName = passengerName;
        return this;
    }

    public String getPassengerName() {
        return this.passengerName;
    }

    @Override
    public String toString() {
        return "FerryTicketWordsResult{" + "invoiceType=" + invoiceType + "\n" + "invoiceCode=" + invoiceCode + "\n" + "invoiceNum=" + invoiceNum + "\n" + "startingStation="
                + startingStation + "\n" + "destinationStation=" + destinationStation + "\n" + "fare=" + fare + "\n" + "invoiceDate=" + invoiceDate + "\n" + "barCode=" + barCode
                + "\n" + "barCodeNum=" + barCodeNum + "\n" + "city=" + city + "\n" + "invoiceTitle=" + invoiceTitle + "\n" + "province=" + province + "\n" + "qrCode=" + qrCode
                + "\n" + "time=" + time + "\n" + "ticketTime=" + ticketTime + "\n" + "ticketDate=" + ticketDate + "\n" + "idCard=" + idCard + "\n" + "passengerName="
                + passengerName + "\n" + "}";
    }

}