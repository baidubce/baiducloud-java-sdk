package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlbInquiryResponse extends BaseBceResponse {

    /**
    * 返回的价格信息
    */
    private List<Price> prices;

    public List<Price> getPrices() {
        return prices;
    }

    public BlbInquiryResponse setPrices(List<Price> prices) {
        this.prices = prices;
        return this;
    }

    @Override
    public String toString() {
        return "BlbInquiryResponse{" + "prices=" + prices + "\n" + "}";
    }

}
