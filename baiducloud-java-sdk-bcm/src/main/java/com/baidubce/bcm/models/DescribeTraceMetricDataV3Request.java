package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeTraceMetricDataV3Request extends BaseBceRequest {

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间
    */
    private String endDatetime;

    /**
    * 指标名列表。可选指标：apm_requests_count（请求数）、apm_error_requests_count（错误数）、apm_requests_seconds_avg（平均请求耗时）、apm_requests_seconds_p90（90分位耗时）、apm_requests_seconds_p95（95分位耗时）、
    * apm_requests_seconds_p99（99分位耗时）
    */
    private List<TraceMetricQuery> metrics;

    /**
    * 指标名
    */
    private String metricsName;

    /**
    * 过滤项列表
    */
    private List<Filter> filters;

    /**
    * GroupBy列表。可选项：attributes.http.response.status_code（http响应code）
    */
    private List<String> groupBy;

    /**
    * 按时间聚合周期，单位：秒。每periodSeconds秒计算一个聚合点。若为0或未设置，表示从起止时间只计算一个聚合点。默认值：0
    */
    private Integer periodSeconds;

    /**
    * 返回聚合值。可选项：sum（求和）、sumPerSecond（求和后计算每秒平均值）
    */
    private List<String> aggregate;

    public String getAction() {
        return action;
    }

    public DescribeTraceMetricDataV3Request setAction(String action) {
        this.action = action;
        return this;
    }

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeTraceMetricDataV3Request setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeTraceMetricDataV3Request setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public List<TraceMetricQuery> getMetrics() {
        return metrics;
    }

    public DescribeTraceMetricDataV3Request setMetrics(List<TraceMetricQuery> metrics) {
        this.metrics = metrics;
        return this;
    }

    public String getMetricsName() {
        return metricsName;
    }

    public DescribeTraceMetricDataV3Request setMetricsName(String metricsName) {
        this.metricsName = metricsName;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeTraceMetricDataV3Request setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public List<String> getGroupBy() {
        return groupBy;
    }

    public DescribeTraceMetricDataV3Request setGroupBy(List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public DescribeTraceMetricDataV3Request setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    public List<String> getAggregate() {
        return aggregate;
    }

    public DescribeTraceMetricDataV3Request setAggregate(List<String> aggregate) {
        this.aggregate = aggregate;
        return this;
    }

}
