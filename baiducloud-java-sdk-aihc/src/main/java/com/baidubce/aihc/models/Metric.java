package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Metric {
    /**
     * 时间戳（Unix Timestamp），单位为毫秒
     */
    private String time;

    /**
     * 监控数据的值。
     */
    private Integer value;

    public Metric setTime(String time) {
        this.time = time;
        return this;
    }

    public String getTime() {
        return this.time;
    }

    public Metric setValue(Integer value) {
        this.value = value;
        return this;
    }

    public Integer getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Metric{" + "time=" + time + "\n" + "value=" + value + "\n" + "}";
    }

}