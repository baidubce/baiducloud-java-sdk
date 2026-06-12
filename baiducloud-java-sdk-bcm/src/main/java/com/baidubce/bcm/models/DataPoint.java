package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataPoint {
    /**
     * 时间戳，单位：毫秒
     */
    private Long timestmap;

    /**
     * 若aggregationOverTime包含avg，返回平均值
     */
    private Float avg;

    /**
     * 若aggregationOverTime包含max，返回最大值
     */
    private Float max;

    /**
     * 若aggregationOverTime包含min，返回最小值
     */
    private Float min;

    /**
     * 若aggregationOverTime包含sum，返回和值
     */
    private Float sum;

    /**
     * 若aggregationOverTime包含count，返回数量
     */
    private Integer count;

    public DataPoint setTimestmap(Long timestmap) {
        this.timestmap = timestmap;
        return this;
    }

    public Long getTimestmap() {
        return this.timestmap;
    }

    public DataPoint setAvg(Float avg) {
        this.avg = avg;
        return this;
    }

    public Float getAvg() {
        return this.avg;
    }

    public DataPoint setMax(Float max) {
        this.max = max;
        return this;
    }

    public Float getMax() {
        return this.max;
    }

    public DataPoint setMin(Float min) {
        this.min = min;
        return this;
    }

    public Float getMin() {
        return this.min;
    }

    public DataPoint setSum(Float sum) {
        this.sum = sum;
        return this;
    }

    public Float getSum() {
        return this.sum;
    }

    public DataPoint setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "DataPoint{" + "timestmap=" + timestmap + "\n" + "avg=" + avg + "\n" + "max=" + max + "\n" + "min=" + min + "\n" + "sum=" + sum + "\n" + "count=" + count + "\n"
                + "}";
    }

}