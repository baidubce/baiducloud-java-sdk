package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskResult {
    /**
     * 同步目标
     */
    private String destResource;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 任务执行结果所属的任务 ID
     */
    private Integer executionId;

    /**
     * 任务执行结果 ID
     */
    private Integer id;

    /**
     * 与任务相关的基础作业 ID
     */
    private String jobId;

    /**
     * 任务的操作
     */
    private String operation;

    /**
     * 同步类型
     */
    private String resourceType;

    /**
     * 同步源
     */
    private String srcResource;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 状态
     */
    private String status;

    public TaskResult setDestResource(String destResource) {
        this.destResource = destResource;
        return this;
    }

    public String getDestResource() {
        return this.destResource;
    }

    public TaskResult setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public TaskResult setExecutionId(Integer executionId) {
        this.executionId = executionId;
        return this;
    }

    public Integer getExecutionId() {
        return this.executionId;
    }

    public TaskResult setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public TaskResult setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getJobId() {
        return this.jobId;
    }

    public TaskResult setOperation(String operation) {
        this.operation = operation;
        return this;
    }

    public String getOperation() {
        return this.operation;
    }

    public TaskResult setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public TaskResult setSrcResource(String srcResource) {
        this.srcResource = srcResource;
        return this;
    }

    public String getSrcResource() {
        return this.srcResource;
    }

    public TaskResult setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public TaskResult setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "TaskResult{" + "destResource=" + destResource + "\n" + "endTime=" + endTime + "\n" + "executionId=" + executionId + "\n" + "id=" + id + "\n" + "jobId=" + jobId
                + "\n" + "operation=" + operation + "\n" + "resourceType=" + resourceType + "\n" + "srcResource=" + srcResource + "\n" + "startTime=" + startTime + "\n"
                + "status=" + status + "\n" + "}";
    }

}