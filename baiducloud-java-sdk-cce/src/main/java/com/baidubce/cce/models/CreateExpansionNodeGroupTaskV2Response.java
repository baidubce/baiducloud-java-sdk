package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateExpansionNodeGroupTaskV2Response extends BaseBceResponse {

    /**
    * 节点组扩容任务 ID
    */
    private String taskID;

    /**
    * 请求 ID, 问题定位提供该 ID
    */
    private String requestID;

    public String getTaskID() {
        return taskID;
    }

    public CreateExpansionNodeGroupTaskV2Response setTaskID(String taskID) {
        this.taskID = taskID;
        return this;
    }

    public String getRequestID() {
        return requestID;
    }

    public CreateExpansionNodeGroupTaskV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "CreateExpansionNodeGroupTaskV2Response{" + "taskID=" + taskID + "\n" + "requestID=" + requestID + "\n" + "}";
    }

}
