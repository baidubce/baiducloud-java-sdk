package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindTbspProtectionObjectRequest extends BaseBceRequest {

  /** id */
  @JsonIgnore private String id;

  /** clientToken */
  @JsonIgnore private String clientToken;

  /** 绑定的防护对象IP列表（IP地址的线路类型和DDoS增强防护包的线路类型一致才可以绑定） */
  private List<String> ipList;

  public String getId() {
    return id;
  }

  public BindTbspProtectionObjectRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getClientToken() {
    return clientToken;
  }

  public BindTbspProtectionObjectRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  public List<String> getIpList() {
    return ipList;
  }

  public BindTbspProtectionObjectRequest setIpList(List<String> ipList) {
    this.ipList = ipList;
    return this;
  }
}
