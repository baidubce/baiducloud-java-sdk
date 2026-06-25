package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatePodmonitorRequest extends BaseBceRequest {

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
    * 固定值：PodMonitor
    */
    private String kind;

    /**
    * metadata
    */
    private ObjectMeta metadata;

    /**
    * spec
    */
    private PodMonitorSpec spec;

    public String getInstanceId() {
        return instanceId;
    }

    public CreatePodmonitorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public CreatePodmonitorRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public CreatePodmonitorRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public CreatePodmonitorRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public CreatePodmonitorRequest setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PodMonitorSpec getSpec() {
        return spec;
    }

    public CreatePodmonitorRequest setSpec(PodMonitorSpec spec) {
        this.spec = spec;
        return this;
    }

}
