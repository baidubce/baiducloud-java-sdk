package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingChangePostToPreBlbRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 计费类型。当前只支持默认值"BySpec"。
    */
    private String billingMethod;

    /**
    * 性能规格。不填表示不进行配置变更。取值如下："small1"标准型1，"small2"标准型2，"medium1"增强型1，"medium2"增强型2，"large1"超大型1，"large2"超大型2，"large3"超大型3。注意：预付费不支持"unlimited"不限速
    */
    private String performanceLevel;

    /**
    * 购买月份时长，[1,2,3,4,5,6,7,8,9,12,24,36]
    */
    private Integer reservationLength;

    public String getBlbId() {
        return blbId;
    }

    public BillingChangePostToPreBlbRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public BillingChangePostToPreBlbRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getBillingMethod() {
        return billingMethod;
    }

    public BillingChangePostToPreBlbRequest setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
        return this;
    }

    public String getPerformanceLevel() {
        return performanceLevel;
    }

    public BillingChangePostToPreBlbRequest setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }

    public Integer getReservationLength() {
        return reservationLength;
    }

    public BillingChangePostToPreBlbRequest setReservationLength(Integer reservationLength) {
        this.reservationLength = reservationLength;
        return this;
    }

}
