package com.baidubce.scs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MaintainTime {
    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 持续时间
     */
    private Integer duration;

    /**
     * 时间周期。0代表周日，1-6分别代表周一到周六。
     */
    private List<String> period;

    public MaintainTime setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public MaintainTime setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public MaintainTime setPeriod(List<String> period) {
        this.period = period;
        return this;
    }

    public List<String> getPeriod() {
        return this.period;
    }

    @Override
    public String toString() {
        return "MaintainTime{" + "startTime=" + startTime + "\n" + "duration=" + duration + "\n" + "period=" + period + "\n" + "}";
    }

}