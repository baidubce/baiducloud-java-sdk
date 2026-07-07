package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.baidubce.annotation.Host;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserinfoEndpointRequest extends BaseBceRequest {

    /**
    * userPoolId
    */
    @JsonIgnore
    private String userPoolId;

    /**
    * authorization
    */
    @Host
    @JsonIgnore
    private String authorization;

    public String getUserPoolId() {
        return userPoolId;
    }

    public UserinfoEndpointRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getAuthorization() {
        return authorization;
    }

    public UserinfoEndpointRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

}
