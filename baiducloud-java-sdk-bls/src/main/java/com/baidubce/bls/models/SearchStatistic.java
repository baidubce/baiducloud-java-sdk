package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchStatistic {
    /**
     * 直方图统计单个区间大小，统计区间的毫秒数
     */
    private Integer interval;

    /**
     * 直方图统计的开始时间，是请求中的startDateTime
     */
    private String startTime;

    /**
     * 直方图统计的结束时间，是请求中的endDateTime
     */
    private String endTime;

    /**
     * 直方图统计区间的数据条数，直方图按区间大小，顺序分割排列，各个时间区间的日志数量
     */
    private List<Bucket> histogram;

    public SearchStatistic setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    public Integer getInterval() {
        return this.interval;
    }

    public SearchStatistic setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public SearchStatistic setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public SearchStatistic setHistogram(List<Bucket> histogram) {
        this.histogram = histogram;
        return this;
    }

    public List<Bucket> getHistogram() {
        return this.histogram;
    }

    @Override
    public String toString() {
        return "SearchStatistic{" + "interval=" + interval + "\n" + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n" + "histogram=" + histogram + "\n" + "}";
    }

}