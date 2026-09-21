package com.baidubce.dbsc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendResultBase {
    /**
     * 时间列表
     */
    private List<String> category;

    /**
     * 各个指标的数据列表
     */
    private List<TrendResultSeries> series;

    public TrendResultBase setCategory(List<String> category) {
        this.category = category;
        return this;
    }

    public List<String> getCategory() {
        return this.category;
    }

    public TrendResultBase setSeries(List<TrendResultSeries> series) {
        this.series = series;
        return this;
    }

    public List<TrendResultSeries> getSeries() {
        return this.series;
    }

    @Override
    public String toString() {
        return "TrendResultBase{" + "category=" + category + "\n" + "series=" + series + "\n" + "}";
    }

}