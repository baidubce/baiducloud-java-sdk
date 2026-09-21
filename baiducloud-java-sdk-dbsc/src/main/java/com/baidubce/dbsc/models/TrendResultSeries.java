package com.baidubce.dbsc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendResultSeries {
    /**
     * 指标名称，如 totalSize、storageSize 等
     */
    private String name;

    /**
     * 各个时间点的指标数据列表
     */
    private List<Object> data;

    public TrendResultSeries setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TrendResultSeries setData(List<Object> data) {
        this.data = data;
        return this;
    }

    public List<Object> getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return "TrendResultSeries{" + "name=" + name + "\n" + "data=" + data + "\n" + "}";
    }

}