package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageUnderstandingGetResultRequest extends BaseBceRequest {

    /**
    * 调用提交请求接口时返回的task_id，task_id有效期30天
    */
    @JsonProperty("task_id")
    private String taskId;

    public String getTaskId() {
        return taskId;
    }

    public ImageUnderstandingGetResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

}
