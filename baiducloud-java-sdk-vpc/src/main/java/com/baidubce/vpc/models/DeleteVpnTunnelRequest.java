package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteVpnTunnelRequest extends BaseBceRequest {

    /**
    * vpnConnId
    */
    @JsonIgnore
    private String vpnConnId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getVpnConnId() {
        return vpnConnId;
    }

    public DeleteVpnTunnelRequest setVpnConnId(String vpnConnId) {
        this.vpnConnId = vpnConnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteVpnTunnelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
