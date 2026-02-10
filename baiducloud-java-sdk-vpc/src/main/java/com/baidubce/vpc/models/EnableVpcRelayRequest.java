package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnableVpcRelayRequest {

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

    public EnableVpcRelayRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public EnableVpcRelayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }


}
