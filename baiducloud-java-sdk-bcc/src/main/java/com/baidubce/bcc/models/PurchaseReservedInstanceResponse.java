package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseReservedInstanceResponse extends BaseBceResponse {

    /**
    * 订单id
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public PurchaseReservedInstanceResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "PurchaseReservedInstanceResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}
