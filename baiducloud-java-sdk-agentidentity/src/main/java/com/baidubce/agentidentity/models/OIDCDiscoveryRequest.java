package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OIDCDiscoveryRequest extends BaseBceRequest {

    /**
    * userPoolId
    */
    @JsonIgnore
    private String userPoolId;

    public String getUserPoolId() {
        return userPoolId;
    }

    public OIDCDiscoveryRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

}
