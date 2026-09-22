package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangeConfigurationResponse extends BaseBceResponse {

    /**
    * 订单ID
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public ChangeConfigurationResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "ChangeConfigurationResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}
