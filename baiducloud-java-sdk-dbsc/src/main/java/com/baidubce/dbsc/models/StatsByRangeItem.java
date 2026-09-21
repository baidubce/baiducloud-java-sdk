package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatsByRangeItem {
    /**
     * 时间段起始值（毫秒）
     */
    private Integer start;

    /**
     * 时间段结束值（毫秒）
     */
    private Integer end;

    /**
     * 时间段描述，如"1000-10000ms"
     */
    private String title;

    /**
     * 该时间段内的慢查询数量
     */
    private Integer count;

    public StatsByRangeItem setStart(Integer start) {
        this.start = start;
        return this;
    }

    public Integer getStart() {
        return this.start;
    }

    public StatsByRangeItem setEnd(Integer end) {
        this.end = end;
        return this;
    }

    public Integer getEnd() {
        return this.end;
    }

    public StatsByRangeItem setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public StatsByRangeItem setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "StatsByRangeItem{" + "start=" + start + "\n" + "end=" + end + "\n" + "title=" + title + "\n" + "count=" + count + "\n" + "}";
    }

}