package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindClusterRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * CCE 集群 ID。
    */
    private String clusterId;

    public String getInstanceId() {
        return instanceId;
    }

    public BindClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public BindClusterRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }

    public BindClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

}
