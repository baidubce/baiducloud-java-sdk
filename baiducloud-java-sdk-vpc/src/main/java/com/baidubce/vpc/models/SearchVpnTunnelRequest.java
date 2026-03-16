package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchVpnTunnelRequest {

  /** vpnId */
  @JsonIgnore private String vpnId;

  /** clientToken */
  @JsonIgnore private String clientToken;

  public String getVpnId() {
    return vpnId;
  }

  public SearchVpnTunnelRequest setVpnId(String vpnId) {
    this.vpnId = vpnId;
    return this;
  }

  public String getClientToken() {
    return clientToken;
  }

  public SearchVpnTunnelRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }
}
