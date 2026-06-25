package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TogglePodMonitorServiceRequest extends BaseBceRequest {

    /**
    * action
    */
    @JsonIgnore
    private String action;

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

    public String getAction() {
        return action;
    }

    public TogglePodMonitorServiceRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public TogglePodMonitorServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public TogglePodMonitorServiceRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

}
