package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeOrderResponse extends BaseBceResponse {

    /**
    * orderInfo
    */
    private OrderInfo orderInfo;

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public DescribeOrderResponse setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeOrderResponse{" + "orderInfo=" + orderInfo + "\n" + "}";
    }

}
