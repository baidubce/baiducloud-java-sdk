package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteServiceMonitorRequest extends BaseBceRequest {

    /**
    * serviceMonitorName
    */
    @JsonIgnore
    private String serviceMonitorName;

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * agentId
    */
    @JsonIgnore
    private String agentId;

    public String getServiceMonitorName() {
        return serviceMonitorName;
    }

    public DeleteServiceMonitorRequest setServiceMonitorName(String serviceMonitorName) {
        this.serviceMonitorName = serviceMonitorName;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteServiceMonitorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public DeleteServiceMonitorRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

}
