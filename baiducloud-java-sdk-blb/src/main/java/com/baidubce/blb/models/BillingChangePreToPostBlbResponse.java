package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingChangePreToPostBlbResponse extends BaseBceResponse {

    /**
    * 预付费转后付费订单ID
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public BillingChangePreToPostBlbResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "BillingChangePreToPostBlbResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}
