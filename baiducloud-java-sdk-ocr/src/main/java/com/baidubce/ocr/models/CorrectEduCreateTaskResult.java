package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorrectEduCreateTaskResult {
    /**
     * 该请求生成的任务ID，后续使用该task_id获取批改结果
     */
    @JsonProperty("task_id")
    private String taskId;

    /**
     * 等待处理的任务数量
     */
    @JsonProperty("wait_task_count")
    private Integer waitTaskCount;

    public CorrectEduCreateTaskResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public CorrectEduCreateTaskResult setWaitTaskCount(Integer waitTaskCount) {
        this.waitTaskCount = waitTaskCount;
        return this;
    }

    public Integer getWaitTaskCount() {
        return this.waitTaskCount;
    }

    @Override
    public String toString() {
        return "CorrectEduCreateTaskResult{" + "taskId=" + taskId + "\n" + "waitTaskCount=" + waitTaskCount + "\n" + "}";
    }

}