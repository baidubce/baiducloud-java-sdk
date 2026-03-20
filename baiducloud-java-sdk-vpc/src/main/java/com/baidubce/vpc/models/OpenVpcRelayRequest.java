package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenVpcRelayRequest {

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getVpcId() {
        return vpcId;
    }

    public OpenVpcRelayRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public OpenVpcRelayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
