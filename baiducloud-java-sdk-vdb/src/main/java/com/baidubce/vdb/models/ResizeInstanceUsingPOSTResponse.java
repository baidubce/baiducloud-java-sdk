package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeInstanceUsingPOSTResponse extends BaseBceResponse {

    /**
    * orderId
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public ResizeInstanceUsingPOSTResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "ResizeInstanceUsingPOSTResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}
