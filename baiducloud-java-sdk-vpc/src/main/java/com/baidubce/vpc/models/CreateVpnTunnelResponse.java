package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateVpnTunnelResponse extends BaseBceResponse {
  /** VPN隧道的ID */
  private String vpnConnId;

  public CreateVpnTunnelResponse setVpnConnId(String vpnConnId) {
    this.vpnConnId = vpnConnId;
    return this;
  }

  public String getVpnConnId() {
    return this.vpnConnId;
  }

  @Override
  public String toString() {
    return "CreateVpnTunnelResponse{" + "vpnConnId=" + vpnConnId + "\n" + "}";
  }
}
