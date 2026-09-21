package com.baidubce.vdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VdbPricingQueryResponse {
    /**
     * 
     */
    private Double catalogPrice;

    /**
     * 
     */
    private String componentType;

    /**
     * 
     */
    private Double discount;

    /**
     * 
     */
    private String discountType;

    /**
     * multiYearResult
     */
    private MultiYearResult multiYearResult;

    /**
     * 
     */
    private Double originDiscount;

    /**
     * 
     */
    private Double originPrice;

    /**
     * 
     */
    private Double price;

    /**
     * 
     */
    private Long priceId;

    /**
     * 
     */
    private String priceName;

    /**
     * 
     */
    private String priceType;

    /**
     * 
     */
    private Double realCatalogPrice;

    public VdbPricingQueryResponse setCatalogPrice(Double catalogPrice) {
        this.catalogPrice = catalogPrice;
        return this;
    }

    public Double getCatalogPrice() {
        return this.catalogPrice;
    }

    public VdbPricingQueryResponse setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }

    public String getComponentType() {
        return this.componentType;
    }

    public VdbPricingQueryResponse setDiscount(Double discount) {
        this.discount = discount;
        return this;
    }

    public Double getDiscount() {
        return this.discount;
    }

    public VdbPricingQueryResponse setDiscountType(String discountType) {
        this.discountType = discountType;
        return this;
    }

    public String getDiscountType() {
        return this.discountType;
    }

    public VdbPricingQueryResponse setMultiYearResult(MultiYearResult multiYearResult) {
        this.multiYearResult = multiYearResult;
        return this;
    }

    public MultiYearResult getMultiYearResult() {
        return this.multiYearResult;
    }

    public VdbPricingQueryResponse setOriginDiscount(Double originDiscount) {
        this.originDiscount = originDiscount;
        return this;
    }

    public Double getOriginDiscount() {
        return this.originDiscount;
    }

    public VdbPricingQueryResponse setOriginPrice(Double originPrice) {
        this.originPrice = originPrice;
        return this;
    }

    public Double getOriginPrice() {
        return this.originPrice;
    }

    public VdbPricingQueryResponse setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Double getPrice() {
        return this.price;
    }

    public VdbPricingQueryResponse setPriceId(Long priceId) {
        this.priceId = priceId;
        return this;
    }

    public Long getPriceId() {
        return this.priceId;
    }

    public VdbPricingQueryResponse setPriceName(String priceName) {
        this.priceName = priceName;
        return this;
    }

    public String getPriceName() {
        return this.priceName;
    }

    public VdbPricingQueryResponse setPriceType(String priceType) {
        this.priceType = priceType;
        return this;
    }

    public String getPriceType() {
        return this.priceType;
    }

    public VdbPricingQueryResponse setRealCatalogPrice(Double realCatalogPrice) {
        this.realCatalogPrice = realCatalogPrice;
        return this;
    }

    public Double getRealCatalogPrice() {
        return this.realCatalogPrice;
    }

    @Override
    public String toString() {
        return "VdbPricingQueryResponse{" + "catalogPrice=" + catalogPrice + "\n" + "componentType=" + componentType + "\n" + "discount=" + discount + "\n" + "discountType="
                + discountType + "\n" + "multiYearResult=" + multiYearResult + "\n" + "originDiscount=" + originDiscount + "\n" + "originPrice=" + originPrice + "\n" + "price="
                + price + "\n" + "priceId=" + priceId + "\n" + "priceName=" + priceName + "\n" + "priceType=" + priceType + "\n" + "realCatalogPrice=" + realCatalogPrice + "\n"
                + "}";
    }

}