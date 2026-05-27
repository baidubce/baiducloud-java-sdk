package com.baidubce.csn.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryCsnBpPriceResponse extends BaseBceResponse {

    /**
    * 价格 1.预付费为对应带宽和购买时长所需的价格 2.后付费按流量为1G流量的价格 3.后付费日峰值带宽和95计费为对应请求中带宽的价格
    */
    private String price;

    public String getPrice() {
        return price;
    }

    public QueryCsnBpPriceResponse setPrice(String price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "QueryCsnBpPriceResponse{" + "price=" + price + "\n" + "}";
    }

}
