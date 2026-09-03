package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetouchingCreateResult {
    /**
     * 任务ID，用于查询任务结果，有效期8小时
     */
    @JsonProperty("task_id")
    private String taskId;

    /**
     * 排队等待的任务数量
     */
    @JsonProperty("wait_task_count")
    private Integer waitTaskCount;

    public RetouchingCreateResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public RetouchingCreateResult setWaitTaskCount(Integer waitTaskCount) {
        this.waitTaskCount = waitTaskCount;
        return this;
    }

    public Integer getWaitTaskCount() {
        return this.waitTaskCount;
    }

    @Override
    public String toString() {
        return "RetouchingCreateResult{" + "taskId=" + taskId + "\n" + "waitTaskCount=" + waitTaskCount + "\n" + "}";
    }

}