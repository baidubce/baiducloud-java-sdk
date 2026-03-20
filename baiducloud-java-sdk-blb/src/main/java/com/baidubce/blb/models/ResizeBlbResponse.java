package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeBlbResponse extends BaseBceResponse {
    /**
     * 变配订单ID
     */
    private String orderId;

    public ResizeBlbResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderId() {
        return this.orderId;
    }

    @Override
    public String toString() {
        return "ResizeBlbResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}