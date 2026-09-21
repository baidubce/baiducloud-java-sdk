package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPriceUsingPOSTResponse extends BaseBceResponse {

    /**
    * catalogPrice
    */
    private Double catalogPrice;

    /**
    * discount
    */
    private Double discount;

    /**
    * discountType
    */
    private String discountType;

    /**
    * price
    */
    private Double price;

    /**
    * priceDetails
    */
    private List<VdbPricingQueryResponse> priceDetails;

    /**
    * realCatalogPrice
    */
    private Double realCatalogPrice;

    public Double getCatalogPrice() {
        return catalogPrice;
    }

    public GetPriceUsingPOSTResponse setCatalogPrice(Double catalogPrice) {
        this.catalogPrice = catalogPrice;
        return this;
    }

    public Double getDiscount() {
        return discount;
    }

    public GetPriceUsingPOSTResponse setDiscount(Double discount) {
        this.discount = discount;
        return this;
    }

    public String getDiscountType() {
        return discountType;
    }

    public GetPriceUsingPOSTResponse setDiscountType(String discountType) {
        this.discountType = discountType;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public GetPriceUsingPOSTResponse setPrice(Double price) {
        this.price = price;
        return this;
    }

    public List<VdbPricingQueryResponse> getPriceDetails() {
        return priceDetails;
    }

    public GetPriceUsingPOSTResponse setPriceDetails(List<VdbPricingQueryResponse> priceDetails) {
        this.priceDetails = priceDetails;
        return this;
    }

    public Double getRealCatalogPrice() {
        return realCatalogPrice;
    }

    public GetPriceUsingPOSTResponse setRealCatalogPrice(Double realCatalogPrice) {
        this.realCatalogPrice = realCatalogPrice;
        return this;
    }

    @Override
    public String toString() {
        return "GetPriceUsingPOSTResponse{" + "catalogPrice=" + catalogPrice + "\n" + "discount=" + discount + "\n" + "discountType=" + discountType + "\n" + "price=" + price
                + "\n" + "priceDetails=" + priceDetails + "\n" + "realCatalogPrice=" + realCatalogPrice + "\n" + "}";
    }

}
