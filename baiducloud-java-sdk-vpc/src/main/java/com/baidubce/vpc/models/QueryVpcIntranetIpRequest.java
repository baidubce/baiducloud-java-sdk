package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryVpcIntranetIpRequest {

  /** vpcId */
  @JsonIgnore private String vpcId;

  /** privateIpAddresses */
  @JsonIgnore private List privateIpAddresses;

  /** privateIpRange */
  @JsonIgnore private String privateIpRange;

  public String getVpcId() {
    return vpcId;
  }

  public QueryVpcIntranetIpRequest setVpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  public List getPrivateIpAddresses() {
    return privateIpAddresses;
  }

  public QueryVpcIntranetIpRequest setPrivateIpAddresses(List privateIpAddresses) {
    this.privateIpAddresses = privateIpAddresses;
    return this;
  }

  public String getPrivateIpRange() {
    return privateIpRange;
  }

  public QueryVpcIntranetIpRequest setPrivateIpRange(String privateIpRange) {
    this.privateIpRange = privateIpRange;
    return this;
  }
}
