package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseReservedVolumeResponse extends BaseBceResponse {

    /**
    * 订单ID
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public PurchaseReservedVolumeResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "PurchaseReservedVolumeResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}
