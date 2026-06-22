package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatagoryPrice {
    /**
     * 实例券预付目录价格。
     */
    private Double prePayCategoryPrice;

    /**
     * 实例券后付价，根据入参 priceTimeUnit 返回按小时计价格或按月计价格。
     */
    private Double postPayCategoryPrice;

    public CatagoryPrice setPrePayCategoryPrice(Double prePayCategoryPrice) {
        this.prePayCategoryPrice = prePayCategoryPrice;
        return this;
    }

    public Double getPrePayCategoryPrice() {
        return this.prePayCategoryPrice;
    }

    public CatagoryPrice setPostPayCategoryPrice(Double postPayCategoryPrice) {
        this.postPayCategoryPrice = postPayCategoryPrice;
        return this;
    }

    public Double getPostPayCategoryPrice() {
        return this.postPayCategoryPrice;
    }

    @Override
    public String toString() {
        return "CatagoryPrice{" + "prePayCategoryPrice=" + prePayCategoryPrice + "\n" + "postPayCategoryPrice=" + postPayCategoryPrice + "\n" + "}";
    }

}