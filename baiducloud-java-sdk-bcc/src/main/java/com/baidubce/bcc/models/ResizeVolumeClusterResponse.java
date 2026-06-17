package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeVolumeClusterResponse extends BaseBceResponse {

    /**
    * 订单ID
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public ResizeVolumeClusterResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "ResizeVolumeClusterResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}
