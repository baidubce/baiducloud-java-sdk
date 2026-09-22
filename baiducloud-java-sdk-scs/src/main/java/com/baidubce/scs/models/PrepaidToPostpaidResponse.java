package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrepaidToPostpaidResponse extends BaseBceResponse {

    /**
    * 订单ID。多个集群同时变更会产生多个订单，订单以英文逗号分隔。
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public PrepaidToPostpaidResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "PrepaidToPostpaidResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}
