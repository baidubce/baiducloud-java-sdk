package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Metric {
    /**
     * 指标名称，可作为指标数据查询接口的metricNames参数
     */
    private String name;

    /**
     * 指标显示名称，根据locale返回中文或英文名称
     */
    private String label;

    /**
     * 资源标识维度列表。查询指标数据时，过滤条件需要包含当前资源类型要求的全部资源标识维度
     */
    private List<String> resourceIdentifiers;

    /**
     * 除资源标识维度以外的指标维度列表，可用于进一步筛选时序数据
     */
    private List<String> metricDimensions;

    /**
     * 指标采集周期数值
     */
    private Double period;

    /**
     * 指标采集周期单位，例如s表示秒
     */
    private String periodUnit;

    /**
     * 指标值单位，根据locale返回中文或英文单位
     */
    private String unit;

    public Metric setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Metric setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return this.label;
    }

    public Metric setResourceIdentifiers(List<String> resourceIdentifiers) {
        this.resourceIdentifiers = resourceIdentifiers;
        return this;
    }

    public List<String> getResourceIdentifiers() {
        return this.resourceIdentifiers;
    }

    public Metric setMetricDimensions(List<String> metricDimensions) {
        this.metricDimensions = metricDimensions;
        return this;
    }

    public List<String> getMetricDimensions() {
        return this.metricDimensions;
    }

    public Metric setPeriod(Double period) {
        this.period = period;
        return this;
    }

    public Double getPeriod() {
        return this.period;
    }

    public Metric setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }

    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public Metric setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getUnit() {
        return this.unit;
    }

    @Override
    public String toString() {
        return "Metric{" + "name=" + name + "\n" + "label=" + label + "\n" + "resourceIdentifiers=" + resourceIdentifiers + "\n" + "metricDimensions=" + metricDimensions + "\n"
                + "period=" + period + "\n" + "periodUnit=" + periodUnit + "\n" + "unit=" + unit + "\n" + "}";
    }

}