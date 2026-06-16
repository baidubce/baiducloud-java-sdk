package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CancelBidOrderRequest extends BaseBceRequest {

    /**
    * 订单ID
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public CancelBidOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

}
