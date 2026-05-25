package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMMetricDataV3Request extends BaseBceRequest {

    /**
    * 开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间
    */
    private String endDatetime;

    /**
    * 指标查询列表，每项包含name(指标名，必填)和compareTo(同比数据，选填，可选值：yesterday/lastweek/指定日期)
    */
    private List<MetricQuery> metrics;

    /**
    * 过滤项列表
    */
    private List<Filter> filters;

    /**
    * GroupBy维度列表
    */
    private List<String> groupBy;

    /**
    * 排序字段
    */
    private String orderBy;

    /**
    * 排序方向，可选值：asc(升序)、desc(降序)
    */
    private String order;

    /**
    * 返回数量限制，若未设置则返回尽可能多的数据
    */
    private Integer limit;

    /**
    * 按时间聚合周期（秒），默认值0。若为0或未设置，表示从起止时间只计算一个聚合点
    */
    private Integer periodSeconds;

    /**
    * 返回聚合值，可选项：sum(求和)、sumPerSecond(求和后计算每秒平均值)
    */
    private List<String> aggregate;

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeLLMMetricDataV3Request setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeLLMMetricDataV3Request setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public List<MetricQuery> getMetrics() {
        return metrics;
    }

    public DescribeLLMMetricDataV3Request setMetrics(List<MetricQuery> metrics) {
        this.metrics = metrics;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeLLMMetricDataV3Request setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public List<String> getGroupBy() {
        return groupBy;
    }

    public DescribeLLMMetricDataV3Request setGroupBy(List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeLLMMetricDataV3Request setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeLLMMetricDataV3Request setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public DescribeLLMMetricDataV3Request setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public DescribeLLMMetricDataV3Request setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    public List<String> getAggregate() {
        return aggregate;
    }

    public DescribeLLMMetricDataV3Request setAggregate(List<String> aggregate) {
        this.aggregate = aggregate;
        return this;
    }

}
