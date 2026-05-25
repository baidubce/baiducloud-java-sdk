package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryIpv6GatewayRequest extends BaseBceRequest {

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

    public String getVpcId() {
        return vpcId;
    }

    public QueryIpv6GatewayRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

}
