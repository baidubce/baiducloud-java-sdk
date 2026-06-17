package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Schedule {
    /**
     * 固定间隔，单位：分钟，取值范围[1, 1440]
     */
    private Integer intervalMinute;

    /**
     * 指定时刻，一天中的第几分钟，取值范围[0, 1440)
     */
    private Integer fixTimeMinute;

    /**
     * 固定时间频率; 0: 每天 1~7 一周的某天
     */
    private Integer dayOfWeek;

    public Schedule setIntervalMinute(Integer intervalMinute) {
        this.intervalMinute = intervalMinute;
        return this;
    }

    public Integer getIntervalMinute() {
        return this.intervalMinute;
    }

    public Schedule setFixTimeMinute(Integer fixTimeMinute) {
        this.fixTimeMinute = fixTimeMinute;
        return this;
    }

    public Integer getFixTimeMinute() {
        return this.fixTimeMinute;
    }

    public Schedule setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public Integer getDayOfWeek() {
        return this.dayOfWeek;
    }

    @Override
    public String toString() {
        return "Schedule{" + "intervalMinute=" + intervalMinute + "\n" + "fixTimeMinute=" + fixTimeMinute + "\n" + "dayOfWeek=" + dayOfWeek + "\n" + "}";
    }

}