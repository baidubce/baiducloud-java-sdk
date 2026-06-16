package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DownloadTaskResult {
    /**
     * task
     */
    private Task task;

    public DownloadTaskResult setTask(Task task) {
        this.task = task;
        return this;
    }

    public Task getTask() {
        return this.task;
    }

    @Override
    public String toString() {
        return "DownloadTaskResult{" + "task=" + task + "\n" + "}";
    }

}