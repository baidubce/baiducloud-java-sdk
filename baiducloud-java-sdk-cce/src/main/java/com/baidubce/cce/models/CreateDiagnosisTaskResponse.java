package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDiagnosisTaskResponse extends BaseBceResponse {

    /**
    * 诊断任务 ID
    */
    private String taskId;

    public String getTaskId() {
        return taskId;
    }

    public CreateDiagnosisTaskResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateDiagnosisTaskResponse{" + "taskId=" + taskId + "\n" + "}";
    }

}
