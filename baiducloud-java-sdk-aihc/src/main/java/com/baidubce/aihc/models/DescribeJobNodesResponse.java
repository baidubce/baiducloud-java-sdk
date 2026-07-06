package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeJobNodesResponse extends BaseBceResponse {

    /**
    * 请求ID
    */
    private String requestId;

    /**
    * 任务ID
    */
    private String jobId;

    /**
    * 任务所在的Node列表
    */
    private List<String> nodes;

    public String getRequestId() {
        return requestId;
    }

    public DescribeJobNodesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getJobId() {
        return jobId;
    }

    public DescribeJobNodesResponse setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public List<String> getNodes() {
        return nodes;
    }

    public DescribeJobNodesResponse setNodes(List<String> nodes) {
        this.nodes = nodes;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeJobNodesResponse{" + "requestId=" + requestId + "\n" + "jobId=" + jobId + "\n" + "nodes=" + nodes + "\n" + "}";
    }

}
