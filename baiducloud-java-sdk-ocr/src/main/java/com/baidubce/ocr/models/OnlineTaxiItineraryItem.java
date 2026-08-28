package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OnlineTaxiItineraryItem {
    /**
     * 行程信息的对应序号
     */
    @JsonProperty("ItemId")
    private String itemId;

    /**
     * 上车时间
     */
    @JsonProperty("PickupTime")
    private String pickupTime;

    /**
     * 上车日期
     */
    @JsonProperty("PickupDate")
    private String pickupDate;

    /**
     * 车型
     */
    @JsonProperty("CarType")
    private String carType;

    /**
     * 里程
     */
    @JsonProperty("Distance")
    private String distance;

    /**
     * 起点
     */
    @JsonProperty("StartPlace")
    private String startPlace;

    /**
     * 终点
     */
    @JsonProperty("DestinationPlace")
    private String destinationPlace;

    /**
     * 城市
     */
    @JsonProperty("City")
    private String city;

    /**
     * 金额
     */
    @JsonProperty("Fare")
    private String fare;

    /**
     * 服务提供方
     */
    @JsonProperty("item_provider")
    private String itemProvider;

    public OnlineTaxiItineraryItem setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    public String getItemId() {
        return this.itemId;
    }

    public OnlineTaxiItineraryItem setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
        return this;
    }

    public String getPickupTime() {
        return this.pickupTime;
    }

    public OnlineTaxiItineraryItem setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
        return this;
    }

    public String getPickupDate() {
        return this.pickupDate;
    }

    public OnlineTaxiItineraryItem setCarType(String carType) {
        this.carType = carType;
        return this;
    }

    public String getCarType() {
        return this.carType;
    }

    public OnlineTaxiItineraryItem setDistance(String distance) {
        this.distance = distance;
        return this;
    }

    public String getDistance() {
        return this.distance;
    }

    public OnlineTaxiItineraryItem setStartPlace(String startPlace) {
        this.startPlace = startPlace;
        return this;
    }

    public String getStartPlace() {
        return this.startPlace;
    }

    public OnlineTaxiItineraryItem setDestinationPlace(String destinationPlace) {
        this.destinationPlace = destinationPlace;
        return this;
    }

    public String getDestinationPlace() {
        return this.destinationPlace;
    }

    public OnlineTaxiItineraryItem setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCity() {
        return this.city;
    }

    public OnlineTaxiItineraryItem setFare(String fare) {
        this.fare = fare;
        return this;
    }

    public String getFare() {
        return this.fare;
    }

    public OnlineTaxiItineraryItem setItemProvider(String itemProvider) {
        this.itemProvider = itemProvider;
        return this;
    }

    public String getItemProvider() {
        return this.itemProvider;
    }

    @Override
    public String toString() {
        return "OnlineTaxiItineraryItem{" + "itemId=" + itemId + "\n" + "pickupTime=" + pickupTime + "\n" + "pickupDate=" + pickupDate + "\n" + "carType=" + carType + "\n"
                + "distance=" + distance + "\n" + "startPlace=" + startPlace + "\n" + "destinationPlace=" + destinationPlace + "\n" + "city=" + city + "\n" + "fare=" + fare + "\n"
                + "itemProvider=" + itemProvider + "\n" + "}";
    }

}