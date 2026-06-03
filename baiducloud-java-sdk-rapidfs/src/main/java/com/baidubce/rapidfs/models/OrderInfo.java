package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderInfo {
    /**
     * 订单ID
     */
    private String orderId;

    /**
     * RapidFS 实例 ID
     */
    private String instanceId;

    /**
     * 订单状态，见 OrderStatus
     */
    private String orderStatus;

    public OrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public OrderInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public OrderInfo setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    @Override
    public String toString() {
        return "OrderInfo{" + "orderId=" + orderId + "\n" + "instanceId=" + instanceId + "\n" + "orderStatus=" + orderStatus + "\n" + "}";
    }

}