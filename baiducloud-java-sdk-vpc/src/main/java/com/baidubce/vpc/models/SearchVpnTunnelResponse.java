package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchVpnTunnelResponse extends BaseBceResponse {

    /**
    * VPN隧道列表
    */
    private List<VpnConn> vpnConns;

    public List<VpnConn> getVpnConns() {
        return vpnConns;
    }

    public SearchVpnTunnelResponse setVpnConns(List<VpnConn> vpnConns) {
        this.vpnConns = vpnConns;
        return this;
    }

    @Override
    public String toString() {
        return "SearchVpnTunnelResponse{" + "vpnConns=" + vpnConns + "\n" + "}";
    }

}
