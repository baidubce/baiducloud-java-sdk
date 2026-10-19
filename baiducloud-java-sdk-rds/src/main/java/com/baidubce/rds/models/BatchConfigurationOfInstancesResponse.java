package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchConfigurationOfInstancesResponse extends BaseBceResponse {

    /**
    * 批量变配的订单号数组
    */
    private List<String> orderList;

    public List<String> getOrderList() {
        return orderList;
    }

    public BatchConfigurationOfInstancesResponse setOrderList(List<String> orderList) {
        this.orderList = orderList;
        return this;
    }

    @Override
    public String toString() {
        return "BatchConfigurationOfInstancesResponse{" + "orderList=" + orderList + "\n" + "}";
    }

}
