package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViewTaskDetailsV2Request extends BaseBceRequest {

    /**
    * taskType
    */
    @JsonIgnore
    private String taskType;

    /**
    * taskID
    */
    @JsonIgnore
    private String taskID;

    public String getTaskType() {
        return taskType;
    }

    public ViewTaskDetailsV2Request setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    public String getTaskID() {
        return taskID;
    }

    public ViewTaskDetailsV2Request setTaskID(String taskID) {
        this.taskID = taskID;
        return this;
    }

}
