package com.baidubce.apm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorageConfig {
    /**
     * 链路数据保存时长，单位：天
     */
    private Integer traceRetentionDays;

    /**
     * 指标数据保存时长，单位：天
     */
    private Integer metricRetentionDays;

    /**
     * trace表数据保存时长，单位：天
     */
    private Integer dorisRetentionDays;

    public StorageConfig setTraceRetentionDays(Integer traceRetentionDays) {
        this.traceRetentionDays = traceRetentionDays;
        return this;
    }

    public Integer getTraceRetentionDays() {
        return this.traceRetentionDays;
    }

    public StorageConfig setMetricRetentionDays(Integer metricRetentionDays) {
        this.metricRetentionDays = metricRetentionDays;
        return this;
    }

    public Integer getMetricRetentionDays() {
        return this.metricRetentionDays;
    }

    public StorageConfig setDorisRetentionDays(Integer dorisRetentionDays) {
        this.dorisRetentionDays = dorisRetentionDays;
        return this;
    }

    public Integer getDorisRetentionDays() {
        return this.dorisRetentionDays;
    }

    @Override
    public String toString() {
        return "StorageConfig{" + "traceRetentionDays=" + traceRetentionDays + "\n" + "metricRetentionDays=" + metricRetentionDays + "\n" + "dorisRetentionDays="
                + dorisRetentionDays + "\n" + "}";
    }

}