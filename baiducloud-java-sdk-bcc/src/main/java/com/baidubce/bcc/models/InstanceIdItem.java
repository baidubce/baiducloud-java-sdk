package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceIdItem {
    /**
     * 实例ID
     */
    private String instanceId;

    public InstanceIdItem setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    @Override
    public String toString() {
        return "InstanceIdItem{" + "instanceId=" + instanceId + "\n" + "}";
    }

}