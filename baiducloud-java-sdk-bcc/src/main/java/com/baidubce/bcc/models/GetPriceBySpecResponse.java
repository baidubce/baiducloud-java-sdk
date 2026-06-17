package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPriceBySpecResponse extends BaseBceResponse {

    /**
    * 实例套餐规格对应价格信息
    */
    private List<SpecIdPrices> price;

    public List<SpecIdPrices> getPrice() {
        return price;
    }

    public GetPriceBySpecResponse setPrice(List<SpecIdPrices> price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "GetPriceBySpecResponse{" + "price=" + price + "\n" + "}";
    }

}
