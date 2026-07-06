package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyJobResponse extends BaseBceResponse {

    /**
    * 成功请求时的返回结果，任务id
    */
    private String jobId;

    /**
    * 请求ID，用于标译每个请求的唯一性
    */
    private String requestId;

    public String getJobId() {
        return jobId;
    }

    public ModifyJobResponse setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public ModifyJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    @Override
    public String toString() {
        return "ModifyJobResponse{" + "jobId=" + jobId + "\n" + "requestId=" + requestId + "\n" + "}";
    }

}
