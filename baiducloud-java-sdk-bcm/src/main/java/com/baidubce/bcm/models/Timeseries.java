package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Timeseries {
    /**
     * 指标名
     */
    private String metricName;

    /**
     * 维度列表，对应请求中的filters字段
     */
    private List<Dimension> dimensions;

    /**
     * 指标数据点列表
     */
    private List<DataPoint> dataPoints;

    public Timeseries setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    public String getMetricName() {
        return this.metricName;
    }

    public Timeseries setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public List<Dimension> getDimensions() {
        return this.dimensions;
    }

    public Timeseries setDataPoints(List<DataPoint> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }

    public List<DataPoint> getDataPoints() {
        return this.dataPoints;
    }

    @Override
    public String toString() {
        return "Timeseries{" + "metricName=" + metricName + "\n" + "dimensions=" + dimensions + "\n" + "dataPoints=" + dataPoints + "\n" + "}";
    }

}