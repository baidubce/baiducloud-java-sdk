package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveTbspIpWhitelistRequest {

  /** id */
  @JsonIgnore private String id;

  /** clientToken */
  @JsonIgnore private String clientToken;

  /** ip */
  @JsonIgnore private String ip;

  /** whitelistId */
  @JsonIgnore private String whitelistId;

  public String getId() {
    return id;
  }

  public RemoveTbspIpWhitelistRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getClientToken() {
    return clientToken;
  }

  public RemoveTbspIpWhitelistRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  public String getIp() {
    return ip;
  }

  public RemoveTbspIpWhitelistRequest setIp(String ip) {
    this.ip = ip;
    return this;
  }

  public String getWhitelistId() {
    return whitelistId;
  }

  public RemoveTbspIpWhitelistRequest setWhitelistId(String whitelistId) {
    this.whitelistId = whitelistId;
    return this;
  }
}
