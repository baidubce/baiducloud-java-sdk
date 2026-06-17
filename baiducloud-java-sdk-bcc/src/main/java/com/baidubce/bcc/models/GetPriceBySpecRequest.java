package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPriceBySpecRequest extends BaseBceRequest {

    /**
    * 实例规格族
    */
    private String specId;

    /**
    * 实例套餐规格
    */
    private String spec;

    /**
    * 付费方式，包括Postpaid(后付费)、Prepaid(预付费)
    */
    private String paymentTiming;

    /**
    * 可用区名称
    */
    private String zoneName;

    /**
    * 查询数量，必须为大于0的整数，缺省为1
    */
    private Integer purchaseCount;

    /**
    * 时长，[1,2,3,4,5,6,7,8,9,12,24,36]，单位：月
    */
    private Integer purchaseLength;

    public String getSpecId() {
        return specId;
    }

    public GetPriceBySpecRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public GetPriceBySpecRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getPaymentTiming() {
        return paymentTiming;
    }

    public GetPriceBySpecRequest setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public GetPriceBySpecRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public GetPriceBySpecRequest setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
        return this;
    }

    public Integer getPurchaseLength() {
        return purchaseLength;
    }

    public GetPriceBySpecRequest setPurchaseLength(Integer purchaseLength) {
        this.purchaseLength = purchaseLength;
        return this;
    }

}
