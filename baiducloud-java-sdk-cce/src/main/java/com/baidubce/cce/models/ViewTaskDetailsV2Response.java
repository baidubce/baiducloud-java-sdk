package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViewTaskDetailsV2Response extends BaseBceResponse {

    /**
    * task
    */
    private Task task;

    /**
    * 请求 ID, 问题定位提供该 ID
    */
    private String requestID;

    public Task getTask() {
        return task;
    }

    public ViewTaskDetailsV2Response setTask(Task task) {
        this.task = task;
        return this;
    }

    public String getRequestID() {
        return requestID;
    }

    public ViewTaskDetailsV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "ViewTaskDetailsV2Response{" + "task=" + task + "\n" + "requestID=" + requestID + "\n" + "}";
    }

}
