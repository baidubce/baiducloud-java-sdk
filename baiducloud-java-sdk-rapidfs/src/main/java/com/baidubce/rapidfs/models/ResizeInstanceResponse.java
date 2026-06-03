package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeInstanceResponse extends BaseBceResponse {

    /**
    * 扩容订单 ID
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public ResizeInstanceResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "ResizeInstanceResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}
