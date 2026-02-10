package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTbspRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * DDoS增强防护包名称
    */
    private String name;

    /**
    * 线路类型(支持BGP/BGP_S,分别代表标准BGP/增强BGP)
    */
    private String lineType;

    /**
    * 单个服务包的IP容量(1/5/30/100)
    */
    private Integer ipCapacity;

    /**
    * 购买时长(按天:1-20;按月:3,6;按年:1-3)
    */
    private Integer reservationLength;

    /**
    * 购买时长单位(DAY/MONTH/YEAR)
    */
    private String reservationTimeUnit;

    /**
    * 自动续费周期,创建TBSP同时开通自动续费(按月:1-9;按年:1-3)
    */
    private Integer autoRenewTime;

    /**
    * 自动续费周期单位,创建TBSP同时开通自动续费(MONTH/YEAR)
    */
    private String autoRenewTimeUnit;


    public String getClientToken() {
        return clientToken;
    }

    public CreateTbspRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateTbspRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getLineType() {
        return lineType;
    }

    public CreateTbspRequest setLineType(String lineType) {
        this.lineType = lineType;
        return this;
    }

    public Integer getIpCapacity() {
        return ipCapacity;
    }

    public CreateTbspRequest setIpCapacity(Integer ipCapacity) {
        this.ipCapacity = ipCapacity;
        return this;
    }

    public Integer getReservationLength() {
        return reservationLength;
    }

    public CreateTbspRequest setReservationLength(Integer reservationLength) {
        this.reservationLength = reservationLength;
        return this;
    }

    public String getReservationTimeUnit() {
        return reservationTimeUnit;
    }

    public CreateTbspRequest setReservationTimeUnit(String reservationTimeUnit) {
        this.reservationTimeUnit = reservationTimeUnit;
        return this;
    }

    public Integer getAutoRenewTime() {
        return autoRenewTime;
    }

    public CreateTbspRequest setAutoRenewTime(Integer autoRenewTime) {
        this.autoRenewTime = autoRenewTime;
        return this;
    }

    public String getAutoRenewTimeUnit() {
        return autoRenewTimeUnit;
    }

    public CreateTbspRequest setAutoRenewTimeUnit(String autoRenewTimeUnit) {
        this.autoRenewTimeUnit = autoRenewTimeUnit;
        return this;
    }


}
