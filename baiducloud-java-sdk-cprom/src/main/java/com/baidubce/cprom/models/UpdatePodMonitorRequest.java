package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePodMonitorRequest extends BaseBceRequest {

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

    /**
    * 是否启用：true/false
    */
    private String enable;

    /**
    * podMonitor
    */
    private PodMonitor podMonitor;

    public String getPodMonitorName() {
        return podMonitorName;
    }

    public UpdatePodMonitorRequest setPodMonitorName(String podMonitorName) {
        this.podMonitorName = podMonitorName;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public UpdatePodMonitorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public UpdatePodMonitorRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getEnable() {
        return enable;
    }

    public UpdatePodMonitorRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }

    public PodMonitor getPodMonitor() {
        return podMonitor;
    }

    public UpdatePodMonitorRequest setPodMonitor(PodMonitor podMonitor) {
        this.podMonitor = podMonitor;
        return this;
    }

}
