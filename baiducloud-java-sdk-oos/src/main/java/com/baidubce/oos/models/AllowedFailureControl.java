package com.baidubce.oos.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllowedFailureControl {
    /**
     * 允许失败比例，取值 [0,1]
     */
    private Double ratio;

    /**
     * 允许失败个数；ratio 与 count 不能同时设置
     */
    private Integer count;

    public AllowedFailureControl setRatio(Double ratio) {
        this.ratio = ratio;
        return this;
    }

    public Double getRatio() {
        return this.ratio;
    }

    public AllowedFailureControl setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "AllowedFailureControl{" + "ratio=" + ratio + "\n" + "count=" + count + "\n" + "}";
    }

}