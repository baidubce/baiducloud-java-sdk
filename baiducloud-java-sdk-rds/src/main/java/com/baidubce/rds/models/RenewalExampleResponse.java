package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenewalExampleResponse extends BaseBceResponse {

    /**
    * 续费订单ID
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public RenewalExampleResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "RenewalExampleResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}
