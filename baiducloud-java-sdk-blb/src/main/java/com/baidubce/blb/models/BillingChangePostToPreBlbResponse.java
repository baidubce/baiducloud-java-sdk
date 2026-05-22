package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingChangePostToPreBlbResponse extends BaseBceResponse {

    /**
    * 后付费转预付费订单ID
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public BillingChangePostToPreBlbResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "BillingChangePostToPreBlbResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}
