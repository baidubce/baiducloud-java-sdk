package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenewElasticityAssuranceResponse extends BaseBceResponse {

    /**
    * 续费弹性保障的订单号
    */
    private String orderId;

    /**
    * 弹性保障的id集合
    */
    private List<String> elasticityAssuranceIds;

    public String getOrderId() {
        return orderId;
    }

    public RenewElasticityAssuranceResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public List<String> getElasticityAssuranceIds() {
        return elasticityAssuranceIds;
    }

    public RenewElasticityAssuranceResponse setElasticityAssuranceIds(List<String> elasticityAssuranceIds) {
        this.elasticityAssuranceIds = elasticityAssuranceIds;
        return this;
    }

    @Override
    public String toString() {
        return "RenewElasticityAssuranceResponse{" + "orderId=" + orderId + "\n" + "elasticityAssuranceIds=" + elasticityAssuranceIds + "\n" + "}";
    }

}
