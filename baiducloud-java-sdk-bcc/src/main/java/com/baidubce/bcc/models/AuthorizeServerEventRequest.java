package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthorizeServerEventRequest extends BaseBceRequest {

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 维修事件ID，serverEventId、instanceId必须选择其中一个请求
    */
    private String serverEventId;

    /**
    * 实例ID，serverEventId、instanceId必须选择其中一个请求
    */
    private String instanceId;

    /**
    * 授权的运维操作，参考事件返回的运维操作
    */
    private String authorizeMaintenanceOperation;

    /**
    * 授权的执行时间，符合BCE规范的日期格式
    */
    private String executeTime;

    public String getAction() {
        return action;
    }

    public AuthorizeServerEventRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getServerEventId() {
        return serverEventId;
    }

    public AuthorizeServerEventRequest setServerEventId(String serverEventId) {
        this.serverEventId = serverEventId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public AuthorizeServerEventRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAuthorizeMaintenanceOperation() {
        return authorizeMaintenanceOperation;
    }

    public AuthorizeServerEventRequest setAuthorizeMaintenanceOperation(String authorizeMaintenanceOperation) {
        this.authorizeMaintenanceOperation = authorizeMaintenanceOperation;
        return this;
    }

    public String getExecuteTime() {
        return executeTime;
    }

    public AuthorizeServerEventRequest setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
        return this;
    }

}
