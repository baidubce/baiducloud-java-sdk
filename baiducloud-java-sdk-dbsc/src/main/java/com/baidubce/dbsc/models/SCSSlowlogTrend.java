package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SCSSlowlogTrend {
    /**
     * 慢日志数量
     */
    private Integer value;

    /**
     * 时间点
     */
    private String timestamp;

    public SCSSlowlogTrend setValue(Integer value) {
        this.value = value;
        return this;
    }

    public Integer getValue() {
        return this.value;
    }

    public SCSSlowlogTrend setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    @Override
    public String toString() {
        return "SCSSlowlogTrend{" + "value=" + value + "\n" + "timestamp=" + timestamp + "\n" + "}";
    }

}