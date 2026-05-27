package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryCsnBpPriceRequest extends BaseBceRequest {

    /**
    * 带宽包的名称，不能为空
    */
    private String name;

    /**
    * 带宽包的带宽值，后付费按流量不需要该值。
    */
    private Integer bandwidth;

    /**
    * 网络实例所属的区域。取值 [ China、Asia-Pacific ]，分别表示中国大陆、亚太区域
    */
    private String geographicA;

    /**
    * 另一个网络实例所属的区域。取值 [ China、Asia-Pacific ]，分别表示中国大陆、亚太区域
    */
    private String geographicB;

    /**
    * billing
    */
    private Billing billing;

    public String getName() {
        return name;
    }

    public QueryCsnBpPriceRequest setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public QueryCsnBpPriceRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public String getGeographicA() {
        return geographicA;
    }

    public QueryCsnBpPriceRequest setGeographicA(String geographicA) {
        this.geographicA = geographicA;
        return this;
    }

    public String getGeographicB() {
        return geographicB;
    }

    public QueryCsnBpPriceRequest setGeographicB(String geographicB) {
        this.geographicB = geographicB;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public QueryCsnBpPriceRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

}
