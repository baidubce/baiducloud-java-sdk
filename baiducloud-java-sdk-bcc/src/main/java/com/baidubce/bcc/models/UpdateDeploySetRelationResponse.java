package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateDeploySetRelationResponse extends BaseBceResponse {

    /**
    * 任务标识符
    */
    private String taskId;

    public String getTaskId() {
        return taskId;
    }

    public UpdateDeploySetRelationResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateDeploySetRelationResponse{" + "taskId=" + taskId + "\n" + "}";
    }

}
