package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeJobMetricsResponse extends BaseBceResponse {

    /**
    * 请求ID
    */
    private String requestId;

    /**
    * 任务ID
    */
    private String jobId;

    /**
    * metrics
    */
    private Metric metrics;

    public String getRequestId() {
        return requestId;
    }

    public DescribeJobMetricsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getJobId() {
        return jobId;
    }

    public DescribeJobMetricsResponse setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public Metric getMetrics() {
        return metrics;
    }

    public DescribeJobMetricsResponse setMetrics(Metric metrics) {
        this.metrics = metrics;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeJobMetricsResponse{" + "requestId=" + requestId + "\n" + "jobId=" + jobId + "\n" + "metrics=" + metrics + "\n" + "}";
    }

}
