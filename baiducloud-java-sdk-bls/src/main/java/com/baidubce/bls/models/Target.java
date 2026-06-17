package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Target {
    /**
     * 执行语句
     */
    private String query;

    /**
     * 查询开始时间偏移量，取值范围: [-1440, 0)
     */
    private Integer startTimeOffsetMinute;

    /**
     * 查询结束时间偏移量，取值范围: (startTimeOffsetMinute, 0]
     */
    private Integer endTimeOffsetMinute;

    /**
     * blsObject
     */
    @JsonProperty("object")
    private LogStore blsObject;

    public Target setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getQuery() {
        return this.query;
    }

    public Target setStartTimeOffsetMinute(Integer startTimeOffsetMinute) {
        this.startTimeOffsetMinute = startTimeOffsetMinute;
        return this;
    }

    public Integer getStartTimeOffsetMinute() {
        return this.startTimeOffsetMinute;
    }

    public Target setEndTimeOffsetMinute(Integer endTimeOffsetMinute) {
        this.endTimeOffsetMinute = endTimeOffsetMinute;
        return this;
    }

    public Integer getEndTimeOffsetMinute() {
        return this.endTimeOffsetMinute;
    }

    public Target setObject(LogStore blsObject) {
        this.blsObject = blsObject;
        return this;
    }

    public LogStore getObject() {
        return this.blsObject;
    }

    @Override
    public String toString() {
        return "Target{" + "query=" + query + "\n" + "startTimeOffsetMinute=" + startTimeOffsetMinute + "\n" + "endTimeOffsetMinute=" + endTimeOffsetMinute + "\n" + "blsObject="
                + blsObject + "\n" + "}";
    }

}