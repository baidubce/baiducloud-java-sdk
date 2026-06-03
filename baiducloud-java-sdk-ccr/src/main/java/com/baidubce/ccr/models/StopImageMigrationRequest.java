package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopImageMigrationRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * executionId
    */
    @JsonIgnore
    private String executionId;

    public String getInstanceId() {
        return instanceId;
    }

    public StopImageMigrationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getExecutionId() {
        return executionId;
    }

    public StopImageMigrationRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

}
