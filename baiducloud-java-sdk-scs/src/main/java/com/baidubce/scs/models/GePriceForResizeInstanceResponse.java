package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GePriceForResizeInstanceResponse extends BaseBceResponse {

    /**
    * 实例价格。预付费计费单位为元/月,后付费计费单位为元/分钟
    */
    private Float price;

    public Float getPrice() {
        return price;
    }

    public GePriceForResizeInstanceResponse setPrice(Float price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "GePriceForResizeInstanceResponse{" + "price=" + price + "\n" + "}";
    }

}
