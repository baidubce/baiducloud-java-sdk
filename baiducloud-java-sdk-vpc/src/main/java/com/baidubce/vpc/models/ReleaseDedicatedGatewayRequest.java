package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReleaseDedicatedGatewayRequest extends BaseBceRequest {

    /**
    * etGatewayId
    */
    @JsonIgnore
    private String etGatewayId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getEtGatewayId() {
        return etGatewayId;
    }

    public ReleaseDedicatedGatewayRequest setEtGatewayId(String etGatewayId) {
        this.etGatewayId = etGatewayId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ReleaseDedicatedGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
