package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInstanceResponse extends BaseBceResponse {

    /**
    * 订单ID
    */
    private String orderId;

    /**
    * 实例ID
    */
    private String instanceId;

    public String getOrderId() {
        return orderId;
    }

    public CreateInstanceResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public CreateInstanceResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateInstanceResponse{" + "orderId=" + orderId + "\n" + "instanceId=" + instanceId + "\n" + "}";
    }

}
