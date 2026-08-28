package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrainTicketWordsResult {
    /**
     * 车票号
     */
    @JsonProperty("ticket_num")
    private String ticketNum;

    /**
     * 始发站
     */
    @JsonProperty("starting_station")
    private String startingStation;

    /**
     * 车次号
     */
    @JsonProperty("train_num")
    private String trainNum;

    /**
     * 到达站
     */
    @JsonProperty("destination_station")
    private String destinationStation;

    /**
     * 出发日期
     */
    private String date;

    /**
     * 车票金额
     */
    @JsonProperty("ticket_rates")
    private String ticketRates;

    /**
     * 席别
     */
    @JsonProperty("seat_category")
    private String seatCategory;

    /**
     * 乘客姓名
     */
    private String name;

    /**
     * 身份证号
     */
    @JsonProperty("id_num")
    private String idNum;

    /**
     * 序列号
     */
    @JsonProperty("serial_number")
    private String serialNumber;

    /**
     * 售站
     */
    @JsonProperty("sales_station")
    private String salesStation;

    /**
     * 时间
     */
    private String time;

    /**
     * 座位号
     */
    @JsonProperty("seat_num")
    private String seatNum;

    /**
     * 退票标识，仅在输入为电子火车票时返回该字段
     */
    @JsonProperty("refund_flag")
    private String refundFlag;

    /**
     * 发票号码，仅在输入为电子火车票时返回该字段
     */
    @JsonProperty("invoice_num")
    private String invoiceNum;

    /**
     * 开票日期，仅在输入为电子火车票时返回该字段
     */
    @JsonProperty("invoice_date")
    private String invoiceDate;

    /**
     * 不含税金额，仅在输入为电子火车票时返回该字段
     */
    private String fare;

    /**
     * 税率，仅在输入为电子火车票时返回该字段
     */
    @JsonProperty("tax_rate")
    private String taxRate;

    /**
     * 税额，仅在输入为电子火车票时返回该字段
     */
    private String tax;

    /**
     * 电子客票号，仅在输入为电子火车票时返回该字段
     */
    @JsonProperty("elec_ticket_num")
    private String elecTicketNum;

    /**
     * 服务类型
     */
    @JsonProperty("ServiceType")
    private String serviceType;

    public TrainTicketWordsResult setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
        return this;
    }

    public String getTicketNum() {
        return this.ticketNum;
    }

    public TrainTicketWordsResult setStartingStation(String startingStation) {
        this.startingStation = startingStation;
        return this;
    }

    public String getStartingStation() {
        return this.startingStation;
    }

    public TrainTicketWordsResult setTrainNum(String trainNum) {
        this.trainNum = trainNum;
        return this;
    }

    public String getTrainNum() {
        return this.trainNum;
    }

    public TrainTicketWordsResult setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
        return this;
    }

    public String getDestinationStation() {
        return this.destinationStation;
    }

    public TrainTicketWordsResult setDate(String date) {
        this.date = date;
        return this;
    }

    public String getDate() {
        return this.date;
    }

    public TrainTicketWordsResult setTicketRates(String ticketRates) {
        this.ticketRates = ticketRates;
        return this;
    }

    public String getTicketRates() {
        return this.ticketRates;
    }

    public TrainTicketWordsResult setSeatCategory(String seatCategory) {
        this.seatCategory = seatCategory;
        return this;
    }

    public String getSeatCategory() {
        return this.seatCategory;
    }

    public TrainTicketWordsResult setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TrainTicketWordsResult setIdNum(String idNum) {
        this.idNum = idNum;
        return this;
    }

    public String getIdNum() {
        return this.idNum;
    }

    public TrainTicketWordsResult setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public TrainTicketWordsResult setSalesStation(String salesStation) {
        this.salesStation = salesStation;
        return this;
    }

    public String getSalesStation() {
        return this.salesStation;
    }

    public TrainTicketWordsResult setTime(String time) {
        this.time = time;
        return this;
    }

    public String getTime() {
        return this.time;
    }

    public TrainTicketWordsResult setSeatNum(String seatNum) {
        this.seatNum = seatNum;
        return this;
    }

    public String getSeatNum() {
        return this.seatNum;
    }

    public TrainTicketWordsResult setRefundFlag(String refundFlag) {
        this.refundFlag = refundFlag;
        return this;
    }

    public String getRefundFlag() {
        return this.refundFlag;
    }

    public TrainTicketWordsResult setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
        return this;
    }

    public String getInvoiceNum() {
        return this.invoiceNum;
    }

    public TrainTicketWordsResult setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public TrainTicketWordsResult setFare(String fare) {
        this.fare = fare;
        return this;
    }

    public String getFare() {
        return this.fare;
    }

    public TrainTicketWordsResult setTaxRate(String taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public String getTaxRate() {
        return this.taxRate;
    }

    public TrainTicketWordsResult setTax(String tax) {
        this.tax = tax;
        return this;
    }

    public String getTax() {
        return this.tax;
    }

    public TrainTicketWordsResult setElecTicketNum(String elecTicketNum) {
        this.elecTicketNum = elecTicketNum;
        return this;
    }

    public String getElecTicketNum() {
        return this.elecTicketNum;
    }

    public TrainTicketWordsResult setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    @Override
    public String toString() {
        return "TrainTicketWordsResult{" + "ticketNum=" + ticketNum + "\n" + "startingStation=" + startingStation + "\n" + "trainNum=" + trainNum + "\n" + "destinationStation="
                + destinationStation + "\n" + "date=" + date + "\n" + "ticketRates=" + ticketRates + "\n" + "seatCategory=" + seatCategory + "\n" + "name=" + name + "\n"
                + "idNum=" + idNum + "\n" + "serialNumber=" + serialNumber + "\n" + "salesStation=" + salesStation + "\n" + "time=" + time + "\n" + "seatNum=" + seatNum + "\n"
                + "refundFlag=" + refundFlag + "\n" + "invoiceNum=" + invoiceNum + "\n" + "invoiceDate=" + invoiceDate + "\n" + "fare=" + fare + "\n" + "taxRate=" + taxRate + "\n"
                + "tax=" + tax + "\n" + "elecTicketNum=" + elecTicketNum + "\n" + "serviceType=" + serviceType + "\n" + "}";
    }

}