package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeSpanFieldValuesRequest extends BaseBceRequest {

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
    * 属性名称。可选项：service（应用名称）、host（实例名称）、duration（响应时间，单位us）、traceId（TraceID）、attributes.apm.operation（接口）、attributes.apm.component（请求类型）
    */
    private String key;

    /**
    * 过滤项列表，仅支持以下过滤项：service（应用名称）
    */
    private List<Filter> filters;

    public String getAction() {
        return action;
    }

    public DescribeSpanFieldValuesRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeSpanFieldValuesRequest setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeSpanFieldValuesRequest setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public String getKey() {
        return key;
    }

    public DescribeSpanFieldValuesRequest setKey(String key) {
        this.key = key;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeSpanFieldValuesRequest setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

}
