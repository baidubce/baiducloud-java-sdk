package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMServicesV3Request extends BaseBceRequest {

    /**
    * 开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间
    */
    private String endDatetime;

    /**
    * 按应用名过滤，若未设置返回所有应用
    */
    private String serviceName;

    /**
    * 按应用ID过滤
    */
    private String serviceId;

    /**
    * 按env过滤
    */
    private String env;

    /**
    * tag
    */
    private Tag tag;

    /**
    * 排序字段，默认值：requests
    */
    private String orderBy;

    /**
    * 排序方向，默认值：desc，可选值：asc(升序)、desc(降序)
    */
    private String order;

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeLLMServicesV3Request setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeLLMServicesV3Request setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public String getServiceName() {
        return serviceName;
    }

    public DescribeLLMServicesV3Request setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getServiceId() {
        return serviceId;
    }

    public DescribeLLMServicesV3Request setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public String getEnv() {
        return env;
    }

    public DescribeLLMServicesV3Request setEnv(String env) {
        this.env = env;
        return this;
    }

    public Tag getTag() {
        return tag;
    }

    public DescribeLLMServicesV3Request setTag(Tag tag) {
        this.tag = tag;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeLLMServicesV3Request setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeLLMServicesV3Request setOrder(String order) {
        this.order = order;
        return this;
    }

}
