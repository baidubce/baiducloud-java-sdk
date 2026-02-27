package com.baidubce.eip.models;

import java.util.HashMap;
import java.util.Map;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SharedBandwidthInquiryResponse extends BaseBceResponse {
  /** 价格明细（包含purchasePrice（预付费价格）、configPrice（配置价格）） */
  private Map<String, String> prices;

  public SharedBandwidthInquiryResponse setPrices(Map<String, String> prices) {
    this.prices = prices;
    return this;
  }

  public Map<String, String> getPrices() {
    return this.prices;
  }

  @Override
  public String toString() {
    return "SharedBandwidthInquiryResponse{" + "prices=" + prices + "\n" + "}";
  }
}
