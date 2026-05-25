package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeTraceV3Request extends BaseBceRequest {

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 链路中任一span的时间戳。该字段与beginDatetime/endDatetime必填其一，若填写了spanDatetime，将忽略begin/endDatetime
    */
    private String spanDatetime;

    /**
    * 开始时间，UTC时间。与spanDatetime必填其一
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间。与spanDatetime必填其一
    */
    private String endDatetime;

    /**
    * TraceID
    */
    private String traceId;

    /**
    * 过滤项列表
    */
    private List<Filter> filters;

    /**
    * 是否返回span在瀑布图中的高度，默认值：false
    */
    private Boolean returnHeight;

    public String getAction() {
        return action;
    }

    public DescribeTraceV3Request setAction(String action) {
        this.action = action;
        return this;
    }

    public String getSpanDatetime() {
        return spanDatetime;
    }

    public DescribeTraceV3Request setSpanDatetime(String spanDatetime) {
        this.spanDatetime = spanDatetime;
        return this;
    }

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeTraceV3Request setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeTraceV3Request setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public String getTraceId() {
        return traceId;
    }

    public DescribeTraceV3Request setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeTraceV3Request setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public Boolean getReturnHeight() {
        return returnHeight;
    }

    public DescribeTraceV3Request setReturnHeight(Boolean returnHeight) {
        this.returnHeight = returnHeight;
        return this;
    }

}
