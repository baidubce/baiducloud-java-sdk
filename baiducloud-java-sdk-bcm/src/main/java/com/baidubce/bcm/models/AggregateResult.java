package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AggregateResult {
    /**
     * 求和值
     */
    private Float sum;

    /**
     * 求和后计算的每秒平均值
     */
    private Float sumPerSecond;

    public AggregateResult setSum(Float sum) {
        this.sum = sum;
        return this;
    }

    public Float getSum() {
        return this.sum;
    }

    public AggregateResult setSumPerSecond(Float sumPerSecond) {
        this.sumPerSecond = sumPerSecond;
        return this;
    }

    public Float getSumPerSecond() {
        return this.sumPerSecond;
    }

    @Override
    public String toString() {
        return "AggregateResult{" + "sum=" + sum + "\n" + "sumPerSecond=" + sumPerSecond + "\n" + "}";
    }

}