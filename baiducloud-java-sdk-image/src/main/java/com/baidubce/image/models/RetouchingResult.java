package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetouchingResult {
    /**
     * 任务ID
     */
    @JsonProperty("task_id")
    private String taskId;

    /**
     * 任务状态：pending排队中；processing运行中；success成功；failed失败
     */
    private String status;

    /**
     * 结果图下载链接，有效期8小时
     */
    private String dlink;

    /**
     * 提交任务时的透传参数
     */
    @JsonProperty("callback_data")
    private String callbackData;

    public RetouchingResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public RetouchingResult setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public RetouchingResult setDlink(String dlink) {
        this.dlink = dlink;
        return this;
    }

    public String getDlink() {
        return this.dlink;
    }

    public RetouchingResult setCallbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    public String getCallbackData() {
        return this.callbackData;
    }

    @Override
    public String toString() {
        return "RetouchingResult{" + "taskId=" + taskId + "\n" + "status=" + status + "\n" + "dlink=" + dlink + "\n" + "callbackData=" + callbackData + "\n" + "}";
    }

}