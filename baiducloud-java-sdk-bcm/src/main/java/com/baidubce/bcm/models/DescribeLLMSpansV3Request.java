package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMSpansV3Request extends BaseBceRequest {

    /**
    * 开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间
    */
    private String endDatetime;

    /**
    * 是否填充gen_ai.input和gen_ai.output字段，默认false
    */
    private Boolean parseLLMInputOutput;

    /**
    * 过滤项列表。支持的过滤字段：service(应用名称)、host(实例名称)、duration(响应时间，单位us)、traceId(TraceID)、statusCode(Span状态码)、hasException(是否存在异常)、exception.type(异常类型)、attributes.apm.operation(接口)、
    * attributes.apm.component(请求类型)、attributes.gen_ai.kind(span类型)、attributes.gen_ai.response.model(模型名称)
    */
    private List<Filter> filters;

    /**
    * 排序字段，默认值：startTime，可选项：startTime(开始时间)
    */
    private String orderBy;

    /**
    * 排序方向，可选值：asc(升序)、desc(降序)
    */
    private String order;

    /**
    * 翻页游标。请求第一页时填空，请求后续页时使用上一页返回的nextMarker值
    */
    private String marker;

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeLLMSpansV3Request setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeLLMSpansV3Request setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public Boolean getParseLLMInputOutput() {
        return parseLLMInputOutput;
    }

    public DescribeLLMSpansV3Request setParseLLMInputOutput(Boolean parseLLMInputOutput) {
        this.parseLLMInputOutput = parseLLMInputOutput;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeLLMSpansV3Request setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeLLMSpansV3Request setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeLLMSpansV3Request setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeLLMSpansV3Request setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
