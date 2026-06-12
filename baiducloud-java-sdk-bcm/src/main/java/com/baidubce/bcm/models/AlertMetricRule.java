package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertMetricRule {
    /**
     * 规则指标名
     */
    private String metricName;

    /**
     * 规则比较符
     */
    private String operator;

    /**
     * 规则比较阈值
     */
    private Float threshold;

    /**
     * 规则窗口聚合方式
     */
    private String statistics;

    /**
     * 规则窗口大小，单位：秒
     */
    private Integer window;

    public AlertMetricRule setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    public String getMetricName() {
        return this.metricName;
    }

    public AlertMetricRule setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public String getOperator() {
        return this.operator;
    }

    public AlertMetricRule setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }

    public Float getThreshold() {
        return this.threshold;
    }

    public AlertMetricRule setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }

    public String getStatistics() {
        return this.statistics;
    }

    public AlertMetricRule setWindow(Integer window) {
        this.window = window;
        return this;
    }

    public Integer getWindow() {
        return this.window;
    }

    @Override
    public String toString() {
        return "AlertMetricRule{" + "metricName=" + metricName + "\n" + "operator=" + operator + "\n" + "threshold=" + threshold + "\n" + "statistics=" + statistics + "\n"
                + "window=" + window + "\n" + "}";
    }

}