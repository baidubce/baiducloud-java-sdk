package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAProxyInstanceResponse extends BaseBceResponse {

    /**
    * 实例ID列表
    */
    private List<String> instanceIds;

    /**
    * 订单ID
    */
    private String orderId;

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public CreateAProxyInstanceResponse setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public CreateAProxyInstanceResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAProxyInstanceResponse{" + "instanceIds=" + instanceIds + "\n" + "orderId=" + orderId + "\n" + "}";
    }

}
