package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeServicesMetricsRequest extends BaseBceRequest {

    /**
    * 开始时间，格式为ISO 8601
    */
    private String beginDatetime;

    /**
    * 结束时间，格式为ISO 8601
    */
    private String endDatetime;

    /**
    * 应用名列表，第一阶段查询返回的全量服务中每页需要展示的服务
    */
    private List<String> services;

    /**
    * 返回的应用指标列表，若未设置，默认返回[requests, requestsPerSecond, errors, errorRate,
    * durationSeconds]。可选项：requests、requestsPerSecond、errors、errorRate、durationSeconds、abSuccessRate、abErrorRate、abRequests、abDurationSeconds、llmErrorRate、llmTokens
    */
    private List<String> metrics;

    /**
    * 指标过滤条件
    */
    private List<MetricFilter> metricFilters;

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeServicesMetricsRequest setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeServicesMetricsRequest setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public List<String> getServices() {
        return services;
    }

    public DescribeServicesMetricsRequest setServices(List<String> services) {
        this.services = services;
        return this;
    }

    public List<String> getMetrics() {
        return metrics;
    }

    public DescribeServicesMetricsRequest setMetrics(List<String> metrics) {
        this.metrics = metrics;
        return this;
    }

    public List<MetricFilter> getMetricFilters() {
        return metricFilters;
    }

    public DescribeServicesMetricsRequest setMetricFilters(List<MetricFilter> metricFilters) {
        this.metricFilters = metricFilters;
        return this;
    }

}
