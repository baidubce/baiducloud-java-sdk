package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeDimensionValuesRequest extends BaseBceRequest {

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 云产品类型，如BCE_BCC
    */
    private String scope;

    /**
    * 云产品资源类型，如Instance
    */
    private String resourceType;

    /**
    * 地域
    */
    private String region;

    /**
    * 开始时间，UTC时间，如 2024-10-11T10:10:10Z
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间，如 2024-10-11T10:10:10Z
    */
    private String endDatetime;

    /**
    * 指标名
    */
    private String metricName;

    /**
    * 维度名，要查询的维度key
    */
    private String dimensionKey;

    /**
    * 过滤项列表，填入已选的指标维度值，用于级联查询
    */
    private List<Filter> filters;

    public String getAction() {
        return action;
    }

    public DescribeDimensionValuesRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public DescribeDimensionValuesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public DescribeDimensionValuesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public DescribeDimensionValuesRequest setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeDimensionValuesRequest setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeDimensionValuesRequest setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public String getMetricName() {
        return metricName;
    }

    public DescribeDimensionValuesRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    public String getDimensionKey() {
        return dimensionKey;
    }

    public DescribeDimensionValuesRequest setDimensionKey(String dimensionKey) {
        this.dimensionKey = dimensionKey;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeDimensionValuesRequest setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

}
