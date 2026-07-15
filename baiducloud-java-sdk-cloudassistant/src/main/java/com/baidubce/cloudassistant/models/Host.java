package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Host {
    /**
     * 实例id，如bcc实例id: i-gVGDt***
     */
    private String instanceId;

    public Host setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    @Override
    public String toString() {
        return "Host{" + "instanceId=" + instanceId + "\n" + "}";
    }

}