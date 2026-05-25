package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMDimensionValuesV3Request extends BaseBceRequest {

    /**
    * 开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间
    */
    private String endDatetime;

    /**
    * 属性名称，可选项：service(应用名称)、host(实例名称)、duration(响应时间，单位us)、traceId(TraceID)、attributes.apm.operation(接口)、attributes.apm.component(请求类型)、attributes.gen_ai.kind(span类型)、
    * attributes.gen_ai.response.model(模型名称)
    */
    private String key;

    /**
    * 过滤项列表，仅支持service(应用名称)过滤
    */
    private List<Filter> filters;

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeLLMDimensionValuesV3Request setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeLLMDimensionValuesV3Request setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public String getKey() {
        return key;
    }

    public DescribeLLMDimensionValuesV3Request setKey(String key) {
        this.key = key;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeLLMDimensionValuesV3Request setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

}
