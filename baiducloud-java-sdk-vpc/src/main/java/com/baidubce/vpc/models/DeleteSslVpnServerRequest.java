package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteSslVpnServerRequest {

    /**
    * vpnId
    */
    @JsonIgnore
    private String vpnId;

    /**
    * sslVpnServerId
    */
    @JsonIgnore
    private String sslVpnServerId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getVpnId() {
        return vpnId;
    }

    public DeleteSslVpnServerRequest setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    public String getSslVpnServerId() {
        return sslVpnServerId;
    }

    public DeleteSslVpnServerRequest setSslVpnServerId(String sslVpnServerId) {
        this.sslVpnServerId = sslVpnServerId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteSslVpnServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
