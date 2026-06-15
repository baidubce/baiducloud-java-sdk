package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CacheJobInfo {
    /**
     * 缓存管理任务 ID
     */
    private String cacheJobId;

    /**
     * 任务状态，见 CacheJobStatus
     */
    private String status;

    /**
     * 任务已完成数据量，单位 Bytes
     */
    private Long size;

    /**
     * 任务开始时间，例如 2026-06-01T23:00:10Z
     */
    private String startTime;

    /**
     * 任务结束时间，例如 2026-06-01T23:00:10Z
     */
    private String endTime;

    public CacheJobInfo setCacheJobId(String cacheJobId) {
        this.cacheJobId = cacheJobId;
        return this;
    }

    public String getCacheJobId() {
        return this.cacheJobId;
    }

    public CacheJobInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public CacheJobInfo setSize(Long size) {
        this.size = size;
        return this;
    }

    public Long getSize() {
        return this.size;
    }

    public CacheJobInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public CacheJobInfo setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    @Override
    public String toString() {
        return "CacheJobInfo{" + "cacheJobId=" + cacheJobId + "\n" + "status=" + status + "\n" + "size=" + size + "\n" + "startTime=" + startTime + "\n" + "endTime=" + endTime
                + "\n" + "}";
    }

}