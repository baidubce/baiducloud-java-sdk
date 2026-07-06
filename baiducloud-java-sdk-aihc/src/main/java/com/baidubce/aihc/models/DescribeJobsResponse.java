package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeJobsResponse extends BaseBceResponse {

    /**
    * 请求ID，用于标识每个请求的唯一性
    */
    private String requestId;

    /**
    * 返回任务总数
    */
    private Integer totalCount;

    /**
    * 成功请求时的返回结果
    */
    private List<JobItem> jobs;

    public String getRequestId() {
        return requestId;
    }

    public DescribeJobsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public DescribeJobsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<JobItem> getJobs() {
        return jobs;
    }

    public DescribeJobsResponse setJobs(List<JobItem> jobs) {
        this.jobs = jobs;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeJobsResponse{" + "requestId=" + requestId + "\n" + "totalCount=" + totalCount + "\n" + "jobs=" + jobs + "\n" + "}";
    }

}
