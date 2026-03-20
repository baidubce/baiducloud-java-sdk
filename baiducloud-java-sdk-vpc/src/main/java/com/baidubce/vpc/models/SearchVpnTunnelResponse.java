package com.baidubce.vpc.models;

import java.util.List;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchVpnTunnelResponse extends BaseBceResponse {
    /**
     * VPN隧道列表
     */
    private List<VpnConn> vpnConns;

    public SearchVpnTunnelResponse setVpnConns(List<VpnConn> vpnConns) {
        this.vpnConns = vpnConns;
        return this;
    }

    public List<VpnConn> getVpnConns() {
        return this.vpnConns;
    }

    @Override
    public String toString() {
        return "SearchVpnTunnelResponse{" + "vpnConns=" + vpnConns + "\n" + "}";
    }

}