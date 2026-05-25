package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricQuery {
    /**
     * 指标名
     */
    private String name;

    /**
     * 同比数据，可选项：`yesterday` - 昨日同比，`lastweek` - 上周同比，`YYYY-mm-dd` - 指定日期同比，`5m`/`1h` - 周期环比
     */
    private List<String> compareTo;

    /**
     * 该指标的特殊过滤条件，会与全局过滤项合并
     */
    private List<Filter> filters;

    public MetricQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public MetricQuery setCompareTo(List<String> compareTo) {
        this.compareTo = compareTo;
        return this;
    }

    public List<String> getCompareTo() {
        return this.compareTo;
    }

    public MetricQuery setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public List<Filter> getFilters() {
        return this.filters;
    }

    @Override
    public String toString() {
        return "MetricQuery{" + "name=" + name + "\n" + "compareTo=" + compareTo + "\n" + "filters=" + filters + "\n" + "}";
    }

}