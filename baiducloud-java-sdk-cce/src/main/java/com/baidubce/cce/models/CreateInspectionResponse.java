package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInspectionResponse extends BaseBceResponse {

    /**
    * 巡检任务 ID
    */
    private String taskId;

    public String getTaskId() {
        return taskId;
    }

    public CreateInspectionResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateInspectionResponse{" + "taskId=" + taskId + "\n" + "}";
    }

}
