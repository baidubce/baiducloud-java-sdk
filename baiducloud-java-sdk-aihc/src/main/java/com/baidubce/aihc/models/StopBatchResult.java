package com.baidubce.aihc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopBatchResult {
    /**
     * 成功任务数量
     */
    private Integer successNum;

    /**
     * 失败任务数量
     */
    private Integer failedNum;

    /**
     * 整体是否全部成功
     */
    private Boolean success;

    /**
     * 成功任务列表
     */
    private List<JobResult> successList;

    /**
     * 失败任务列表（无失败则为空）
     */
    private List<JobResult> failedList;

    public StopBatchResult setSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    public Integer getSuccessNum() {
        return this.successNum;
    }

    public StopBatchResult setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    public Integer getFailedNum() {
        return this.failedNum;
    }

    public StopBatchResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public StopBatchResult setSuccessList(List<JobResult> successList) {
        this.successList = successList;
        return this;
    }

    public List<JobResult> getSuccessList() {
        return this.successList;
    }

    public StopBatchResult setFailedList(List<JobResult> failedList) {
        this.failedList = failedList;
        return this;
    }

    public List<JobResult> getFailedList() {
        return this.failedList;
    }

    @Override
    public String toString() {
        return "StopBatchResult{" + "successNum=" + successNum + "\n" + "failedNum=" + failedNum + "\n" + "success=" + success + "\n" + "successList=" + successList + "\n"
                + "failedList=" + failedList + "\n" + "}";
    }

}