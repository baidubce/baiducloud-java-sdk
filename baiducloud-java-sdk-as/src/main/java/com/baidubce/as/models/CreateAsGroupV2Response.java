package com.baidubce.as.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAsGroupV2Response extends BaseBceResponse {

    /**
    * 伸缩组ID
    */
    private String groupId;

    /**
    * 订单ID
    */
    private List<String> orderId;

    public String getGroupId() {
        return groupId;
    }

    public CreateAsGroupV2Response setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public List<String> getOrderId() {
        return orderId;
    }

    public CreateAsGroupV2Response setOrderId(List<String> orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAsGroupV2Response{" + "groupId=" + groupId + "\n" + "orderId=" + orderId + "\n" + "}";
    }

}
