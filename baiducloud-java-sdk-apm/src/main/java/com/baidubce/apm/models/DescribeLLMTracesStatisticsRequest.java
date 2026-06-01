package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMTracesStatisticsRequest extends BaseBceRequest {

    /**
    * 开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间
    */
    private String endDatetime;

    /**
    * 过滤项列表。支持的过滤字段：sessionId(会话ID)、userId(用户ID)、duration(响应时间，单位ms)、inputTokens(输入token数)、outputTokens(输出token数)、totalTokens(总token数)
    */
    private List<Filter> filters;

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeLLMTracesStatisticsRequest setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeLLMTracesStatisticsRequest setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeLLMTracesStatisticsRequest setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

}
