package com.baidubce.apm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisableTime {
    /**
     * 开始时间，格式：HH:mm:ss
     */
    private String from;

    /**
     * 结束时间，格式：HH:mm:ss
     */
    private String to;

    public DisableTime setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public DisableTime setTo(String to) {
        this.to = to;
        return this;
    }

    public String getTo() {
        return this.to;
    }

    @Override
    public String toString() {
        return "DisableTime{" + "from=" + from + "\n" + "to=" + to + "\n" + "}";
    }

}