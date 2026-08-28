package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandwritingGetResult {
    /**
     * 任务ID
     */
    @JsonProperty("task_id")
    private String taskId;

    /**
     * 任务状态，pending：排队中；processing：运行中；success：成功；failed：失败
     */
    private String status;

    /**
     * 任务创建时间
     */
    @JsonProperty("created_time")
    private Integer createdTime;

    /**
     * 任务开始时间
     */
    @JsonProperty("started_time")
    private Integer startedTime;

    /**
     * 任务结束时间
     */
    @JsonProperty("finished_time")
    private Integer finishedTime;

    /**
     * 任务执行时长
     */
    private Integer duration;

    /**
     * result
     */
    private HandwritingGetEssayResult result;

    public HandwritingGetResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public HandwritingGetResult setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public HandwritingGetResult setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public Integer getCreatedTime() {
        return this.createdTime;
    }

    public HandwritingGetResult setStartedTime(Integer startedTime) {
        this.startedTime = startedTime;
        return this;
    }

    public Integer getStartedTime() {
        return this.startedTime;
    }

    public HandwritingGetResult setFinishedTime(Integer finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }

    public Integer getFinishedTime() {
        return this.finishedTime;
    }

    public HandwritingGetResult setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public HandwritingGetResult setResult(HandwritingGetEssayResult result) {
        this.result = result;
        return this;
    }

    public HandwritingGetEssayResult getResult() {
        return this.result;
    }

    @Override
    public String toString() {
        return "HandwritingGetResult{" + "taskId=" + taskId + "\n" + "status=" + status + "\n" + "createdTime=" + createdTime + "\n" + "startedTime=" + startedTime + "\n"
                + "finishedTime=" + finishedTime + "\n" + "duration=" + duration + "\n" + "result=" + result + "\n" + "}";
    }

}