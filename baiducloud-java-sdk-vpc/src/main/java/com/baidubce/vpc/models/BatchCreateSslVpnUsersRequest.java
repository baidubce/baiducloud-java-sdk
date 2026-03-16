package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchCreateSslVpnUsersRequest extends BaseBceRequest {

  /** vpnId */
  @JsonIgnore private String vpnId;

  /** clientToken */
  @JsonIgnore private String clientToken;

  /** SSL-VPN用户列表 */
  private List<SslVpnUser> sslVpnUsers;

  public String getVpnId() {
    return vpnId;
  }

  public BatchCreateSslVpnUsersRequest setVpnId(String vpnId) {
    this.vpnId = vpnId;
    return this;
  }

  public String getClientToken() {
    return clientToken;
  }

  public BatchCreateSslVpnUsersRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  public List<SslVpnUser> getSslVpnUsers() {
    return sslVpnUsers;
  }

  public BatchCreateSslVpnUsersRequest setSslVpnUsers(List<SslVpnUser> sslVpnUsers) {
    this.sslVpnUsers = sslVpnUsers;
    return this;
  }
}
