package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopJobRequest extends BaseBceRequest {

    /**
    * 训练任务ID
    */
    private String jobId;

    public String getJobId() {
        return jobId;
    }

    public StopJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

}
