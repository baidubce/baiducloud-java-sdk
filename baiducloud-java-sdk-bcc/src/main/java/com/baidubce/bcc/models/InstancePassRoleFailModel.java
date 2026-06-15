package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstancePassRoleFailModel {
    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 失败信息
     */
    private String failMessage;

    public InstancePassRoleFailModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public InstancePassRoleFailModel setFailMessage(String failMessage) {
        this.failMessage = failMessage;
        return this;
    }

    public String getFailMessage() {
        return this.failMessage;
    }

    @Override
    public String toString() {
        return "InstancePassRoleFailModel{" + "instanceId=" + instanceId + "\n" + "failMessage=" + failMessage + "\n" + "}";
    }

}