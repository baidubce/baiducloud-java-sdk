package com.baidubce.oos.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParallelismControl {
    /**
     * 并行比例，取值 [0,1]
     */
    private Double ratio;

    /**
     * 并行个数；ratio 与 count 不能同时设置
     */
    private Integer count;

    public ParallelismControl setRatio(Double ratio) {
        this.ratio = ratio;
        return this;
    }

    public Double getRatio() {
        return this.ratio;
    }

    public ParallelismControl setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "ParallelismControl{" + "ratio=" + ratio + "\n" + "count=" + count + "\n" + "}";
    }

}