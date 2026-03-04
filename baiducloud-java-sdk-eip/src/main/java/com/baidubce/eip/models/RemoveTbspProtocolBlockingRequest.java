package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveTbspProtocolBlockingRequest {

  /** id */
  @JsonIgnore private String id;

  /** ip */
  @JsonIgnore private String ip;

  /** clientToken */
  @JsonIgnore private String clientToken;

  public String getId() {
    return id;
  }

  public RemoveTbspProtocolBlockingRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getIp() {
    return ip;
  }

  public RemoveTbspProtocolBlockingRequest setIp(String ip) {
    this.ip = ip;
    return this;
  }

  public String getClientToken() {
    return clientToken;
  }

  public RemoveTbspProtocolBlockingRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }
}
