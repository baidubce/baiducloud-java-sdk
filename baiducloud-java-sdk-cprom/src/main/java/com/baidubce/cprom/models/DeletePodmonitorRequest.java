package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletePodmonitorRequest extends BaseBceRequest {

    /**
    * podMonitorName
    */
    @JsonIgnore
    private String podMonitorName;

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

    public String getPodMonitorName() {
        return podMonitorName;
    }

    public DeletePodmonitorRequest setPodMonitorName(String podMonitorName) {
        this.podMonitorName = podMonitorName;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public DeletePodmonitorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public DeletePodmonitorRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

}
