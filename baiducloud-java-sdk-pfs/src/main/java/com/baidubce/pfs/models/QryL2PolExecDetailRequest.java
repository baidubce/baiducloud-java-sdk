package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QryL2PolExecDetailRequest extends BaseBceRequest {

    /**
    * policyId对应的pfs实例短id
    */
    private String instanceId;

    /**
    * policyId
    */
    private String policyId;

    /**
    * 需要查询的任务ID
    */
    private String jobId;

    public String getInstanceId() {
        return instanceId;
    }

    public QryL2PolExecDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public QryL2PolExecDetailRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getJobId() {
        return jobId;
    }

    public QryL2PolExecDetailRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

}
