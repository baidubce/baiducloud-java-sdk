package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMServicesRequest extends BaseBceRequest {

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

    public DescribeLLMServicesRequest setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeLLMServicesRequest setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public String getServiceName() {
        return serviceName;
    }

    public DescribeLLMServicesRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getServiceId() {
        return serviceId;
    }

    public DescribeLLMServicesRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public String getEnv() {
        return env;
    }

    public DescribeLLMServicesRequest setEnv(String env) {
        this.env = env;
        return this;
    }

    public Tag getTag() {
        return tag;
    }

    public DescribeLLMServicesRequest setTag(Tag tag) {
        this.tag = tag;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeLLMServicesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeLLMServicesRequest setOrder(String order) {
        this.order = order;
        return this;
    }

}
