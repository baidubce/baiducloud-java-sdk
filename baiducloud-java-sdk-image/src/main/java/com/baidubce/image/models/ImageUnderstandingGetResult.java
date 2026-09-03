package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageUnderstandingGetResult {
    /**
     * 该结果对应请求的task_id
     */
    @JsonProperty("task_id")
    private String taskId;

    /**
     * 识别状态，0：处理成功；1：处理中
     */
    @JsonProperty("ret_code")
    private Integer retCode;

    /**
     * 识别状态信息，success：处理成功；processing：处理中
     */
    @JsonProperty("ret_msg")
    private String retMsg;

    /**
     * 针对输入的question问题，对图片内容进行分析后输出的答案
     */
    private String description;

    public ImageUnderstandingGetResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public ImageUnderstandingGetResult setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }

    public Integer getRetCode() {
        return this.retCode;
    }

    public ImageUnderstandingGetResult setRetMsg(String retMsg) {
        this.retMsg = retMsg;
        return this;
    }

    public String getRetMsg() {
        return this.retMsg;
    }

    public ImageUnderstandingGetResult setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "ImageUnderstandingGetResult{" + "taskId=" + taskId + "\n" + "retCode=" + retCode + "\n" + "retMsg=" + retMsg + "\n" + "description=" + description + "\n" + "}";
    }

}