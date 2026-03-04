package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateVpcRequest extends BaseBceRequest {

  /** clientToken */
  @JsonIgnore private String clientToken;

  /** VPC名称，不能取值"default"，长度不超过65个字符，可由数字，字符，下划线组成 */
  private String name;

  /** VPC描述，不超过200字符 */
  private String description;

  /** VPC的cidr */
  private String cidr;

  /** 是否开启IPv6网段，true开启，默认false不开启。 */
  private Boolean enableIpv6;

  /** 待创建的标签键值对列表 */
  private List<TagModel> tags;

  public String getClientToken() {
    return clientToken;
  }

  public CreateVpcRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateVpcRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateVpcRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getCidr() {
    return cidr;
  }

  public CreateVpcRequest setCidr(String cidr) {
    this.cidr = cidr;
    return this;
  }

  public Boolean getEnableIpv6() {
    return enableIpv6;
  }

  public CreateVpcRequest setEnableIpv6(Boolean enableIpv6) {
    this.enableIpv6 = enableIpv6;
    return this;
  }

  public List<TagModel> getTags() {
    return tags;
  }

  public CreateVpcRequest setTags(List<TagModel> tags) {
    this.tags = tags;
    return this;
  }
}
