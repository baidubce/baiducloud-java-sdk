package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobResult {
    /**
     * 训练任务唯一标识id
     */
    private String jobId;

    /**
     * 任务是否处理成功（成功列表固定为 true，失败列表固定为 false）
     */
    private Boolean success;

    /**
     * 失败原因描述，失败时返回，成功返回空
     */
    private String errorMsg;

    public JobResult setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getJobId() {
        return this.jobId;
    }

    public JobResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public JobResult setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    @Override
    public String toString() {
        return "JobResult{" + "jobId=" + jobId + "\n" + "success=" + success + "\n" + "errorMsg=" + errorMsg + "\n" + "}";
    }

}