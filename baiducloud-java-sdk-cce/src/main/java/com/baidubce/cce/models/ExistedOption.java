package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExistedOption {
    /**
     * 必填。是否重试已有诊断任务
     */
    private Boolean existedTask;

    /**
     * 必填。重试的诊断任务 ID
     */
    private String taskId;

    public ExistedOption setExistedTask(Boolean existedTask) {
        this.existedTask = existedTask;
        return this;
    }

    public Boolean getExistedTask() {
        return this.existedTask;
    }

    public ExistedOption setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    @Override
    public String toString() {
        return "ExistedOption{" + "existedTask=" + existedTask + "\n" + "taskId=" + taskId + "\n" + "}";
    }

}