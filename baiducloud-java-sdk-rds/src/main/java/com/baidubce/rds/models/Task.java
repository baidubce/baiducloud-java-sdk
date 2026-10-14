package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Task {
    /**
     * 任务ID
     */
    private Integer taskId;

    /**
     * 任务类型，可取值：resize/switch/reboot/changeAzone/reboot_switchover 等
     */
    private String taskType;

    /**
     * 任务名称，如：配置变更/主备切换/原地重启实例/迁移可用区/切换重启实例
     */
    private String taskName;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 实例所在地域
     */
    private String region;

    /**
     * 任务状态，可取值：created/running/success/failed/cancelled
     */
    private String taskStatus;

    /**
     * 任务创建时间
     */
    private String createTime;

    /**
     * 任务更新时间
     */
    private String updateTime;

    /**
     * 任务完成时间，未完成时为 `0000-00-00 00:00:00`
     */
    private String finishTime;

    /**
     * 是否可取消标志，0：不可取消，1：可取消
     */
    private Integer cancelFlag;

    /**
     * 任务进度步骤列表，元素结构见下方 Progress
     */
    private List<Progress> progress;

    public Task setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }

    public Integer getTaskId() {
        return this.taskId;
    }

    public Task setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    public String getTaskType() {
        return this.taskType;
    }

    public Task setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public Task setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public Task setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public Task setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public Task setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public Task setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    public String getTaskStatus() {
        return this.taskStatus;
    }

    public Task setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Task setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public Task setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    public String getFinishTime() {
        return this.finishTime;
    }

    public Task setCancelFlag(Integer cancelFlag) {
        this.cancelFlag = cancelFlag;
        return this;
    }

    public Integer getCancelFlag() {
        return this.cancelFlag;
    }

    public Task setProgress(List<Progress> progress) {
        this.progress = progress;
        return this;
    }

    public List<Progress> getProgress() {
        return this.progress;
    }

    @Override
    public String toString() {
        return "Task{" + "taskId=" + taskId + "\n" + "taskType=" + taskType + "\n" + "taskName=" + taskName + "\n" + "instanceId=" + instanceId + "\n" + "instanceName="
                + instanceName + "\n" + "userId=" + userId + "\n" + "region=" + region + "\n" + "taskStatus=" + taskStatus + "\n" + "createTime=" + createTime + "\n"
                + "updateTime=" + updateTime + "\n" + "finishTime=" + finishTime + "\n" + "cancelFlag=" + cancelFlag + "\n" + "progress=" + progress + "\n" + "}";
    }

}