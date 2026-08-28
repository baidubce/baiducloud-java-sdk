package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParserResult {
    /**
     * 该请求生成的task_id，后续使用该task_id获取审查结果
     */
    @JsonProperty("task_id")
    private String taskId;

    public ParserResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    @Override
    public String toString() {
        return "ParserResult{" + "taskId=" + taskId + "\n" + "}";
    }

}