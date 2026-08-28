package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaperCutEduVlmGetResultRequest extends BaseBceRequest {

    /**
    * 发送提交请求时返回的task_id
    */
    @JsonProperty("task_id")
    private String taskId;

    public String getTaskId() {
        return taskId;
    }

    public PaperCutEduVlmGetResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

}
