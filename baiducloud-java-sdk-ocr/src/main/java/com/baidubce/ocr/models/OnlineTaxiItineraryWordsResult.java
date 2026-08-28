package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OnlineTaxiItineraryWordsResult {
    /**
     * 服务商
     */
    @JsonProperty("ServiceProvider")
    private String serviceProvider;

    /**
     * 行程开始时间
     */
    @JsonProperty("StartTime")
    private String startTime;

    /**
     * 行程结束时间
     */
    @JsonProperty("EndTime")
    private String endTime;

    /**
     * 行程人手机号
     */
    @JsonProperty("Phone")
    private String phone;

    /**
     * 申请日期
     */
    @JsonProperty("ApplicationDate")
    private String applicationDate;

    /**
     * 总金额
     */
    @JsonProperty("TotalFare")
    private String totalFare;

    /**
     * 行程信息中包含的行程数量
     */
    @JsonProperty("ItemNum")
    private String itemNum;

    /**
     * 服务类型
     */
    @JsonProperty("ServiceType")
    private String serviceType;

    /**
     * 行程信息
     */
    private List<OnlineTaxiItineraryItem> items;

    public OnlineTaxiItineraryWordsResult setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
        return this;
    }

    public String getServiceProvider() {
        return this.serviceProvider;
    }

    public OnlineTaxiItineraryWordsResult setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public OnlineTaxiItineraryWordsResult setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public OnlineTaxiItineraryWordsResult setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getPhone() {
        return this.phone;
    }

    public OnlineTaxiItineraryWordsResult setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
        return this;
    }

    public String getApplicationDate() {
        return this.applicationDate;
    }

    public OnlineTaxiItineraryWordsResult setTotalFare(String totalFare) {
        this.totalFare = totalFare;
        return this;
    }

    public String getTotalFare() {
        return this.totalFare;
    }

    public OnlineTaxiItineraryWordsResult setItemNum(String itemNum) {
        this.itemNum = itemNum;
        return this;
    }

    public String getItemNum() {
        return this.itemNum;
    }

    public OnlineTaxiItineraryWordsResult setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public OnlineTaxiItineraryWordsResult setItems(List<OnlineTaxiItineraryItem> items) {
        this.items = items;
        return this;
    }

    public List<OnlineTaxiItineraryItem> getItems() {
        return this.items;
    }

    @Override
    public String toString() {
        return "OnlineTaxiItineraryWordsResult{" + "serviceProvider=" + serviceProvider + "\n" + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n" + "phone=" + phone
                + "\n" + "applicationDate=" + applicationDate + "\n" + "totalFare=" + totalFare + "\n" + "itemNum=" + itemNum + "\n" + "serviceType=" + serviceType + "\n"
                + "items=" + items + "\n" + "}";
    }

}