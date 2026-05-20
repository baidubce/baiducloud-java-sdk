package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDedicatedGatewayResponse extends BaseBceResponse {

    /**
    * 创建的专线网关的ID
    */
    private String etGatewayId;

    public String getEtGatewayId() {
        return etGatewayId;
    }

    public CreateDedicatedGatewayResponse setEtGatewayId(String etGatewayId) {
        this.etGatewayId = etGatewayId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateDedicatedGatewayResponse{" + "etGatewayId=" + etGatewayId + "\n" + "}";
    }

}
