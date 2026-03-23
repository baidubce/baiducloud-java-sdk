package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Price {
    /**
     * 计费项，比如取值"instance"代表实例费用；比如"netraffic"代表流量费用
     */
    private String chargeItem;

    /**
     * 折扣价，单位都是元。预付费的时候，返回值比如："150"，后付费的时候，返回值比如："0.00028"
     */
    private String discountPrice;

    /**
     * 原价
     */
    private String originalPrice;

    /**
     * 计费单位。后付费的时候取值，比如"minute"。minute：表示计价单元是按每分钟来计算。GB：表示计价单元是按每GB来计算。 "lcu"代表按每lcu单位计费
     */
    private String chargeUnit;

    public Price setChargeItem(String chargeItem) {
        this.chargeItem = chargeItem;
        return this;
    }

    public String getChargeItem() {
        return this.chargeItem;
    }

    public Price setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }

    public String getDiscountPrice() {
        return this.discountPrice;
    }

    public Price setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }

    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public Price setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
        return this;
    }

    public String getChargeUnit() {
        return this.chargeUnit;
    }

    @Override
    public String toString() {
        return "Price{" + "chargeItem=" + chargeItem + "\n" + "discountPrice=" + discountPrice + "\n" + "originalPrice=" + originalPrice + "\n" + "chargeUnit=" + chargeUnit + "\n"
                + "}";
    }

}