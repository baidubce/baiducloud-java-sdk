package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransformationExampleResponse extends BaseBceResponse {

    /**
    * 当前操作生成的变配订单Id
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public TransformationExampleResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "TransformationExampleResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}
