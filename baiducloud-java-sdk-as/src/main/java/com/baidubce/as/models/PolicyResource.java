package com.baidubce.as.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PolicyResource {
    /**
     * 实例维度
     */
    private List<Dimension> identifiers;

    /**
     * 指标维度
     */
    private List<Dimension> metricDimensions;

    public PolicyResource setIdentifiers(List<Dimension> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public List<Dimension> getIdentifiers() {
        return this.identifiers;
    }

    public PolicyResource setMetricDimensions(List<Dimension> metricDimensions) {
        this.metricDimensions = metricDimensions;
        return this;
    }

    public List<Dimension> getMetricDimensions() {
        return this.metricDimensions;
    }

    @Override
    public String toString() {
        return "PolicyResource{" + "identifiers=" + identifiers + "\n" + "metricDimensions=" + metricDimensions + "\n" + "}";
    }

}