
package com.baidubce.eip.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BandwidthPackageInquiryResponse extends BaseBceResponse  {
    /**
     * 价格明细（包含configPrice（配置价格））
     */
    private Map<String, String> prices;

    public BandwidthPackageInquiryResponse setPrices(Map<String, String> prices) {
        this.prices = prices;
        return this;
    }

    public Map<String, String> getPrices() {
        return this.prices;
    }

    @Override
    public String toString() {
        return "BandwidthPackageInquiryResponse{"
                + "prices=" + prices + "\n"
                + "}";
    }




}