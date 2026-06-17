package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetReservedInstancePriceResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * 实例券规格。
    */
    private String spec;

    /**
    * 实例券目录价格。
    */
    private Object categoryPrice;

    /**
    * 实例券最终价，即优惠后订单实付价格。
    */
    private Object tradePrice;

    public String getRequestId() {
        return requestId;
    }

    public GetReservedInstancePriceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public GetReservedInstancePriceResponse setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public Object getCategoryPrice() {
        return categoryPrice;
    }

    public GetReservedInstancePriceResponse setCategoryPrice(Object categoryPrice) {
        this.categoryPrice = categoryPrice;
        return this;
    }

    public Object getTradePrice() {
        return tradePrice;
    }

    public GetReservedInstancePriceResponse setTradePrice(Object tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }

    @Override
    public String toString() {
        return "GetReservedInstancePriceResponse{" + "requestId=" + requestId + "\n" + "spec=" + spec + "\n" + "categoryPrice=" + categoryPrice + "\n" + "tradePrice=" + tradePrice
                + "\n" + "}";
    }

}
