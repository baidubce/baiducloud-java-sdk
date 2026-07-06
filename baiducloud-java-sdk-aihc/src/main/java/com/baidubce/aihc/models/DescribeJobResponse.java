package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeJobResponse extends BaseBceResponse {

    /**
    * 请求ID
    */
    private String requestId;

    /**
    * job
    */
    private JobItem job;

    public String getRequestId() {
        return requestId;
    }

    public DescribeJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public JobItem getJob() {
        return job;
    }

    public DescribeJobResponse setJob(JobItem job) {
        this.job = job;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeJobResponse{" + "requestId=" + requestId + "\n" + "job=" + job + "\n" + "}";
    }

}
