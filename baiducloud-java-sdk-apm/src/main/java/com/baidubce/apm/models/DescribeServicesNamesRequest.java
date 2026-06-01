package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeServicesNamesRequest extends BaseBceRequest {

    /**
    * 开始时间，格式为ISO 8601
    */
    private String beginDatetime;

    /**
    * 结束时间，格式为ISO 8601
    */
    private String endDatetime;

    /**
    * 按应用名过滤，若未设置，返回所有应用
    */
    private String serviceName;

    /**
    * 按应用ID过滤
    */
    private String serviceId;

    /**
    * 按语言过滤，若未设置，返回所有语言
    */
    private String language;

    /**
    * 按env过滤，若未设置，返回所有env的应用
    */
    private String env;

    /**
    * 按应用来源过滤，可选项：APP_BUILDER（千帆AppBuilder）
    */
    private String source;

    /**
    * tag
    */
    private Tag tag;

    /**
    * 排序字段，可选项：requests、requestsPerSecond、errors、errorRate、durationSeconds、abSuccessRate、abErrorRate、abRequests、abDurationSeconds、llmErrorRate、llmTokens
    */
    private String orderBy;

    /**
    * 排序方式，可选项：desc、asc
    */
    private String order;

    /**
    * 指标过滤条件
    */
    private List<MetricFilter> metricFilters;

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeServicesNamesRequest setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeServicesNamesRequest setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public String getServiceName() {
        return serviceName;
    }

    public DescribeServicesNamesRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getServiceId() {
        return serviceId;
    }

    public DescribeServicesNamesRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public DescribeServicesNamesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getEnv() {
        return env;
    }

    public DescribeServicesNamesRequest setEnv(String env) {
        this.env = env;
        return this;
    }

    public String getSource() {
        return source;
    }

    public DescribeServicesNamesRequest setSource(String source) {
        this.source = source;
        return this;
    }

    public Tag getTag() {
        return tag;
    }

    public DescribeServicesNamesRequest setTag(Tag tag) {
        this.tag = tag;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeServicesNamesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeServicesNamesRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public List<MetricFilter> getMetricFilters() {
        return metricFilters;
    }

    public DescribeServicesNamesRequest setMetricFilters(List<MetricFilter> metricFilters) {
        this.metricFilters = metricFilters;
        return this;
    }

}
