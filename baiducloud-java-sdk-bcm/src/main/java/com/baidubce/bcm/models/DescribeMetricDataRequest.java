package com.baidubce.bcm.models;

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
    * 云产品类型，如BCE_BCC
    */
    private String scope;

    /**
    * 云产品资源类型，如Instance。目前不参与查询条件，仅用于检查filters中必需包含resourceType对应的全部identifiers属性
    */
    private String resourceType;

    /**
    * 地域
    */
    private String region;

    /**
    * 开始时间，UTC时间，如 2024-10-11T10:10:10Z
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间，如 2024-10-11T10:25:10Z
    */
    private String endDatetime;

    /**
    * 指标名
    */
    private String metricName;

    /**
    * 维度过滤项列表，必须包含该资源类型下所有的Resource.Identifiers维度
    */
    private List<Filter> filters;

    /**
    * 若查询命中多条曲线，则最多返回limit条曲线，默认值：10，最大值：100
    */
    private Integer limit;

    /**
    * 偏移量，用于翻页查询，默认值：0
    */
    private Integer offset;

    /**
    * 周期，单位：秒，默认值：根据查询时间范围自适应
    */
    private Integer periodSeconds;

    /**
    * 统计方式（时间轴聚合方式），默认值：["avg"]，可选值：avg / sum / max / min / count
    */
    private List<String> aggregationOverTime;

    public String getAction() {
        return action;
    }

    public DescribeMetricDataRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public DescribeMetricDataRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public DescribeMetricDataRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public DescribeMetricDataRequest setRegion(String region) {
        this.region = region;
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

    public String getMetricName() {
        return metricName;
    }

    public DescribeMetricDataRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeMetricDataRequest setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public DescribeMetricDataRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getOffset() {
        return offset;
    }

    public DescribeMetricDataRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public DescribeMetricDataRequest setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    public List<String> getAggregationOverTime() {
        return aggregationOverTime;
    }

    public DescribeMetricDataRequest setAggregationOverTime(List<String> aggregationOverTime) {
        this.aggregationOverTime = aggregationOverTime;
        return this;
    }

}
