package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertMetricValue {
    /**
     * 指标名称
     */
    private String name;

    /**
     * 指标显示名，根据locale自动切换中英文
     */
    private String label;

    /**
     * 指标值
     */
    private Float value;

    /**
     * 指标单位
     */
    private String unit;

    public AlertMetricValue setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AlertMetricValue setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return this.label;
    }

    public AlertMetricValue setValue(Float value) {
        this.value = value;
        return this;
    }

    public Float getValue() {
        return this.value;
    }

    public AlertMetricValue setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getUnit() {
        return this.unit;
    }

    @Override
    public String toString() {
        return "AlertMetricValue{" + "name=" + name + "\n" + "label=" + label + "\n" + "value=" + value + "\n" + "unit=" + unit + "\n" + "}";
    }

}