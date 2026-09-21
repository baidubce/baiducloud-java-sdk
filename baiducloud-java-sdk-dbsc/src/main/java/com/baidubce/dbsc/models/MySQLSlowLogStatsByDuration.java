package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MySQLSlowLogStatsByDuration {
    /**
     * 区间起始时间，单位毫秒
     */
    private Integer start;

    /**
     * 区间结束时间，单位毫秒
     */
    private Integer end;

    /**
     * 区间名称
     */
    private String title;

    /**
     * 该区间慢查询数量
     */
    private Integer count;

    public MySQLSlowLogStatsByDuration setStart(Integer start) {
        this.start = start;
        return this;
    }

    public Integer getStart() {
        return this.start;
    }

    public MySQLSlowLogStatsByDuration setEnd(Integer end) {
        this.end = end;
        return this;
    }

    public Integer getEnd() {
        return this.end;
    }

    public MySQLSlowLogStatsByDuration setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public MySQLSlowLogStatsByDuration setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "MySQLSlowLogStatsByDuration{" + "start=" + start + "\n" + "end=" + end + "\n" + "title=" + title + "\n" + "count=" + count + "\n" + "}";
    }

}