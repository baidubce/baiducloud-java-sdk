package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateExpansionNodeGroupTaskV2Request extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * instanceGroupID
    */
    @JsonIgnore
    private String instanceGroupID;

    /**
    * upToReplicas
    */
    @JsonIgnore
    private Integer upToReplicas;

    /**
    * upReplicas
    */
    @JsonIgnore
    private Integer upReplicas;

    public String getClusterID() {
        return clusterID;
    }

    public CreateExpansionNodeGroupTaskV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getInstanceGroupID() {
        return instanceGroupID;
    }

    public CreateExpansionNodeGroupTaskV2Request setInstanceGroupID(String instanceGroupID) {
        this.instanceGroupID = instanceGroupID;
        return this;
    }

    public Integer getUpToReplicas() {
        return upToReplicas;
    }

    public CreateExpansionNodeGroupTaskV2Request setUpToReplicas(Integer upToReplicas) {
        this.upToReplicas = upToReplicas;
        return this;
    }

    public Integer getUpReplicas() {
        return upReplicas;
    }

    public CreateExpansionNodeGroupTaskV2Request setUpReplicas(Integer upReplicas) {
        this.upReplicas = upReplicas;
        return this;
    }

}
