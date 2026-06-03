package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceSyncTaskLogsRequest extends BaseBceRequest {

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

    /**
    * taskId
    */
    @JsonIgnore
    private String taskId;

    public String getInstanceId() {
        return instanceId;
    }

    public GetInstanceSyncTaskLogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getExecutionId() {
        return executionId;
    }

    public GetInstanceSyncTaskLogsRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    public String getTaskId() {
        return taskId;
    }

    public GetInstanceSyncTaskLogsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

}
