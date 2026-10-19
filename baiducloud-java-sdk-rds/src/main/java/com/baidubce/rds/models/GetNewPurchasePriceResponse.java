package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetNewPurchasePriceResponse extends BaseBceResponse {

    /**
    * price
    */
    private Object price;

    /**
    * catalogPrice
    */
    private Object catalogPrice;

    /**
    * trafficInGB
    */
    private Object trafficInGB;

    /**
    * discount
    */
    private Object discount;

    /**
    * realCatalogPrice
    */
    private Object realCatalogPrice;

    /**
    * backupInGB
    */
    private Object backupInGB;

    /**
    * discountRate
    */
    private Object discountRate;

    public Object getPrice() {
        return price;
    }

    public GetNewPurchasePriceResponse setPrice(Object price) {
        this.price = price;
        return this;
    }

    public Object getCatalogPrice() {
        return catalogPrice;
    }

    public GetNewPurchasePriceResponse setCatalogPrice(Object catalogPrice) {
        this.catalogPrice = catalogPrice;
        return this;
    }

    public Object getTrafficInGB() {
        return trafficInGB;
    }

    public GetNewPurchasePriceResponse setTrafficInGB(Object trafficInGB) {
        this.trafficInGB = trafficInGB;
        return this;
    }

    public Object getDiscount() {
        return discount;
    }

    public GetNewPurchasePriceResponse setDiscount(Object discount) {
        this.discount = discount;
        return this;
    }

    public Object getRealCatalogPrice() {
        return realCatalogPrice;
    }

    public GetNewPurchasePriceResponse setRealCatalogPrice(Object realCatalogPrice) {
        this.realCatalogPrice = realCatalogPrice;
        return this;
    }

    public Object getBackupInGB() {
        return backupInGB;
    }

    public GetNewPurchasePriceResponse setBackupInGB(Object backupInGB) {
        this.backupInGB = backupInGB;
        return this;
    }

    public Object getDiscountRate() {
        return discountRate;
    }

    public GetNewPurchasePriceResponse setDiscountRate(Object discountRate) {
        this.discountRate = discountRate;
        return this;
    }

    @Override
    public String toString() {
        return "GetNewPurchasePriceResponse{" + "price=" + price + "\n" + "catalogPrice=" + catalogPrice + "\n" + "trafficInGB=" + trafficInGB + "\n" + "discount=" + discount
                + "\n" + "realCatalogPrice=" + realCatalogPrice + "\n" + "backupInGB=" + backupInGB + "\n" + "discountRate=" + discountRate + "\n" + "}";
    }

}
