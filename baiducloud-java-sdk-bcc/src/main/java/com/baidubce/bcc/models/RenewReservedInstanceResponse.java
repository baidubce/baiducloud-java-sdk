package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenewReservedInstanceResponse extends BaseBceResponse {

    /**
    * 创建预留实例券的订单号
    */
    private String orderId;

    /**
    * 预留实例券的id集合
    */
    private List<String> reservedInstanceIds;

    public String getOrderId() {
        return orderId;
    }

    public RenewReservedInstanceResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public List<String> getReservedInstanceIds() {
        return reservedInstanceIds;
    }

    public RenewReservedInstanceResponse setReservedInstanceIds(List<String> reservedInstanceIds) {
        this.reservedInstanceIds = reservedInstanceIds;
        return this;
    }

    @Override
    public String toString() {
        return "RenewReservedInstanceResponse{" + "orderId=" + orderId + "\n" + "reservedInstanceIds=" + reservedInstanceIds + "\n" + "}";
    }

}
