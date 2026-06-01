package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeSpansRequest extends BaseBceRequest {

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
    * 过滤项列表。支持的过滤字段：service（应用名称）、name（span名称）、kind（span类型）、host（实例名称）、duration（响应时间，单位us）、traceId（TraceID）、statusCode（Span状态码）、hasException（是否存在异常）、exception.type（异常类型）、
    * attributes.apm.operation（接口）、attributes.apm.component（请求类型）、slowRequest（慢调用）、slowDBRequest（慢SQL）、attributes.${key}（自定义span属性值）、env（所属环境）
    */
    private List<Filter> filters;

    /**
    * 排序字段，默认值：startTime
    */
    private String orderBy;

    /**
    * 排序方式，可选值：asc、desc
    */
    private String order;

    /**
    * 翻页游标。请求第一页时填空，请求后续页时使用上一页返回的nextMarker值
    */
    private String marker;

    public String getAction() {
        return action;
    }

    public DescribeSpansRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeSpansRequest setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeSpansRequest setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeSpansRequest setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeSpansRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeSpansRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeSpansRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
