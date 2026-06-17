package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckServerEventRequest extends BaseBceRequest {

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
    * 非预期事件是否通过验收，通过：Pass；不通过：Reject。
    */
    private String checkResult;

    /**
    * 故障影响，故障验收为Reject时必传
    */
    private String issueEffect;

    /**
    * 故障影响，故障验收为Reject时必传
    */
    private String issueDescription;

    /**
    * 故障验收为Reject时授权的运维操作
    */
    private String authorizeMaintenanceOperation;

    public String getAction() {
        return action;
    }

    public CheckServerEventRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getServerEventId() {
        return serverEventId;
    }

    public CheckServerEventRequest setServerEventId(String serverEventId) {
        this.serverEventId = serverEventId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public CheckServerEventRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public CheckServerEventRequest setCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    public String getIssueEffect() {
        return issueEffect;
    }

    public CheckServerEventRequest setIssueEffect(String issueEffect) {
        this.issueEffect = issueEffect;
        return this;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public CheckServerEventRequest setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
        return this;
    }

    public String getAuthorizeMaintenanceOperation() {
        return authorizeMaintenanceOperation;
    }

    public CheckServerEventRequest setAuthorizeMaintenanceOperation(String authorizeMaintenanceOperation) {
        this.authorizeMaintenanceOperation = authorizeMaintenanceOperation;
        return this;
    }

}
