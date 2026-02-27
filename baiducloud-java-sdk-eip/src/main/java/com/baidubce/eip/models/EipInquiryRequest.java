package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EipInquiryRequest extends BaseBceRequest {

  /** 公网带宽，单位为Mbps。对于使用带宽计费的EIP，限制为为1~200之间的整数（代表带宽上限）；对于按使用流量计费的EIP，限制为1~1000之间的整数（代表允许的带宽流量峰值）。 */
  private Integer bandwidthInMbps;

  /** EIP数量，默认为1. */
  private Integer count;

  /** EIP购买线路选择，可选择BGP、Static、ChinaTelcom、ChinaUnicom、ChinaMobile，默认BGP */
  private String purchaseType;

  /** billing */
  private Billing billing;

  public Integer getBandwidthInMbps() {
    return bandwidthInMbps;
  }

  public EipInquiryRequest setBandwidthInMbps(Integer bandwidthInMbps) {
    this.bandwidthInMbps = bandwidthInMbps;
    return this;
  }

  public Integer getCount() {
    return count;
  }

  public EipInquiryRequest setCount(Integer count) {
    this.count = count;
    return this;
  }

  public String getPurchaseType() {
    return purchaseType;
  }

  public EipInquiryRequest setPurchaseType(String purchaseType) {
    this.purchaseType = purchaseType;
    return this;
  }

  public Billing getBilling() {
    return billing;
  }

  public EipInquiryRequest setBilling(Billing billing) {
    this.billing = billing;
    return this;
  }
}
