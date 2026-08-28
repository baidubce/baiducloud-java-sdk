package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaxiReceiptWordsResult {
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
     * 车牌号
     */
    @JsonProperty("TaxiNum")
    private String taxiNum;

    /**
     * 日期
     */
    @JsonProperty("Date")
    private String date;

    /**
     * 上下车时间
     */
    @JsonProperty("Time")
    private String time;

    /**
     * 上车时间
     */
    @JsonProperty("PickupTime")
    private String pickupTime;

    /**
     * 下车时间
     */
    @JsonProperty("DropoffTime")
    private String dropoffTime;

    /**
     * 金额
     */
    @JsonProperty("Fare")
    private String fare;

    /**
     * 燃油附加费
     */
    @JsonProperty("FuelOilSurcharge")
    private String fuelOilSurcharge;

    /**
     * 叫车服务费
     */
    @JsonProperty("CallServiceSurcharge")
    private String callServiceSurcharge;

    /**
     * 总金额
     */
    @JsonProperty("TotalFare")
    private String totalFare;

    /**
     * 开票城市
     */
    @JsonProperty("Location")
    private String location;

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

    /**
     * 单价
     */
    @JsonProperty("PricePerkm")
    private String pricePerkm;

    /**
     * 里程
     */
    @JsonProperty("Distance")
    private String distance;

    /**
     * 服务类型
     */
    @JsonProperty("ServiceType")
    private String serviceType;

    public TaxiReceiptWordsResult setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }

    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public TaxiReceiptWordsResult setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
        return this;
    }

    public String getInvoiceNum() {
        return this.invoiceNum;
    }

    public TaxiReceiptWordsResult setTaxiNum(String taxiNum) {
        this.taxiNum = taxiNum;
        return this;
    }

    public String getTaxiNum() {
        return this.taxiNum;
    }

    public TaxiReceiptWordsResult setDate(String date) {
        this.date = date;
        return this;
    }

    public String getDate() {
        return this.date;
    }

    public TaxiReceiptWordsResult setTime(String time) {
        this.time = time;
        return this;
    }

    public String getTime() {
        return this.time;
    }

    public TaxiReceiptWordsResult setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
        return this;
    }

    public String getPickupTime() {
        return this.pickupTime;
    }

    public TaxiReceiptWordsResult setDropoffTime(String dropoffTime) {
        this.dropoffTime = dropoffTime;
        return this;
    }

    public String getDropoffTime() {
        return this.dropoffTime;
    }

    public TaxiReceiptWordsResult setFare(String fare) {
        this.fare = fare;
        return this;
    }

    public String getFare() {
        return this.fare;
    }

    public TaxiReceiptWordsResult setFuelOilSurcharge(String fuelOilSurcharge) {
        this.fuelOilSurcharge = fuelOilSurcharge;
        return this;
    }

    public String getFuelOilSurcharge() {
        return this.fuelOilSurcharge;
    }

    public TaxiReceiptWordsResult setCallServiceSurcharge(String callServiceSurcharge) {
        this.callServiceSurcharge = callServiceSurcharge;
        return this;
    }

    public String getCallServiceSurcharge() {
        return this.callServiceSurcharge;
    }

    public TaxiReceiptWordsResult setTotalFare(String totalFare) {
        this.totalFare = totalFare;
        return this;
    }

    public String getTotalFare() {
        return this.totalFare;
    }

    public TaxiReceiptWordsResult setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getLocation() {
        return this.location;
    }

    public TaxiReceiptWordsResult setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getProvince() {
        return this.province;
    }

    public TaxiReceiptWordsResult setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCity() {
        return this.city;
    }

    public TaxiReceiptWordsResult setPricePerkm(String pricePerkm) {
        this.pricePerkm = pricePerkm;
        return this;
    }

    public String getPricePerkm() {
        return this.pricePerkm;
    }

    public TaxiReceiptWordsResult setDistance(String distance) {
        this.distance = distance;
        return this;
    }

    public String getDistance() {
        return this.distance;
    }

    public TaxiReceiptWordsResult setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    @Override
    public String toString() {
        return "TaxiReceiptWordsResult{" + "invoiceCode=" + invoiceCode + "\n" + "invoiceNum=" + invoiceNum + "\n" + "taxiNum=" + taxiNum + "\n" + "date=" + date + "\n" + "time="
                + time + "\n" + "pickupTime=" + pickupTime + "\n" + "dropoffTime=" + dropoffTime + "\n" + "fare=" + fare + "\n" + "fuelOilSurcharge=" + fuelOilSurcharge + "\n"
                + "callServiceSurcharge=" + callServiceSurcharge + "\n" + "totalFare=" + totalFare + "\n" + "location=" + location + "\n" + "province=" + province + "\n" + "city="
                + city + "\n" + "pricePerkm=" + pricePerkm + "\n" + "distance=" + distance + "\n" + "serviceType=" + serviceType + "\n" + "}";
    }

}