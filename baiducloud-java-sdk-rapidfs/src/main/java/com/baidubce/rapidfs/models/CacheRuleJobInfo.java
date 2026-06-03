package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CacheRuleJobInfo {
    /**
     * 缓存管理任务 ID
     */
    private String cacheRuleJobId;

    /**
     * 任务状态，见 CacheRuleJobStatus
     */
    private String status;

    /**
     * 任务已完成数据量，单位 Bytes
     */
    private Long size;

    /**
     * 任务开始时间，例如 2026-06-01T23:00:10Z"
     */
    private String startTime;

    /**
     * 任务结束时间，例如 2026-06-01T23:00:10Z"
     */
    private String endTime;

    public CacheRuleJobInfo setCacheRuleJobId(String cacheRuleJobId) {
        this.cacheRuleJobId = cacheRuleJobId;
        return this;
    }

    public String getCacheRuleJobId() {
        return this.cacheRuleJobId;
    }

    public CacheRuleJobInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public CacheRuleJobInfo setSize(Long size) {
        this.size = size;
        return this;
    }

    public Long getSize() {
        return this.size;
    }

    public CacheRuleJobInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public CacheRuleJobInfo setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    @Override
    public String toString() {
        return "CacheRuleJobInfo{" + "cacheRuleJobId=" + cacheRuleJobId + "\n" + "status=" + status + "\n" + "size=" + size + "\n" + "startTime=" + startTime + "\n" + "endTime="
                + endTime + "\n" + "}";
    }

}