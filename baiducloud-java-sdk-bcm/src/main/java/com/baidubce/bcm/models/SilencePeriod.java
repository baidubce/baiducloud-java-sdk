package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SilencePeriod {
    /**
     * 静默开始时间，24小时制，格式：HH:mm:ss
     */
    private String from;

    /**
     * 静默结束时间，24小时制，格式：HH:mm:ss
     */
    private String to;

    public SilencePeriod setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public SilencePeriod setTo(String to) {
        this.to = to;
        return this;
    }

    public String getTo() {
        return this.to;
    }

    @Override
    public String toString() {
        return "SilencePeriod{" + "from=" + from + "\n" + "to=" + to + "\n" + "}";
    }

}