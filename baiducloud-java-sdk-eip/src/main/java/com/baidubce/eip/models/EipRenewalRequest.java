package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EipRenewalRequest extends BaseBceRequest {

  /** eip */
  @JsonIgnore private String eip;

  /** clientToken */
  @JsonIgnore private String clientToken;

  /** billing */
  private Billing billing;

  public String getEip() {
    return eip;
  }

  public EipRenewalRequest setEip(String eip) {
    this.eip = eip;
    return this;
  }

  public String getClientToken() {
    return clientToken;
  }

  public EipRenewalRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  public Billing getBilling() {
    return billing;
  }

  public EipRenewalRequest setBilling(Billing billing) {
    this.billing = billing;
    return this;
  }
}
