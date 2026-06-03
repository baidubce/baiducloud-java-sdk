package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExecutionResult {
    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 执行失败次数
     */
    private Integer failed;

    /**
     * 执行记录 ID
     */
    private Integer id;

    /**
     * 正在进行的任务数量
     */
    private Integer inProgress;

    /**
     * 执行任务所属的规则 ID
     */
    private Integer policyId;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 执行状态
     */
    private String status;

    /**
     * 状态文本
     */
    private String statusText;

    /**
     * 停止执行的计数
     */
    private Integer stopped;

    /**
     * 成功执行的计数
     */
    private Integer succeed;

    /**
     * 所有执行的计数
     */
    private Integer total;

    /**
     * 触发方式
     */
    private String trigger;

    public ExecutionResult setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public ExecutionResult setFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    public Integer getFailed() {
        return this.failed;
    }

    public ExecutionResult setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public ExecutionResult setInProgress(Integer inProgress) {
        this.inProgress = inProgress;
        return this;
    }

    public Integer getInProgress() {
        return this.inProgress;
    }

    public ExecutionResult setPolicyId(Integer policyId) {
        this.policyId = policyId;
        return this;
    }

    public Integer getPolicyId() {
        return this.policyId;
    }

    public ExecutionResult setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public ExecutionResult setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public ExecutionResult setStatusText(String statusText) {
        this.statusText = statusText;
        return this;
    }

    public String getStatusText() {
        return this.statusText;
    }

    public ExecutionResult setStopped(Integer stopped) {
        this.stopped = stopped;
        return this;
    }

    public Integer getStopped() {
        return this.stopped;
    }

    public ExecutionResult setSucceed(Integer succeed) {
        this.succeed = succeed;
        return this;
    }

    public Integer getSucceed() {
        return this.succeed;
    }

    public ExecutionResult setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getTotal() {
        return this.total;
    }

    public ExecutionResult setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public String getTrigger() {
        return this.trigger;
    }

    @Override
    public String toString() {
        return "ExecutionResult{" + "endTime=" + endTime + "\n" + "failed=" + failed + "\n" + "id=" + id + "\n" + "inProgress=" + inProgress + "\n" + "policyId=" + policyId + "\n"
                + "startTime=" + startTime + "\n" + "status=" + status + "\n" + "statusText=" + statusText + "\n" + "stopped=" + stopped + "\n" + "succeed=" + succeed + "\n"
                + "total=" + total + "\n" + "trigger=" + trigger + "\n" + "}";
    }

}