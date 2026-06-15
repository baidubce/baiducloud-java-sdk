package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceRoleAssociationModel {
    /**
     * 实例ID
     */
    private String instanceId;

    public InstanceRoleAssociationModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    @Override
    public String toString() {
        return "InstanceRoleAssociationModel{" + "instanceId=" + instanceId + "\n" + "}";
    }

}