package com.baidubce.apm.models;

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
    * 开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间
    */
    private String endDatetime;

    /**
    * 维度名
    */
    private String dimensionKey;

    /**
    * 过滤项列表
    */
    private List<Filter> filters;

    public String getAction() {
        return action;
    }

    public DescribeDimensionValuesRequest setAction(String action) {
        this.action = action;
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
