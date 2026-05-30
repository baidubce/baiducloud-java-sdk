package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatePfsResponse extends BaseBceResponse {

    /**
    * 实例Id
    */
    private String instanceId;

    /**
    * 订单id
    */
    private String orderId;

    public String getInstanceId() {
        return instanceId;
    }

    public CreatePfsResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public CreatePfsResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "CreatePfsResponse{" + "instanceId=" + instanceId + "\n" + "orderId=" + orderId + "\n" + "}";
    }

}
