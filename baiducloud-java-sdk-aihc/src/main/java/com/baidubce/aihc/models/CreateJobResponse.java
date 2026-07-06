package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateJobResponse extends BaseBceResponse {

    /**
    * 请求ID
    */
    private String requestId;

    /**
    * 任务id
    */
    private String jobId;

    /**
    * 任务名称
    */
    private String jobName;

    public String getRequestId() {
        return requestId;
    }

    public CreateJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getJobId() {
        return jobId;
    }

    public CreateJobResponse setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getJobName() {
        return jobName;
    }

    public CreateJobResponse setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    @Override
    public String toString() {
        return "CreateJobResponse{" + "requestId=" + requestId + "\n" + "jobId=" + jobId + "\n" + "jobName=" + jobName + "\n" + "}";
    }

}
