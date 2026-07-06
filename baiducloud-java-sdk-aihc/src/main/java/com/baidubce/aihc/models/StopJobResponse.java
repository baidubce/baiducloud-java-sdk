package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopJobResponse extends BaseBceResponse {

    /**
    * 请求ID
    */
    private String requestId;

    /**
    * 成功请求时的返回结果，任务id
    */
    private String jobId;

    public String getRequestId() {
        return requestId;
    }

    public StopJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getJobId() {
        return jobId;
    }

    public StopJobResponse setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    @Override
    public String toString() {
        return "StopJobResponse{" + "requestId=" + requestId + "\n" + "jobId=" + jobId + "\n" + "}";
    }

}
