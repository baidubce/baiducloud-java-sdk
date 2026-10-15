package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAPrimaryInstanceResponse extends BaseBceResponse {

    /**
    * 由InstanceId组成的数组
    */
    private List<String> instanceIds;

    /**
    * 订单 ID
    */
    private String orderId;

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public CreateAPrimaryInstanceResponse setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public CreateAPrimaryInstanceResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAPrimaryInstanceResponse{" + "instanceIds=" + instanceIds + "\n" + "orderId=" + orderId + "\n" + "}";
    }

}
