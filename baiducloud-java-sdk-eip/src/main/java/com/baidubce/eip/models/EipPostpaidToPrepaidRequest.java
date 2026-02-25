package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EipPostpaidToPrepaidRequest extends BaseBceRequest {

    /**
    * eip
    */
    @JsonIgnore
    private String eip;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 预付费EIP的购买时长，单位为月，取值为1-9,12,24,36。
    */
    private Integer purchaseLength;

    /**
    * 预付费EIP的公网带宽。
    */
    private Integer bandWidth;


    public String getEip() {
        return eip;
    }

    public EipPostpaidToPrepaidRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public EipPostpaidToPrepaidRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getPurchaseLength() {
        return purchaseLength;
    }

    public EipPostpaidToPrepaidRequest setPurchaseLength(Integer purchaseLength) {
        this.purchaseLength = purchaseLength;
        return this;
    }

    public Integer getBandWidth() {
        return bandWidth;
    }

    public EipPostpaidToPrepaidRequest setBandWidth(Integer bandWidth) {
        this.bandWidth = bandWidth;
        return this;
    }


}
