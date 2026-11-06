package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenapiSlowlog {
    /**
     * 慢日志ID
     */
    private String slowlogId;

    /**
     * 慢日志大小
     */
    private Long slowlogSizeInBytes;

    /**
     * 慢日志开始时间
     */
    private String slowlogStartTime;

    /**
     * 慢日志结束时间
     */
    private String slowlogEndTime;

    public OpenapiSlowlog setSlowlogId(String slowlogId) {
        this.slowlogId = slowlogId;
        return this;
    }

    public String getSlowlogId() {
        return this.slowlogId;
    }

    public OpenapiSlowlog setSlowlogSizeInBytes(Long slowlogSizeInBytes) {
        this.slowlogSizeInBytes = slowlogSizeInBytes;
        return this;
    }

    public Long getSlowlogSizeInBytes() {
        return this.slowlogSizeInBytes;
    }

    public OpenapiSlowlog setSlowlogStartTime(String slowlogStartTime) {
        this.slowlogStartTime = slowlogStartTime;
        return this;
    }

    public String getSlowlogStartTime() {
        return this.slowlogStartTime;
    }

    public OpenapiSlowlog setSlowlogEndTime(String slowlogEndTime) {
        this.slowlogEndTime = slowlogEndTime;
        return this;
    }

    public String getSlowlogEndTime() {
        return this.slowlogEndTime;
    }

    @Override
    public String toString() {
        return "OpenapiSlowlog{" + "slowlogId=" + slowlogId + "\n" + "slowlogSizeInBytes=" + slowlogSizeInBytes + "\n" + "slowlogStartTime=" + slowlogStartTime + "\n"
                + "slowlogEndTime=" + slowlogEndTime + "\n" + "}";
    }

}