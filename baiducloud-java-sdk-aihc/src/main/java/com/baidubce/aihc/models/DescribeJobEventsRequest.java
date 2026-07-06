package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeJobEventsRequest extends BaseBceRequest {

    /**
    * 训练任务ID
    */
    private String jobId;

    /**
    * 获取任务事件的起始时间，默认为任务创建时间
    */
    private String startTime;

    /**
    * 获取任务事件的结束时间，默认为 now
    */
    private String endTime;

    public String getJobId() {
        return jobId;
    }

    public DescribeJobEventsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public DescribeJobEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public DescribeJobEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

}
