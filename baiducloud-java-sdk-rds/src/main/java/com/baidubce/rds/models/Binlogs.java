package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Binlogs {
    /**
     * binlogId
     */
    private String binlogId;

    /**
     * 文件大小，单位mb
     */
    private Integer binlogSizeInBytes;

    /**
     * binlog文件记录的开始时间
     */
    private String binlogEndTime;

    /**
     * binlog文件记录的结束时间
     */
    private String binlogStartTime;

    /**
     * binlog日志状态 available
     */
    private String binlogStatus;

    /**
     * 文件名
     */
    private String binlogRealId;

    public Binlogs setBinlogId(String binlogId) {
        this.binlogId = binlogId;
        return this;
    }

    public String getBinlogId() {
        return this.binlogId;
    }

    public Binlogs setBinlogSizeInBytes(Integer binlogSizeInBytes) {
        this.binlogSizeInBytes = binlogSizeInBytes;
        return this;
    }

    public Integer getBinlogSizeInBytes() {
        return this.binlogSizeInBytes;
    }

    public Binlogs setBinlogEndTime(String binlogEndTime) {
        this.binlogEndTime = binlogEndTime;
        return this;
    }

    public String getBinlogEndTime() {
        return this.binlogEndTime;
    }

    public Binlogs setBinlogStartTime(String binlogStartTime) {
        this.binlogStartTime = binlogStartTime;
        return this;
    }

    public String getBinlogStartTime() {
        return this.binlogStartTime;
    }

    public Binlogs setBinlogStatus(String binlogStatus) {
        this.binlogStatus = binlogStatus;
        return this;
    }

    public String getBinlogStatus() {
        return this.binlogStatus;
    }

    public Binlogs setBinlogRealId(String binlogRealId) {
        this.binlogRealId = binlogRealId;
        return this;
    }

    public String getBinlogRealId() {
        return this.binlogRealId;
    }

    @Override
    public String toString() {
        return "Binlogs{" + "binlogId=" + binlogId + "\n" + "binlogSizeInBytes=" + binlogSizeInBytes + "\n" + "binlogEndTime=" + binlogEndTime + "\n" + "binlogStartTime="
                + binlogStartTime + "\n" + "binlogStatus=" + binlogStatus + "\n" + "binlogRealId=" + binlogRealId + "\n" + "}";
    }

}