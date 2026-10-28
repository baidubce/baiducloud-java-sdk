package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateElasticityAssuranceResponse extends BaseBceResponse {

    /**
    * 创建弹性保障的订单号
    */
    private String orderId;

    /**
    * 弹性保障id
    */
    private List<String> elasticityAssuranceIds;

    public String getOrderId() {
        return orderId;
    }

    public CreateElasticityAssuranceResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public List<String> getElasticityAssuranceIds() {
        return elasticityAssuranceIds;
    }

    public CreateElasticityAssuranceResponse setElasticityAssuranceIds(List<String> elasticityAssuranceIds) {
        this.elasticityAssuranceIds = elasticityAssuranceIds;
        return this;
    }

    @Override
    public String toString() {
        return "CreateElasticityAssuranceResponse{" + "orderId=" + orderId + "\n" + "elasticityAssuranceIds=" + elasticityAssuranceIds + "\n" + "}";
    }

}
