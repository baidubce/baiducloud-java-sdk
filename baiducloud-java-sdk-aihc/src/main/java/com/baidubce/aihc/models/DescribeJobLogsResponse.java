package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeJobLogsResponse extends BaseBceResponse {

    /**
    * 请求ID
    */
    private String requestId;

    /**
    * 任务ID
    */
    private String jobId;

    /**
    * Pod名称
    */
    private String podName;

    /**
    * 日志条目
    */
    private List<String> logs;

    /**
    * 下次查询的日志标识符
    */
    private String nextMarker;

    public String getRequestId() {
        return requestId;
    }

    public DescribeJobLogsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getJobId() {
        return jobId;
    }

    public DescribeJobLogsResponse setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getPodName() {
        return podName;
    }

    public DescribeJobLogsResponse setPodName(String podName) {
        this.podName = podName;
        return this;
    }

    public List<String> getLogs() {
        return logs;
    }

    public DescribeJobLogsResponse setLogs(List<String> logs) {
        this.logs = logs;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public DescribeJobLogsResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeJobLogsResponse{" + "requestId=" + requestId + "\n" + "jobId=" + jobId + "\n" + "podName=" + podName + "\n" + "logs=" + logs + "\n" + "nextMarker="
                + nextMarker + "\n" + "}";
    }

}
