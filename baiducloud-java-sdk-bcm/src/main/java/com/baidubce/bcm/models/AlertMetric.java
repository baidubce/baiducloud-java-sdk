package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertMetric {
    /**
     * metric
     */
    private AlertMetricValue metric;

    /**
     * rule
     */
    private AlertMetricRule rule;

    public AlertMetric setMetric(AlertMetricValue metric) {
        this.metric = metric;
        return this;
    }

    public AlertMetricValue getMetric() {
        return this.metric;
    }

    public AlertMetric setRule(AlertMetricRule rule) {
        this.rule = rule;
        return this;
    }

    public AlertMetricRule getRule() {
        return this.rule;
    }

    @Override
    public String toString() {
        return "AlertMetric{" + "metric=" + metric + "\n" + "rule=" + rule + "\n" + "}";
    }

}