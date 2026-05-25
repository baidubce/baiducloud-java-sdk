package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Timeseries {
    /**
     * 指标名
     */
    private String metric;

    /**
     * 维度列表，对应请求中的groupBy字段
     */
    private List<Dimension> dimensions;

    /**
     * 指标值序列，每个元素为 [时间戳（秒）, 指标值]
     */
    private List<List<Float>> data;

    /**
     * 同比数据，每组同比为三元组列表 [时间戳, 值, 同比率]
     */
    private List<List<List<Float>>> compareTo;

    public Timeseries setMetric(String metric) {
        this.metric = metric;
        return this;
    }

    public String getMetric() {
        return this.metric;
    }

    public Timeseries setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public List<Dimension> getDimensions() {
        return this.dimensions;
    }

    public Timeseries setData(List<List<Float>> data) {
        this.data = data;
        return this;
    }

    public List<List<Float>> getData() {
        return this.data;
    }

    public Timeseries setCompareTo(List<List<List<Float>>> compareTo) {
        this.compareTo = compareTo;
        return this;
    }

    public List<List<List<Float>>> getCompareTo() {
        return this.compareTo;
    }

    @Override
    public String toString() {
        return "Timeseries{" + "metric=" + metric + "\n" + "dimensions=" + dimensions + "\n" + "data=" + data + "\n" + "compareTo=" + compareTo + "\n" + "}";
    }

}