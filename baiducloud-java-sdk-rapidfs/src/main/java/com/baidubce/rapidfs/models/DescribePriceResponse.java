package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribePriceResponse extends BaseBceResponse {

    /**
    * 价格信息，见附录 PriceInfo
    */
    private List<PriceInfo> priceInfos;

    public List<PriceInfo> getPriceInfos() {
        return priceInfos;
    }

    public DescribePriceResponse setPriceInfos(List<PriceInfo> priceInfos) {
        this.priceInfos = priceInfos;
        return this;
    }

    @Override
    public String toString() {
        return "DescribePriceResponse{" + "priceInfos=" + priceInfos + "\n" + "}";
    }

}
