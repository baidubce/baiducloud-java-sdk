package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCdsPriceResponse extends BaseBceResponse {

    /**
    * 查询CDS对应价格信息
    */
    private List<CdsPrices> price;

    public List<CdsPrices> getPrice() {
        return price;
    }

    public GetCdsPriceResponse setPrice(List<CdsPrices> price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "GetCdsPriceResponse{" + "price=" + price + "\n" + "}";
    }

}
