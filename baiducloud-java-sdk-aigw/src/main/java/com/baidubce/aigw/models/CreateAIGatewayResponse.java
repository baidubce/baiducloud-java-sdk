package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAIGatewayResponse extends BaseBceResponse {

    /**
    * 新创建的网关实例 ID
    */
    private String instanceId;

    /**
    * 请求 ID
    */
    private String requestId;

    /**
    * 异步创建任务 ID
    */
    private String taskId;

    /**
    * 创建或复用的安全组 ID
    */
    private String securityGroupId;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateAIGatewayResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public CreateAIGatewayResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getTaskId() {
        return taskId;
    }

    public CreateAIGatewayResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public CreateAIGatewayResponse setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAIGatewayResponse{" + "instanceId=" + instanceId + "\n" + "requestId=" + requestId + "\n" + "taskId=" + taskId + "\n" + "securityGroupId=" + securityGroupId
                + "\n" + "}";
    }

}
