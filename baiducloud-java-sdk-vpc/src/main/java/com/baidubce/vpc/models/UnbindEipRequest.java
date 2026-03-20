package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbindEipRequest {

    /**
    * vpnId
    */
    @JsonIgnore
    private String vpnId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getVpnId() {
        return vpnId;
    }

    public UnbindEipRequest setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UnbindEipRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
