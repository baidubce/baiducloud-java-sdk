package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetImageMigrationExecutionRecordDetailResponse extends BaseBceResponse {

    /**
    * 结束时间
    */
    private String endTime;

    /**
    * 执行失败的次数
    */
    private Integer failed;

    /**
    * 执行任务ID
    */
    private Integer id;

    /**
    * 正在进行的任务数量
    */
    private Integer inProgress;

    /**
    * 执行任务所属的规则ID
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

    public String getEndTime() {
        return endTime;
    }

    public GetImageMigrationExecutionRecordDetailResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public Integer getFailed() {
        return failed;
    }

    public GetImageMigrationExecutionRecordDetailResponse setFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetImageMigrationExecutionRecordDetailResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getInProgress() {
        return inProgress;
    }

    public GetImageMigrationExecutionRecordDetailResponse setInProgress(Integer inProgress) {
        this.inProgress = inProgress;
        return this;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public GetImageMigrationExecutionRecordDetailResponse setPolicyId(Integer policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public GetImageMigrationExecutionRecordDetailResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetImageMigrationExecutionRecordDetailResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatusText() {
        return statusText;
    }

    public GetImageMigrationExecutionRecordDetailResponse setStatusText(String statusText) {
        this.statusText = statusText;
        return this;
    }

    public Integer getStopped() {
        return stopped;
    }

    public GetImageMigrationExecutionRecordDetailResponse setStopped(Integer stopped) {
        this.stopped = stopped;
        return this;
    }

    public Integer getSucceed() {
        return succeed;
    }

    public GetImageMigrationExecutionRecordDetailResponse setSucceed(Integer succeed) {
        this.succeed = succeed;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public GetImageMigrationExecutionRecordDetailResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public GetImageMigrationExecutionRecordDetailResponse setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    @Override
    public String toString() {
        return "GetImageMigrationExecutionRecordDetailResponse{" + "endTime=" + endTime + "\n" + "failed=" + failed + "\n" + "id=" + id + "\n" + "inProgress=" + inProgress + "\n"
                + "policyId=" + policyId + "\n" + "startTime=" + startTime + "\n" + "status=" + status + "\n" + "statusText=" + statusText + "\n" + "stopped=" + stopped + "\n"
                + "succeed=" + succeed + "\n" + "total=" + total + "\n" + "trigger=" + trigger + "\n" + "}";
    }

}
