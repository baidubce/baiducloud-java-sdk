package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RefundEipRequest {

  /** eip */
  @JsonIgnore private String eip;

  /** clientToken */
  @JsonIgnore private String clientToken;

  public String getEip() {
    return eip;
  }

  public RefundEipRequest setEip(String eip) {
    this.eip = eip;
    return this;
  }

  public String getClientToken() {
    return clientToken;
  }

  public RefundEipRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }
}
