package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeMetricDataRequest extends BaseBceRequest {

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 指标名列表
    */
    private List<MetricQuery> metrics;

    /**
    * 指标名
    */
    private String metricsName;

    /**
    * 同比数据，不填写表示不查询同比数据。可选值：5m（周期环比，支持m和h）、yesterday（昨日同比）、lastweek（上周同比）、YYYY-mm-dd（指定日期同比，UTC时间）
    */
    private List<String> metricsCompareTo;

    /**
    * 该指标的特殊过滤条件，会与全局过滤项列表进行合并
    */
    private List<Filter> metricsFilters;

    /**
    * 开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间
    */
    private String endDatetime;

    /**
    * 过滤项列表，所有指标共享
    */
    private List<Filter> filters;

    /**
    * GroupBy列表
    */
    private List<String> groupBy;

    /**
    * 排序字段
    */
    private String orderBy;

    /**
    * 排序方式，可选值：asc、desc
    */
    private String order;

    /**
    * 返回数量限制，若未设置，后端服务将返回尽可能多的数据
    */
    private Integer limit;

    /**
    * 聚合周期，单位：秒。每periodSeconds秒计算一个聚合点。若为0或未设置，表示从起止时间只计算一个聚合点。默认值：0
    */
    private Integer periodSeconds;

    /**
    * 当dimensions为空时，是否保留对应的时间序列。默认值：false
    */
    private Boolean reserveEmptyDimensions;

    public String getAction() {
        return action;
    }

    public DescribeMetricDataRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public List<MetricQuery> getMetrics() {
        return metrics;
    }

    public DescribeMetricDataRequest setMetrics(List<MetricQuery> metrics) {
        this.metrics = metrics;
        return this;
    }

    public String getMetricsName() {
        return metricsName;
    }

    public DescribeMetricDataRequest setMetricsName(String metricsName) {
        this.metricsName = metricsName;
        return this;
    }

    public List<String> getMetricsCompareTo() {
        return metricsCompareTo;
    }

    public DescribeMetricDataRequest setMetricsCompareTo(List<String> metricsCompareTo) {
        this.metricsCompareTo = metricsCompareTo;
        return this;
    }

    public List<Filter> getMetricsFilters() {
        return metricsFilters;
    }

    public DescribeMetricDataRequest setMetricsFilters(List<Filter> metricsFilters) {
        this.metricsFilters = metricsFilters;
        return this;
    }

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeMetricDataRequest setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeMetricDataRequest setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeMetricDataRequest setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public List<String> getGroupBy() {
        return groupBy;
    }

    public DescribeMetricDataRequest setGroupBy(List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeMetricDataRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeMetricDataRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public DescribeMetricDataRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public DescribeMetricDataRequest setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    public Boolean getReserveEmptyDimensions() {
        return reserveEmptyDimensions;
    }

    public DescribeMetricDataRequest setReserveEmptyDimensions(Boolean reserveEmptyDimensions) {
        this.reserveEmptyDimensions = reserveEmptyDimensions;
        return this;
    }

}
