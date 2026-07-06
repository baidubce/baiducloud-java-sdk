package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyJobRequest extends BaseBceRequest {

    /**
    * 训练任务ID
    */
    private String jobId;

    /**
    * 训练任务优先级
    */
    private String priority;

    public String getJobId() {
        return jobId;
    }

    public ModifyJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getPriority() {
        return priority;
    }

    public ModifyJobRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }

}
