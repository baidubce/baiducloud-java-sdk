package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseReservedVolumeClusterResponse extends BaseBceResponse {

    /**
    * 订单ID
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public PurchaseReservedVolumeClusterResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "PurchaseReservedVolumeClusterResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}
