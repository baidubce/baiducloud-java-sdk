package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindEipRequest extends BaseBceRequest {

  /** eip */
  @JsonIgnore private String eip;

  /** clientToken */
  @JsonIgnore private String clientToken;

  /** 被绑定的实例类型 */
  private String instanceType;

  /** 被绑定的实例ID */
  private String instanceId;

  /** 实例中需要绑定EIP的IP */
  private String instanceIp;

  public String getEip() {
    return eip;
  }

  public BindEipRequest setEip(String eip) {
    this.eip = eip;
    return this;
  }

  public String getClientToken() {
    return clientToken;
  }

  public BindEipRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  public String getInstanceType() {
    return instanceType;
  }

  public BindEipRequest setInstanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  public String getInstanceId() {
    return instanceId;
  }

  public BindEipRequest setInstanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  public String getInstanceIp() {
    return instanceIp;
  }

  public BindEipRequest setInstanceIp(String instanceIp) {
    this.instanceIp = instanceIp;
    return this;
  }
}
