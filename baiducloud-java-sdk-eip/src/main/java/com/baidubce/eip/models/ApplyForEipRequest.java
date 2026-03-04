package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplyForEipRequest extends BaseBceRequest {

  /** clientToken */
  @JsonIgnore private String clientToken;

  /** EIP IP类型，包含ipv4和ipv6，默认ipv4。 */
  private String ipVersion;

  /** EIP线路类型，包含标准BGP（BGP）和增强BGP（BGP_S），默认标准BGP。 */
  private String routeType;

  /**
   * 公网带宽，单位为Mbps。对于预付费以及按使用带宽计费的后付费EIP，标准型BGP限制为1~500之间的整数，增强型BGP限制为100~5000之间的整数（代表带宽上限）；对于按使用流量计费的后付费EIP，标准型BGP限制为1~200之间的整数（代表允许的带宽流量峰值）
   */
  private Integer bandwidthInMbps;

  /** billing */
  private Billing billing;

  /** 长度1~65个字节，字母开头，可包含字母数字-\_/.字符。若不传该参数，服务会自动生成name。 */
  private String name;

  /** 待创建的标签键值对列表。 */
  private List<TagModel> tags;

  /** 创建EIP的同时绑定的资源分组的ID */
  private String resourceGroupId;

  /** 支持创建 EIP同时开通自动续费，取值为 month 获 year （默认 month）。 */
  private String autoRenewTimeUnit;

  /** 支持创建 EIP同时开通自动续费，根据autoRenewTimeUnit的取值有不同的范围，month 为1到9，year 为1到3。 */
  private Integer autoRenewTime;

  /** 是否开启释放保护。缺省值为false，代表允许删除 */
  private Boolean deleteProtect;

  public String getClientToken() {
    return clientToken;
  }

  public ApplyForEipRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  public String getIpVersion() {
    return ipVersion;
  }

  public ApplyForEipRequest setIpVersion(String ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

  public String getRouteType() {
    return routeType;
  }

  public ApplyForEipRequest setRouteType(String routeType) {
    this.routeType = routeType;
    return this;
  }

  public Integer getBandwidthInMbps() {
    return bandwidthInMbps;
  }

  public ApplyForEipRequest setBandwidthInMbps(Integer bandwidthInMbps) {
    this.bandwidthInMbps = bandwidthInMbps;
    return this;
  }

  public Billing getBilling() {
    return billing;
  }

  public ApplyForEipRequest setBilling(Billing billing) {
    this.billing = billing;
    return this;
  }

  public String getName() {
    return name;
  }

  public ApplyForEipRequest setName(String name) {
    this.name = name;
    return this;
  }

  public List<TagModel> getTags() {
    return tags;
  }

  public ApplyForEipRequest setTags(List<TagModel> tags) {
    this.tags = tags;
    return this;
  }

  public String getResourceGroupId() {
    return resourceGroupId;
  }

  public ApplyForEipRequest setResourceGroupId(String resourceGroupId) {
    this.resourceGroupId = resourceGroupId;
    return this;
  }

  public String getAutoRenewTimeUnit() {
    return autoRenewTimeUnit;
  }

  public ApplyForEipRequest setAutoRenewTimeUnit(String autoRenewTimeUnit) {
    this.autoRenewTimeUnit = autoRenewTimeUnit;
    return this;
  }

  public Integer getAutoRenewTime() {
    return autoRenewTime;
  }

  public ApplyForEipRequest setAutoRenewTime(Integer autoRenewTime) {
    this.autoRenewTime = autoRenewTime;
    return this;
  }

  public Boolean getDeleteProtect() {
    return deleteProtect;
  }

  public ApplyForEipRequest setDeleteProtect(Boolean deleteProtect) {
    this.deleteProtect = deleteProtect;
    return this;
  }
}
