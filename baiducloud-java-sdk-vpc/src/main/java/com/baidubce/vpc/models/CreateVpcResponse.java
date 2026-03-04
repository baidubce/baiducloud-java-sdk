package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateVpcResponse extends BaseBceResponse {
  /** 创建VPC的id */
  private String vpcId;

  public CreateVpcResponse setVpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  public String getVpcId() {
    return this.vpcId;
  }

  @Override
  public String toString() {
    return "CreateVpcResponse{" + "vpcId=" + vpcId + "\n" + "}";
  }
}
