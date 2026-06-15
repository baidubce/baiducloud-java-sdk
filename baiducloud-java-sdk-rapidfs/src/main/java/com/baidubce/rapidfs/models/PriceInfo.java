package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PriceInfo {
    /**
     * 货币单位，枚举值：* CNY：人民币，默认；* USD：美元
     */
    private String currency;

    /**
     * 价格
     */
    private Double unitPrice;

    /**
     * 付费类型，当前为 PostPaid，后付费
     */
    private String chargeType;

    /**
     * 计价单元，后付费模式使用，枚举值：* Hour：每小时计费；* GiB_Hour：每 GiB 每小时计费，Master 托管部署模式时存在容量费用
     */
    private String chargeUnit;

    public PriceInfo setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getCurrency() {
        return this.currency;
    }

    public PriceInfo setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public PriceInfo setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public PriceInfo setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
        return this;
    }

    public String getChargeUnit() {
        return this.chargeUnit;
    }

    @Override
    public String toString() {
        return "PriceInfo{" + "currency=" + currency + "\n" + "unitPrice=" + unitPrice + "\n" + "chargeType=" + chargeType + "\n" + "chargeUnit=" + chargeUnit + "\n" + "}";
    }

}