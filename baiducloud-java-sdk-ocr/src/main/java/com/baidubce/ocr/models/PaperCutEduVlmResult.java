package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaperCutEduVlmResult {
    /**
     * 该请求生成的任务ID，后续使用该task_id获取识别结果
     */
    @JsonProperty("task_id")
    private String taskId;

    /**
     * 当前排队中的任务数
     */
    @JsonProperty("wait_task_count")
    private Integer waitTaskCount;

    public PaperCutEduVlmResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public PaperCutEduVlmResult setWaitTaskCount(Integer waitTaskCount) {
        this.waitTaskCount = waitTaskCount;
        return this;
    }

    public Integer getWaitTaskCount() {
        return this.waitTaskCount;
    }

    @Override
    public String toString() {
        return "PaperCutEduVlmResult{" + "taskId=" + taskId + "\n" + "waitTaskCount=" + waitTaskCount + "\n" + "}";
    }

}