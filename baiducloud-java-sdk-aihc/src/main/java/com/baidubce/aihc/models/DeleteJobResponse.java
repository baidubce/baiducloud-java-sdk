package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteJobResponse extends BaseBceResponse {

    /**
    * 请求ID
    */
    private String requestId;

    /**
    * 任务ID
    */
    private String jobId;

    /**
    * 任务名称
    */
    private String jobName;

    public String getRequestId() {
        return requestId;
    }

    public DeleteJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getJobId() {
        return jobId;
    }

    public DeleteJobResponse setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getJobName() {
        return jobName;
    }

    public DeleteJobResponse setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    @Override
    public String toString() {
        return "DeleteJobResponse{" + "requestId=" + requestId + "\n" + "jobId=" + jobId + "\n" + "jobName=" + jobName + "\n" + "}";
    }

}
