package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlbInquiryRequest extends BaseBceRequest {

    /**
    * blb类型，不传默认是普通型blb。 取值可以为"normal"代表普通型，"application"代表应用型，"ipv6"代表普通型IPv6，"ipv6Application"代表应用型IPv6
    */
    private String blbType;

    /**
    * 性能规格参数，不传默认为共享型。取值如下："small1"标准型1，"small2"标准型2，"medium1"增强型1，"medium2"增强型1，"large1"超大型1，"large2"超大型2，"large3"超大型3
    */
    private String performanceLevel;

    /**
    * 购买数量，不传默认是1
    */
    private Integer count;

    /**
    * billing
    */
    private Billing billing;

    public String getBlbType() {
        return blbType;
    }

    public BlbInquiryRequest setBlbType(String blbType) {
        this.blbType = blbType;
        return this;
    }

    public String getPerformanceLevel() {
        return performanceLevel;
    }

    public BlbInquiryRequest setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public BlbInquiryRequest setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public BlbInquiryRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

}
