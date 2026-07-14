package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EipGroupBandwidth {
    /**
     * 最大限制
     */
    private Integer max;

    /**
     * 最小限制
     */
    private Integer min;

    /**
     * 标准值
     */
    private Integer standard;

    public EipGroupBandwidth setMax(Integer max) {
        this.max = max;
        return this;
    }

    public Integer getMax() {
        return this.max;
    }

    public EipGroupBandwidth setMin(Integer min) {
        this.min = min;
        return this;
    }

    public Integer getMin() {
        return this.min;
    }

    public EipGroupBandwidth setStandard(Integer standard) {
        this.standard = standard;
        return this;
    }

    public Integer getStandard() {
        return this.standard;
    }

    @Override
    public String toString() {
        return "EipGroupBandwidth{" + "max=" + max + "\n" + "min=" + min + "\n" + "standard=" + standard + "\n" + "}";
    }

}