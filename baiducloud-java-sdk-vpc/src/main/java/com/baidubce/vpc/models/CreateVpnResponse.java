package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateVpnResponse extends BaseBceResponse {
    /**
     * VPN的ID
     */
    private String vpnId;

    public CreateVpnResponse setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    public String getVpnId() {
        return this.vpnId;
    }

    @Override
    public String toString() {
        return "CreateVpnResponse{" + "vpnId=" + vpnId + "\n" + "}";
    }

}