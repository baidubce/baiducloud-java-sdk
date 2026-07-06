package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchStopTrainingTasksV2Request extends BaseBceRequest {

    /**
    * 任务 ID 列表数组，每个元素为包含 jobId 的对象
    */
    private List<Object> jobList;

    /**
    * 单个任务的唯一标识，非空且唯一
    */
    private String jobListJobId;

    public List<Object> getJobList() {
        return jobList;
    }

    public BatchStopTrainingTasksV2Request setJobList(List<Object> jobList) {
        this.jobList = jobList;
        return this;
    }

    public String getJobListJobId() {
        return jobListJobId;
    }

    public BatchStopTrainingTasksV2Request setJobListJobId(String jobListJobId) {
        this.jobListJobId = jobListJobId;
        return this;
    }

}
