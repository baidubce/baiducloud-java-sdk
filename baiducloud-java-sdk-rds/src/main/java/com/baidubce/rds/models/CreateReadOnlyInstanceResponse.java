package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateReadOnlyInstanceResponse extends BaseBceResponse {

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

    public CreateReadOnlyInstanceResponse setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public CreateReadOnlyInstanceResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateReadOnlyInstanceResponse{" + "instanceIds=" + instanceIds + "\n" + "orderId=" + orderId + "\n" + "}";
    }

}
