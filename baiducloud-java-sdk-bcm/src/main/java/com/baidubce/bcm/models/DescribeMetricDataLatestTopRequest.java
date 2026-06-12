package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeMetricDataLatestTopRequest extends BaseBceRequest {

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 云产品类型，如BCE_BCC
    */
    private String scope;

    /**
    * 地域
    */
    private String region;

    /**
    * 结束时间，UTC时间，如 2024-10-11T10:25:10Z
    */
    private String endDatetime;

    /**
    * 指标名，只允许查询单指标的Top值
    */
    private String metricName;

    /**
    * 维度过滤项列表
    */
    private List<Filter> filters;

    /**
    * 若查询命中多条曲线，则最多返回limit条曲线，默认值：10，最大值：100
    */
    private Integer limit;

    /**
    * 排序方式，默认值：false（降序）
    */
    private Boolean asc;

    /**
    * 周期，单位：秒，默认值：60
    */
    private Integer periodSeconds;

    /**
    * 统计方式（时间轴聚合方式），默认值：avg，可选值：avg / sum / max / min
    */
    private String aggregationOverTime;

    public String getAction() {
        return action;
    }

    public DescribeMetricDataLatestTopRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public DescribeMetricDataLatestTopRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public DescribeMetricDataLatestTopRequest setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeMetricDataLatestTopRequest setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public String getMetricName() {
        return metricName;
    }

    public DescribeMetricDataLatestTopRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeMetricDataLatestTopRequest setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public DescribeMetricDataLatestTopRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Boolean getAsc() {
        return asc;
    }

    public DescribeMetricDataLatestTopRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }

    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public DescribeMetricDataLatestTopRequest setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    public String getAggregationOverTime() {
        return aggregationOverTime;
    }

    public DescribeMetricDataLatestTopRequest setAggregationOverTime(String aggregationOverTime) {
        this.aggregationOverTime = aggregationOverTime;
        return this;
    }

}
