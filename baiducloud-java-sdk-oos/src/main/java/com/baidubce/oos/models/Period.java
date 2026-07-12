package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Period {
    /**
     * 频率
     */
    private String frequency;

    /**
     * 周几
     */
    private List<Integer> daysOfWeek;

    /**
     * 几号
     */
    private List<Integer> dates;

    /**
     * 是否每月最后一天
     */
    private Boolean lastDateOfMonth;

    /**
     * 小时（0-23）
     */
    private Integer hour;

    /**
     * 分钟（0-59）
     */
    private Integer minute;

    public Period setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    public String getFrequency() {
        return this.frequency;
    }

    public Period setDaysOfWeek(List<Integer> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }

    public List<Integer> getDaysOfWeek() {
        return this.daysOfWeek;
    }

    public Period setDates(List<Integer> dates) {
        this.dates = dates;
        return this;
    }

    public List<Integer> getDates() {
        return this.dates;
    }

    public Period setLastDateOfMonth(Boolean lastDateOfMonth) {
        this.lastDateOfMonth = lastDateOfMonth;
        return this;
    }

    public Boolean getLastDateOfMonth() {
        return this.lastDateOfMonth;
    }

    public Period setHour(Integer hour) {
        this.hour = hour;
        return this;
    }

    public Integer getHour() {
        return this.hour;
    }

    public Period setMinute(Integer minute) {
        this.minute = minute;
        return this;
    }

    public Integer getMinute() {
        return this.minute;
    }

    @Override
    public String toString() {
        return "Period{" + "frequency=" + frequency + "\n" + "daysOfWeek=" + daysOfWeek + "\n" + "dates=" + dates + "\n" + "lastDateOfMonth=" + lastDateOfMonth + "\n" + "hour="
                + hour + "\n" + "minute=" + minute + "\n" + "}";
    }

}