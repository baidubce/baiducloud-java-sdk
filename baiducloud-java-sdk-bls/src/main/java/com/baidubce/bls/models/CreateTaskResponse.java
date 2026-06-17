package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTaskResponse extends BaseBceResponse {

    /**
    * 创建成功后的传输任务ID
    */
    private String taskId;

    public String getTaskId() {
        return taskId;
    }

    public CreateTaskResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateTaskResponse{" + "taskId=" + taskId + "\n" + "}";
    }

}
