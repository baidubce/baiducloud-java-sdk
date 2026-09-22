package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPriceForCreateInstanceResponse extends BaseBceResponse {

    /**
    * 实例价格。包年包月计费单位为元/月，按量付费计费单位为元/分钟。<br>如果设置了timeUnit,则是以timeUnit为单位的价格。
    */
    private Float price;

    /**
    * 目录价。单位同price一致。
    */
    private Float catalogPrice;

    public Float getPrice() {
        return price;
    }

    public GetPriceForCreateInstanceResponse setPrice(Float price) {
        this.price = price;
        return this;
    }

    public Float getCatalogPrice() {
        return catalogPrice;
    }

    public GetPriceForCreateInstanceResponse setCatalogPrice(Float catalogPrice) {
        this.catalogPrice = catalogPrice;
        return this;
    }

    @Override
    public String toString() {
        return "GetPriceForCreateInstanceResponse{" + "price=" + price + "\n" + "catalogPrice=" + catalogPrice + "\n" + "}";
    }

}
