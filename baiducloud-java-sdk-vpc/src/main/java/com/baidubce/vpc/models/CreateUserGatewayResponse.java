package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateUserGatewayResponse extends BaseBceResponse {
  /** 用户网关id */
  private String cgwId;

  public CreateUserGatewayResponse setCgwId(String cgwId) {
    this.cgwId = cgwId;
    return this;
  }

  public String getCgwId() {
    return this.cgwId;
  }

  @Override
  public String toString() {
    return "CreateUserGatewayResponse{" + "cgwId=" + cgwId + "\n" + "}";
  }
}
