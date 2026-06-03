package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExecuteImageMigrationRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 执行任务所属的规则ID
    */
    private Integer policyId;

    public String getInstanceId() {
        return instanceId;
    }

    public ExecuteImageMigrationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public ExecuteImageMigrationRequest setPolicyId(Integer policyId) {
        this.policyId = policyId;
        return this;
    }

}
