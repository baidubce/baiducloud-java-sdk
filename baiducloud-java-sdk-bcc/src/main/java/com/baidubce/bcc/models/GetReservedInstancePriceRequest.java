package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetReservedInstancePriceRequest extends BaseBceRequest {

    /**
    * 实例规格族
    */
    private String specId;

    /**
    * 实例套餐规格
    */
    private String spec;

    /**
    * 付费方式，可选值：FullyPrepay：全预付；半预付：PartPrepay；0预付：NoPrepay。
    */
    private String offeringType;

    /**
    * 实例券的可用范围；默认：AZ可用区级券：AZ地域级券：Region
    */
    private String scope;

    /**
    * 可用区名称
    */
    private String zoneName;

    /**
    * 查询在指定实例套餐规格下，任意数量实例的总价格，必须为大于0的整数，可选参数，缺省为1
    */
    private Integer reservedInstanceCount;

    /**
    * 后付费计价时间单位，可选值： month：按月计费； hour：按小时计费，缺省值。
    */
    private String priceTimeUnit;

    /**
    * 实例券购买时长，[1,2,3,4,5,6,7,8,9,12,24,36]，单位：月。
    */
    private Integer reservedInstanceTime;

    /**
    * 预留实例券购买数量
    */
    private Integer purchaseNum;

    public String getSpecId() {
        return specId;
    }

    public GetReservedInstancePriceRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public GetReservedInstancePriceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getOfferingType() {
        return offeringType;
    }

    public GetReservedInstancePriceRequest setOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public GetReservedInstancePriceRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public GetReservedInstancePriceRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public Integer getReservedInstanceCount() {
        return reservedInstanceCount;
    }

    public GetReservedInstancePriceRequest setReservedInstanceCount(Integer reservedInstanceCount) {
        this.reservedInstanceCount = reservedInstanceCount;
        return this;
    }

    public String getPriceTimeUnit() {
        return priceTimeUnit;
    }

    public GetReservedInstancePriceRequest setPriceTimeUnit(String priceTimeUnit) {
        this.priceTimeUnit = priceTimeUnit;
        return this;
    }

    public Integer getReservedInstanceTime() {
        return reservedInstanceTime;
    }

    public GetReservedInstancePriceRequest setReservedInstanceTime(Integer reservedInstanceTime) {
        this.reservedInstanceTime = reservedInstanceTime;
        return this;
    }

    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    public GetReservedInstancePriceRequest setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
        return this;
    }

}
