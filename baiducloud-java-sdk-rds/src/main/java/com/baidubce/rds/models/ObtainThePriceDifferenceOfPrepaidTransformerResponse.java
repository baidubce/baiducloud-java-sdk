package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObtainThePriceDifferenceOfPrepaidTransformerResponse extends BaseBceResponse {

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
    * 折扣率，如 100 表示无折扣。
    */
    private Integer discountRate;

    public Object getPrice() {
        return price;
    }

    public ObtainThePriceDifferenceOfPrepaidTransformerResponse setPrice(Object price) {
        this.price = price;
        return this;
    }

    public Object getCatalogPrice() {
        return catalogPrice;
    }

    public ObtainThePriceDifferenceOfPrepaidTransformerResponse setCatalogPrice(Object catalogPrice) {
        this.catalogPrice = catalogPrice;
        return this;
    }

    public Object getTrafficInGB() {
        return trafficInGB;
    }

    public ObtainThePriceDifferenceOfPrepaidTransformerResponse setTrafficInGB(Object trafficInGB) {
        this.trafficInGB = trafficInGB;
        return this;
    }

    public Object getDiscount() {
        return discount;
    }

    public ObtainThePriceDifferenceOfPrepaidTransformerResponse setDiscount(Object discount) {
        this.discount = discount;
        return this;
    }

    public Object getRealCatalogPrice() {
        return realCatalogPrice;
    }

    public ObtainThePriceDifferenceOfPrepaidTransformerResponse setRealCatalogPrice(Object realCatalogPrice) {
        this.realCatalogPrice = realCatalogPrice;
        return this;
    }

    public Object getBackupInGB() {
        return backupInGB;
    }

    public ObtainThePriceDifferenceOfPrepaidTransformerResponse setBackupInGB(Object backupInGB) {
        this.backupInGB = backupInGB;
        return this;
    }

    public Integer getDiscountRate() {
        return discountRate;
    }

    public ObtainThePriceDifferenceOfPrepaidTransformerResponse setDiscountRate(Integer discountRate) {
        this.discountRate = discountRate;
        return this;
    }

    @Override
    public String toString() {
        return "ObtainThePriceDifferenceOfPrepaidTransformerResponse{" + "price=" + price + "\n" + "catalogPrice=" + catalogPrice + "\n" + "trafficInGB=" + trafficInGB + "\n"
                + "discount=" + discount + "\n" + "realCatalogPrice=" + realCatalogPrice + "\n" + "backupInGB=" + backupInGB + "\n" + "discountRate=" + discountRate + "\n" + "}";
    }

}
