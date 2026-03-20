package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteSslVpnUserRequest {

    /**
    * vpnId
    */
    @JsonIgnore
    private String vpnId;

    /**
    * userId
    */
    @JsonIgnore
    private String userId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getVpnId() {
        return vpnId;
    }

    public DeleteSslVpnUserRequest setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public DeleteSslVpnUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteSslVpnUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
