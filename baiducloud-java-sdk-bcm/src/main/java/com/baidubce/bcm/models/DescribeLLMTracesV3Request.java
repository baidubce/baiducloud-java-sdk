package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMTracesV3Request extends BaseBceRequest {

    /**
    * 开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间
    */
    private String endDatetime;

    /**
    * 过滤项列表。支持的过滤字段：service(应用名称)、traceId(TraceID)、sessionId(会话ID)、userId(用户ID)、duration(响应时间，单位ms)、inputTokens(输入token数)、outputTokens(输出token数)、totalTokens(总token数)
    */
    private List<Filter> filters;

    /**
    * 排序字段，默认值：startTime，可选项：startTime(开始时间)、duration(持续时间)、totalTokens(总token数)
    */
    private String orderBy;

    /**
    * 排序方向，可选值：asc(升序)、desc(降序)
    */
    private String order;

    /**
    * 第几页，从1开始计数
    */
    private Integer pageNo;

    /**
    * 每页展示数量，最大值：100
    */
    private Integer pageSize;

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeLLMTracesV3Request setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeLLMTracesV3Request setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeLLMTracesV3Request setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeLLMTracesV3Request setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeLLMTracesV3Request setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeLLMTracesV3Request setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeLLMTracesV3Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
