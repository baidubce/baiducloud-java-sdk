package com.baidubce.eip.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SharedBandwidthInquiryResponse extends BaseBceResponse {

    /**
    * 价格明细（包含purchasePrice（预付费价格）、configPrice（配置价格））
    */
    private Map<String, String> prices;

    public Map<String, String> getPrices() {
        return prices;
    }

    public SharedBandwidthInquiryResponse setPrices(Map<String, String> prices) {
        this.prices = prices;
        return this;
    }

    @Override
    public String toString() {
        return "SharedBandwidthInquiryResponse{" + "prices=" + prices + "\n" + "}";
    }

}
