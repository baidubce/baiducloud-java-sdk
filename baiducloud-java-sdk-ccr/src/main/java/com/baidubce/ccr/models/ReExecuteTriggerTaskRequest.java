package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReExecuteTriggerTaskRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * policyId
    */
    @JsonIgnore
    private String policyId;

    /**
    * jobId
    */
    @JsonIgnore
    private String jobId;

    public String getInstanceId() {
        return instanceId;
    }

    public ReExecuteTriggerTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public ReExecuteTriggerTaskRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getJobId() {
        return jobId;
    }

    public ReExecuteTriggerTaskRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

}
