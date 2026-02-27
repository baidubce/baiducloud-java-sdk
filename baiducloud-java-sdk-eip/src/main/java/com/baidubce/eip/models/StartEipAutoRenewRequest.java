package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StartEipAutoRenewRequest extends BaseBceRequest {

  /** eip */
  @JsonIgnore private String eip;

  /** clientToken */
  @JsonIgnore private String clientToken;

  /** 取值为 month 获 year （默认 month） */
  private String autoRenewTimeUnit;

  /** 根据autoRenewTimeUnit的取值有不同的范围，month 为1到9，year 为1到3 */
  private Integer autoRenewTime;

  public String getEip() {
    return eip;
  }

  public StartEipAutoRenewRequest setEip(String eip) {
    this.eip = eip;
    return this;
  }

  public String getClientToken() {
    return clientToken;
  }

  public StartEipAutoRenewRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  public String getAutoRenewTimeUnit() {
    return autoRenewTimeUnit;
  }

  public StartEipAutoRenewRequest setAutoRenewTimeUnit(String autoRenewTimeUnit) {
    this.autoRenewTimeUnit = autoRenewTimeUnit;
    return this;
  }

  public Integer getAutoRenewTime() {
    return autoRenewTime;
  }

  public StartEipAutoRenewRequest setAutoRenewTime(Integer autoRenewTime) {
    this.autoRenewTime = autoRenewTime;
    return this;
  }
}
