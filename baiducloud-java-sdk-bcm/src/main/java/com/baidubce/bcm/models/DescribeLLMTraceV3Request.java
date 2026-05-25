package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMTraceV3Request extends BaseBceRequest {

    /**
    * 开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间
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

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeLLMTraceV3Request setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeLLMTraceV3Request setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public String getTraceId() {
        return traceId;
    }

    public DescribeLLMTraceV3Request setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeLLMTraceV3Request setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public Boolean getReturnHeight() {
        return returnHeight;
    }

    public DescribeLLMTraceV3Request setReturnHeight(Boolean returnHeight) {
        this.returnHeight = returnHeight;
        return this;
    }

}
