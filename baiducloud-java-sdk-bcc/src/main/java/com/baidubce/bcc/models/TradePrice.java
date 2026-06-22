package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TradePrice {
    /**
     * 实例券折后预付价。
     */
    private Double prePayTradePrice;

    /**
     * 实例券折后后付价。
     */
    private Double postPayTradePrice;

    public TradePrice setPrePayTradePrice(Double prePayTradePrice) {
        this.prePayTradePrice = prePayTradePrice;
        return this;
    }

    public Double getPrePayTradePrice() {
        return this.prePayTradePrice;
    }

    public TradePrice setPostPayTradePrice(Double postPayTradePrice) {
        this.postPayTradePrice = postPayTradePrice;
        return this;
    }

    public Double getPostPayTradePrice() {
        return this.postPayTradePrice;
    }

    @Override
    public String toString() {
        return "TradePrice{" + "prePayTradePrice=" + prePayTradePrice + "\n" + "postPayTradePrice=" + postPayTradePrice + "\n" + "}";
    }

}