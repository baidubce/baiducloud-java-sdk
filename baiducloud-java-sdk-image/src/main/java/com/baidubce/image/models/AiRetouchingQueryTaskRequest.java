package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AiRetouchingQueryTaskRequest extends BaseBceRequest {

    /**
    * 任务ID
    */
    @JsonProperty("task_id")
    private String taskId;

    public String getTaskId() {
        return taskId;
    }

    public AiRetouchingQueryTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

}
