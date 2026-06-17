package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpecPrices {
    /**
     * 实例规格
     */
    private String spec;

    /**
     * 目录价
     */
    private String specPrice;

    /**
     * 折扣
     */
    private String discount;

    /**
     * 优惠后价格
     */
    private String tradePrice;

    /**
     * 状态
     */
    private String status;

    public SpecPrices setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getSpec() {
        return this.spec;
    }

    public SpecPrices setSpecPrice(String specPrice) {
        this.specPrice = specPrice;
        return this;
    }

    public String getSpecPrice() {
        return this.specPrice;
    }

    public SpecPrices setDiscount(String discount) {
        this.discount = discount;
        return this;
    }

    public String getDiscount() {
        return this.discount;
    }

    public SpecPrices setTradePrice(String tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }

    public String getTradePrice() {
        return this.tradePrice;
    }

    public SpecPrices setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "SpecPrices{" + "spec=" + spec + "\n" + "specPrice=" + specPrice + "\n" + "discount=" + discount + "\n" + "tradePrice=" + tradePrice + "\n" + "status=" + status
                + "\n" + "}";
    }

}