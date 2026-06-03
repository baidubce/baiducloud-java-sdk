package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetaSyncJobInfo {
    /**
     * 元数据同步任务 ID
     */
    private String metaSyncJobId;

    /**
     * 任务状态，见 MetaSyncJobStatus
     */
    private String status;

    /**
     * 任务开始时间，例如 2026-06-01T23:00:10Z"
     */
    private String startTime;

    /**
     * 任务结束时间，例如 2026-06-01T23:00:10Z"
     */
    private String endTime;

    public MetaSyncJobInfo setMetaSyncJobId(String metaSyncJobId) {
        this.metaSyncJobId = metaSyncJobId;
        return this;
    }

    public String getMetaSyncJobId() {
        return this.metaSyncJobId;
    }

    public MetaSyncJobInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public MetaSyncJobInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public MetaSyncJobInfo setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    @Override
    public String toString() {
        return "MetaSyncJobInfo{" + "metaSyncJobId=" + metaSyncJobId + "\n" + "status=" + status + "\n" + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n" + "}";
    }

}