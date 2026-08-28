package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorrectEduResult {
    /**
     * 任务ID
     */
    @JsonProperty("task_id")
    private String taskId;

    /**
     * 是否完成批改。true：批改完成；false：批改未完成
     */
    private Boolean isAllFinished;

    /**
     * 任务状态，pending：排队中（err_code=50）；running：运行中（err_code=60）；success：成功（err_code=0）；failed：失败（err_code为具体的报错类型）
     */
    private String status;

    /**
     * statResult
     */
    @JsonProperty("stat_result")
    private StatResult statResult;

    /**
     * 单张图片的批改结果数组，每张图片对应一个元素
     */
    private List<ImageResult> imageResults;

    public CorrectEduResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public CorrectEduResult setIsAllFinished(Boolean isAllFinished) {
        this.isAllFinished = isAllFinished;
        return this;
    }

    public Boolean getIsAllFinished() {
        return this.isAllFinished;
    }

    public CorrectEduResult setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public CorrectEduResult setStatResult(StatResult statResult) {
        this.statResult = statResult;
        return this;
    }

    public StatResult getStatResult() {
        return this.statResult;
    }

    public CorrectEduResult setImageResults(List<ImageResult> imageResults) {
        this.imageResults = imageResults;
        return this;
    }

    public List<ImageResult> getImageResults() {
        return this.imageResults;
    }

    @Override
    public String toString() {
        return "CorrectEduResult{" + "taskId=" + taskId + "\n" + "isAllFinished=" + isAllFinished + "\n" + "status=" + status + "\n" + "statResult=" + statResult + "\n"
                + "imageResults=" + imageResults + "\n" + "}";
    }

}