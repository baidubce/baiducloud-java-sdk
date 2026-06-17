package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisableTime {
    /**
     * 报警屏蔽开始时间
     */
    private String from;

    /**
     * 报警屏蔽结束时间
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