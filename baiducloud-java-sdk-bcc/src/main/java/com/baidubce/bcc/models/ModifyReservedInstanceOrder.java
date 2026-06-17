package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyReservedInstanceOrder {
    /**
     * 预留实例券的id
     */
    private String reservedInstanceId;

    /**
     * 预留实例券变更的订单号
     */
    private String orderId;

    public ModifyReservedInstanceOrder setReservedInstanceId(String reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
        return this;
    }

    public String getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    public ModifyReservedInstanceOrder setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderId() {
        return this.orderId;
    }

    @Override
    public String toString() {
        return "ModifyReservedInstanceOrder{" + "reservedInstanceId=" + reservedInstanceId + "\n" + "orderId=" + orderId + "\n" + "}";
    }

}