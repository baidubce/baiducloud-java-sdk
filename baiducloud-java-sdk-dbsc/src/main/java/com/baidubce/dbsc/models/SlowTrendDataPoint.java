package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlowTrendDataPoint {
    /**
     * 时间点的慢查询数量
     */
    private Long value;

    /**
     * 时间点，UTC格式时间戳
     */
    private String timestamp;

    public SlowTrendDataPoint setValue(Long value) {
        this.value = value;
        return this;
    }

    public Long getValue() {
        return this.value;
    }

    public SlowTrendDataPoint setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    @Override
    public String toString() {
        return "SlowTrendDataPoint{" + "value=" + value + "\n" + "timestamp=" + timestamp + "\n" + "}";
    }

}