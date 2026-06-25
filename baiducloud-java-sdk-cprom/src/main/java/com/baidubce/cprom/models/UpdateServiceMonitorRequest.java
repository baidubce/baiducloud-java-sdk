package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateServiceMonitorRequest extends BaseBceRequest {

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

    /**
    * 是否启用：true/false
    */
    private String enable;

    /**
    * serviceMonitor
    */
    private ServiceMonitor serviceMonitor;

    public String getServiceMonitorName() {
        return serviceMonitorName;
    }

    public UpdateServiceMonitorRequest setServiceMonitorName(String serviceMonitorName) {
        this.serviceMonitorName = serviceMonitorName;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateServiceMonitorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public UpdateServiceMonitorRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getEnable() {
        return enable;
    }

    public UpdateServiceMonitorRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }

    public ServiceMonitor getServiceMonitor() {
        return serviceMonitor;
    }

    public UpdateServiceMonitorRequest setServiceMonitor(ServiceMonitor serviceMonitor) {
        this.serviceMonitor = serviceMonitor;
        return this;
    }

}
