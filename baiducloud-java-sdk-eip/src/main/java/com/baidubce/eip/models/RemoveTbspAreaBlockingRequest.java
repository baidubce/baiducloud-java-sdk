package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveTbspAreaBlockingRequest {

  /** id */
  @JsonIgnore private String id;

  /** ip */
  @JsonIgnore private String ip;

  /** blockType */
  @JsonIgnore private String blockType;

  /** clientToken */
  @JsonIgnore private String clientToken;

  public String getId() {
    return id;
  }

  public RemoveTbspAreaBlockingRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getIp() {
    return ip;
  }

  public RemoveTbspAreaBlockingRequest setIp(String ip) {
    this.ip = ip;
    return this;
  }

  public String getBlockType() {
    return blockType;
  }

  public RemoveTbspAreaBlockingRequest setBlockType(String blockType) {
    this.blockType = blockType;
    return this;
  }

  public String getClientToken() {
    return clientToken;
  }

  public RemoveTbspAreaBlockingRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }
}
