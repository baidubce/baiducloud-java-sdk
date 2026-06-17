package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpecIdPrices {
    /**
     * 规格族ID（查询实例套餐价格接口返回）
     */
    private String specId;

    /**
     * 规格价格列表（查询实例套餐价格接口返回）
     */
    private List<SpecPrices> specPrices;

    public SpecIdPrices setSpecId(String specId) {
        this.specId = specId;
        return this;
    }

    public String getSpecId() {
        return this.specId;
    }

    public SpecIdPrices setSpecPrices(List<SpecPrices> specPrices) {
        this.specPrices = specPrices;
        return this;
    }

    public List<SpecPrices> getSpecPrices() {
        return this.specPrices;
    }

    @Override
    public String toString() {
        return "SpecIdPrices{" + "specId=" + specId + "\n" + "specPrices=" + specPrices + "\n" + "}";
    }

}