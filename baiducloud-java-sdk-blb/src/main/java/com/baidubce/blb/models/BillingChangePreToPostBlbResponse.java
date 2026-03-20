package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingChangePreToPostBlbResponse extends BaseBceResponse {
    /**
     * 预付费转后付费订单ID
     */
    private String orderId;

    public BillingChangePreToPostBlbResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderId() {
        return this.orderId;
    }

    @Override
    public String toString() {
        return "BillingChangePreToPostBlbResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}