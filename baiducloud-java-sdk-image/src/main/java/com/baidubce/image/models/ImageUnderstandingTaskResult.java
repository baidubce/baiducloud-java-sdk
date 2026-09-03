package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageUnderstandingTaskResult {
    /**
     * 该请求生成的task_id，后续使用该task_id获取识别结果，task_id有效期30天
     */
    @JsonProperty("task_id")
    private String taskId;

    public ImageUnderstandingTaskResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    @Override
    public String toString() {
        return "ImageUnderstandingTaskResult{" + "taskId=" + taskId + "\n" + "}";
    }

}