package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSslVpnServerResponse extends BaseBceResponse {
  /** SSL-VPN服务端唯一ID */
  private String sslVpnServerId;

  public CreateSslVpnServerResponse setSslVpnServerId(String sslVpnServerId) {
    this.sslVpnServerId = sslVpnServerId;
    return this;
  }

  public String getSslVpnServerId() {
    return this.sslVpnServerId;
  }

  @Override
  public String toString() {
    return "CreateSslVpnServerResponse{" + "sslVpnServerId=" + sslVpnServerId + "\n" + "}";
  }
}
