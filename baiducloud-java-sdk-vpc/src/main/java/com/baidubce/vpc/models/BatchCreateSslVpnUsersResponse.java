package com.baidubce.vpc.models;

import java.util.List;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchCreateSslVpnUsersResponse extends BaseBceResponse {
  /** SSL-VPN用户ID列表 */
  private List<String> sslVpnUserIds;

  public BatchCreateSslVpnUsersResponse setSslVpnUserIds(List<String> sslVpnUserIds) {
    this.sslVpnUserIds = sslVpnUserIds;
    return this;
  }

  public List<String> getSslVpnUserIds() {
    return this.sslVpnUserIds;
  }

  @Override
  public String toString() {
    return "BatchCreateSslVpnUsersResponse{" + "sslVpnUserIds=" + sslVpnUserIds + "\n" + "}";
  }
}
