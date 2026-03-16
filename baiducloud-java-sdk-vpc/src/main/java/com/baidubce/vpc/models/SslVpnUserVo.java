package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SslVpnUserVo {
  /** 客户端名称 */
  private String clientName;

  /** 用户名 */
  private String userName;

  /** 用户ID */
  private String userId;

  /** 描述 */
  private String description;

  public SslVpnUserVo setClientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  public String getClientName() {
    return this.clientName;
  }

  public SslVpnUserVo setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return this.userName;
  }

  public SslVpnUserVo setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return this.userId;
  }

  public SslVpnUserVo setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return this.description;
  }

  @Override
  public String toString() {
    return "SslVpnUserVo{"
        + "clientName="
        + clientName
        + "\n"
        + "userName="
        + userName
        + "\n"
        + "userId="
        + userId
        + "\n"
        + "description="
        + description
        + "\n"
        + "}";
  }
}
