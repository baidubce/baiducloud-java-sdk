package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceBatchResizeBySpecResponse extends BaseBceResponse {

    /**
    * 变配订单ID列表
    */
    private List<String> orderUuidResults;

    public List<String> getOrderUuidResults() {
        return orderUuidResults;
    }

    public InstanceBatchResizeBySpecResponse setOrderUuidResults(List<String> orderUuidResults) {
        this.orderUuidResults = orderUuidResults;
        return this;
    }

    @Override
    public String toString() {
        return "InstanceBatchResizeBySpecResponse{" + "orderUuidResults=" + orderUuidResults + "\n" + "}";
    }

}
