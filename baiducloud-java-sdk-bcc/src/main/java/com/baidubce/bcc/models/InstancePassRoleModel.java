package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstancePassRoleModel {
    /**
     * 实例ID
     */
    private String instanceId;

    public InstancePassRoleModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    @Override
    public String toString() {
        return "InstancePassRoleModel{" + "instanceId=" + instanceId + "\n" + "}";
    }

}