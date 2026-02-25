
package com.baidubce.eip.models;



import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SharedDataPackageInquiryResponse extends BaseBceResponse  {
    /**
     * 共享流量包价格
     */
    private String price;

    public SharedDataPackageInquiryResponse setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "SharedDataPackageInquiryResponse{"
                + "price=" + price + "\n"
                + "}";
    }




}