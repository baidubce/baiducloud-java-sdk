package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisableTbspIpCleanRequest extends BaseBceRequest {

  /** id */
  @JsonIgnore private String id;

  /** clientToken */
  @JsonIgnore private String clientToken;

  /** DDoS增强防护包防护对象IP地址 */
  private String ip;

  /** 防护对象IP关闭清洗时长 (单位: 分钟)，最小值为30，最大值为7200 */
  private Integer turnOffDuration;

  public String getId() {
    return id;
  }

  public DisableTbspIpCleanRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getClientToken() {
    return clientToken;
  }

  public DisableTbspIpCleanRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  public String getIp() {
    return ip;
  }

  public DisableTbspIpCleanRequest setIp(String ip) {
    this.ip = ip;
    return this;
  }

  public Integer getTurnOffDuration() {
    return turnOffDuration;
  }

  public DisableTbspIpCleanRequest setTurnOffDuration(Integer turnOffDuration) {
    this.turnOffDuration = turnOffDuration;
    return this;
  }
}
