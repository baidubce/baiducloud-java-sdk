package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateSslVpnUsersRequest extends BaseBceRequest {

  /** vpnId */
  @JsonIgnore private String vpnId;

  /** userId */
  @JsonIgnore private String userId;

  /** clientToken */
  @JsonIgnore private String clientToken;

  /** 客户端名称 */
  private String clientName;

  /** 密码，8～17位字符，英文、数字和符号必须同时存在，符号仅限!@#$%^*(_ */
  private String password;

  /** 描述 */
  private String description;

  public String getVpnId() {
    return vpnId;
  }

  public UpdateSslVpnUsersRequest setVpnId(String vpnId) {
    this.vpnId = vpnId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  public UpdateSslVpnUsersRequest setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getClientToken() {
    return clientToken;
  }

  public UpdateSslVpnUsersRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  public String getClientName() {
    return clientName;
  }

  public UpdateSslVpnUsersRequest setClientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public UpdateSslVpnUsersRequest setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public UpdateSslVpnUsersRequest setDescription(String description) {
    this.description = description;
    return this;
  }
}
