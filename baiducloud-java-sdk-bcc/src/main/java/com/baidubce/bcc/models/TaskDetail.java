package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskDetail {
    /**
     * 任务ID
     */
    private String taskId;

    /**
     * 任务类型
     */
    private String taskAction;

    /**
     * 任务状态：Processing 处理中，Finished 已完成，Failed 处理失败
     */
    private String taskStatus;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 完成时间
     */
    private String finishedTime;

    /**
     * 总数
     */
    private Integer totalCount;

    /**
     * 成功数量
     */
    private Integer successCount;

    /**
     * 失败数量
     */
    private Integer failedCount;

    /**
     * 操作列表，查询任务列表接口无此信息
     */
    private List<OperationProgressSet> operationProgressSet;

    public TaskDetail setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public TaskDetail setTaskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }

    public String getTaskAction() {
        return this.taskAction;
    }

    public TaskDetail setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    public String getTaskStatus() {
        return this.taskStatus;
    }

    public TaskDetail setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public TaskDetail setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }

    public String getFinishedTime() {
        return this.finishedTime;
    }

    public TaskDetail setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public TaskDetail setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    public Integer getSuccessCount() {
        return this.successCount;
    }

    public TaskDetail setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    public Integer getFailedCount() {
        return this.failedCount;
    }

    public TaskDetail setOperationProgressSet(List<OperationProgressSet> operationProgressSet) {
        this.operationProgressSet = operationProgressSet;
        return this;
    }

    public List<OperationProgressSet> getOperationProgressSet() {
        return this.operationProgressSet;
    }

    @Override
    public String toString() {
        return "TaskDetail{" + "taskId=" + taskId + "\n" + "taskAction=" + taskAction + "\n" + "taskStatus=" + taskStatus + "\n" + "createdTime=" + createdTime + "\n"
                + "finishedTime=" + finishedTime + "\n" + "totalCount=" + totalCount + "\n" + "successCount=" + successCount + "\n" + "failedCount=" + failedCount + "\n"
                + "operationProgressSet=" + operationProgressSet + "\n" + "}";
    }

}