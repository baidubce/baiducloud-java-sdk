package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmCondition {
    /**
     * 指标名称
     */
    private String metricName;

    /**
     * 指标维度筛选条件
     */
    private List<MetricDimension> metricDimensions;

    /**
     * 
     */
    private String operator;

    /**
     * 报警阈值
     */
    private Float threshold;

    /**
     * 聚合方式，可选值：MAX / MIN / SUM / AVG
     */
    private String aggregateType;

    /**
     * 聚合窗口时间，单位：秒，取值范围：大于0
     */
    private Integer windowSeconds;

    /**
     * 回显单位
     */
    private String displayUnit;

    /**
     * 回显阈值
     */
    private String displayThreshold;

    public AlarmCondition setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    public String getMetricName() {
        return this.metricName;
    }

    public AlarmCondition setMetricDimensions(List<MetricDimension> metricDimensions) {
        this.metricDimensions = metricDimensions;
        return this;
    }

    public List<MetricDimension> getMetricDimensions() {
        return this.metricDimensions;
    }

    public AlarmCondition setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public String getOperator() {
        return this.operator;
    }

    public AlarmCondition setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }

    public Float getThreshold() {
        return this.threshold;
    }

    public AlarmCondition setAggregateType(String aggregateType) {
        this.aggregateType = aggregateType;
        return this;
    }

    public String getAggregateType() {
        return this.aggregateType;
    }

    public AlarmCondition setWindowSeconds(Integer windowSeconds) {
        this.windowSeconds = windowSeconds;
        return this;
    }

    public Integer getWindowSeconds() {
        return this.windowSeconds;
    }

    public AlarmCondition setDisplayUnit(String displayUnit) {
        this.displayUnit = displayUnit;
        return this;
    }

    public String getDisplayUnit() {
        return this.displayUnit;
    }

    public AlarmCondition setDisplayThreshold(String displayThreshold) {
        this.displayThreshold = displayThreshold;
        return this;
    }

    public String getDisplayThreshold() {
        return this.displayThreshold;
    }

    @Override
    public String toString() {
        return "AlarmCondition{" + "metricName=" + metricName + "\n" + "metricDimensions=" + metricDimensions + "\n" + "operator=" + operator + "\n" + "threshold=" + threshold
                + "\n" + "aggregateType=" + aggregateType + "\n" + "windowSeconds=" + windowSeconds + "\n" + "displayUnit=" + displayUnit + "\n" + "displayThreshold="
                + displayThreshold + "\n" + "}";
    }

}