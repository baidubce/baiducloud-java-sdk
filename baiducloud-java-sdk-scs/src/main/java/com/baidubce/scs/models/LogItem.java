package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogItem {
    /**
     * 日志记录ID
     */
    private String logId;

    /**
     * 日志文件大小(单位为字节)
     */
    private Integer logSizeInBytes;

    /**
     * 日志起始时间点
     */
    private String logStartTime;

    /**
     * 日志结束时间点
     */
    private String logEndTime;

    /**
     * 日志下载链接
     */
    private String downloadUrl;

    /**
     * 下载链接到期时间
     */
    private String downloadExpires;

    public LogItem setLogId(String logId) {
        this.logId = logId;
        return this;
    }

    public String getLogId() {
        return this.logId;
    }

    public LogItem setLogSizeInBytes(Integer logSizeInBytes) {
        this.logSizeInBytes = logSizeInBytes;
        return this;
    }

    public Integer getLogSizeInBytes() {
        return this.logSizeInBytes;
    }

    public LogItem setLogStartTime(String logStartTime) {
        this.logStartTime = logStartTime;
        return this;
    }

    public String getLogStartTime() {
        return this.logStartTime;
    }

    public LogItem setLogEndTime(String logEndTime) {
        this.logEndTime = logEndTime;
        return this;
    }

    public String getLogEndTime() {
        return this.logEndTime;
    }

    public LogItem setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public LogItem setDownloadExpires(String downloadExpires) {
        this.downloadExpires = downloadExpires;
        return this;
    }

    public String getDownloadExpires() {
        return this.downloadExpires;
    }

    @Override
    public String toString() {
        return "LogItem{" + "logId=" + logId + "\n" + "logSizeInBytes=" + logSizeInBytes + "\n" + "logStartTime=" + logStartTime + "\n" + "logEndTime=" + logEndTime + "\n"
                + "downloadUrl=" + downloadUrl + "\n" + "downloadExpires=" + downloadExpires + "\n" + "}";
    }

}