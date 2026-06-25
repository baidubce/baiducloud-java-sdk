package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateServiceMonitorRequest extends BaseBceRequest {

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
    * 固定值：monitoring.coreos.com/v1
    */
    private String apiVersion;

    /**
    * 固定值：ServiceMonitor
    */
    private String kind;

    /**
    * metadata
    */
    private ObjectMeta metadata;

    /**
    * spec
    */
    private ServiceMonitorSpec spec;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateServiceMonitorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public CreateServiceMonitorRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public CreateServiceMonitorRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public CreateServiceMonitorRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public CreateServiceMonitorRequest setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ServiceMonitorSpec getSpec() {
        return spec;
    }

    public CreateServiceMonitorRequest setSpec(ServiceMonitorSpec spec) {
        this.spec = spec;
        return this;
    }

}
