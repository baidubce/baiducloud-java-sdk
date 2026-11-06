package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PgLogResponse {
    /**
     * 日志id。
     */
    private String pglogId;

    /**
     * 日志大小。
     */
    private Long pglogSizeInBytes;

    /**
     * 日志开始时间。
     */
    private String pglogStartTime;

    /**
     * 日志结束时间。
     */
    private String pglogEndTime;

    public PgLogResponse setPglogId(String pglogId) {
        this.pglogId = pglogId;
        return this;
    }

    public String getPglogId() {
        return this.pglogId;
    }

    public PgLogResponse setPglogSizeInBytes(Long pglogSizeInBytes) {
        this.pglogSizeInBytes = pglogSizeInBytes;
        return this;
    }

    public Long getPglogSizeInBytes() {
        return this.pglogSizeInBytes;
    }

    public PgLogResponse setPglogStartTime(String pglogStartTime) {
        this.pglogStartTime = pglogStartTime;
        return this;
    }

    public String getPglogStartTime() {
        return this.pglogStartTime;
    }

    public PgLogResponse setPglogEndTime(String pglogEndTime) {
        this.pglogEndTime = pglogEndTime;
        return this;
    }

    public String getPglogEndTime() {
        return this.pglogEndTime;
    }

    @Override
    public String toString() {
        return "PgLogResponse{" + "pglogId=" + pglogId + "\n" + "pglogSizeInBytes=" + pglogSizeInBytes + "\n" + "pglogStartTime=" + pglogStartTime + "\n" + "pglogEndTime="
                + pglogEndTime + "\n" + "}";
    }

}