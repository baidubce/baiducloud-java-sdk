package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricValue {
    /**
     * 指标当前值
     */
    private Float value;

    /**
     * 日环比，1表示100%
     */
    private Float compareToYesterday;

    public MetricValue setValue(Float value) {
        this.value = value;
        return this;
    }

    public Float getValue() {
        return this.value;
    }

    public MetricValue setCompareToYesterday(Float compareToYesterday) {
        this.compareToYesterday = compareToYesterday;
        return this;
    }

    public Float getCompareToYesterday() {
        return this.compareToYesterday;
    }

    @Override
    public String toString() {
        return "MetricValue{" + "value=" + value + "\n" + "compareToYesterday=" + compareToYesterday + "\n" + "}";
    }

}