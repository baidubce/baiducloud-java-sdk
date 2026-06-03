package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeOrderRequest extends BaseBceRequest {

    /**
    * 订单ID，创建实例时，接口会返回订单ID
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public DescribeOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

}
