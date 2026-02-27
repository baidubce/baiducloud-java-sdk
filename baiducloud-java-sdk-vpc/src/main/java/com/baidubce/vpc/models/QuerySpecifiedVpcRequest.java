package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySpecifiedVpcRequest {

  /** vpcId */
  @JsonIgnore private String vpcId;

  public String getVpcId() {
    return vpcId;
  }

  public QuerySpecifiedVpcRequest setVpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }
}
