package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaperCutEduVlmGetResult {
    /**
     * 任务ID
     */
    @JsonProperty("task_id")
    private String taskId;

    /**
     * 任务状态：pending-排队中；running-运行中；Success-成功；failed-失败
     */
    private String status;

    /**
     * 题目元素信息
     */
    @JsonProperty("qus_results")
    private List<PaperCutEduVlmGetQusResult> qusResults;

    public PaperCutEduVlmGetResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public PaperCutEduVlmGetResult setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public PaperCutEduVlmGetResult setQusResults(List<PaperCutEduVlmGetQusResult> qusResults) {
        this.qusResults = qusResults;
        return this;
    }

    public List<PaperCutEduVlmGetQusResult> getQusResults() {
        return this.qusResults;
    }

    @Override
    public String toString() {
        return "PaperCutEduVlmGetResult{" + "taskId=" + taskId + "\n" + "status=" + status + "\n" + "qusResults=" + qusResults + "\n" + "}";
    }

}