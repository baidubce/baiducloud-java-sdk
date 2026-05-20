package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheDetailsOfTheDedicatedGatewayRequest extends BaseBceRequest {

    /**
    * etGatewayId
    */
    @JsonIgnore
    private String etGatewayId;

    public String getEtGatewayId() {
        return etGatewayId;
    }

    public QueryTheDetailsOfTheDedicatedGatewayRequest setEtGatewayId(String etGatewayId) {
        this.etGatewayId = etGatewayId;
        return this;
    }

}
