package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribePodEventsRequest extends BaseBceRequest {

    /**
    * 训练任务ID
    */
    private String jobId;

    /**
    * 训练任务节点名称
    */
    private String podName;

    /**
    * 任务pod事件的起始时间，默认为 Pod 创建时间
    */
    private String startTime;

    /**
    * 任务pod事件的结束时间，默认为 now
    */
    private String endTime;

    public String getJobId() {
        return jobId;
    }

    public DescribePodEventsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getPodName() {
        return podName;
    }

    public DescribePodEventsRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public DescribePodEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public DescribePodEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

}
