package com.baidubce.blb.models;

import java.util.List;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlbInquiryResponse extends BaseBceResponse {
    /**
     * 返回的价格信息
     */
    private List<Price> prices;

    public BlbInquiryResponse setPrices(List<Price> prices) {
        this.prices = prices;
        return this;
    }

    public List<Price> getPrices() {
        return this.prices;
    }

    @Override
    public String toString() {
        return "BlbInquiryResponse{" + "prices=" + prices + "\n" + "}";
    }

}
