package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetNewPurchasePriceRequest extends BaseBceRequest {

    /**
    * instance
    */
    private Instance instance;

    /**
    * 时长。支付方式为后支付时不需要设置，预支付时必须设置。时间单位默认为month。
    */
    private Integer duration;

    /**
    * 购买数量，默认值为1。
    */
    private Integer number;

    /**
    * 付费方式。 预付费：prepay，后付费：postpay。
    */
    private String productType;

    public Instance getInstance() {
        return instance;
    }

    public GetNewPurchasePriceRequest setInstance(Instance instance) {
        this.instance = instance;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public GetNewPurchasePriceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public GetNewPurchasePriceRequest setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public String getProductType() {
        return productType;
    }

    public GetNewPurchasePriceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }

}
