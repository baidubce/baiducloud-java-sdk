package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SCSSlowlogStatsDuartion {
    /**
     * 耗时起点 单位ms
     */
    private Long start;

    /**
     * 耗时终点 单位ms
     */
    private Long end;

    /**
     * 耗时区间 例如 (10，20] ms
     */
    private String title;

    /**
     * 分布在当前耗时区间的数量
     */
    private Long count;

    public SCSSlowlogStatsDuartion setStart(Long start) {
        this.start = start;
        return this;
    }

    public Long getStart() {
        return this.start;
    }

    public SCSSlowlogStatsDuartion setEnd(Long end) {
        this.end = end;
        return this;
    }

    public Long getEnd() {
        return this.end;
    }

    public SCSSlowlogStatsDuartion setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public SCSSlowlogStatsDuartion setCount(Long count) {
        this.count = count;
        return this;
    }

    public Long getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "SCSSlowlogStatsDuartion{" + "start=" + start + "\n" + "end=" + end + "\n" + "title=" + title + "\n" + "count=" + count + "\n" + "}";
    }

}