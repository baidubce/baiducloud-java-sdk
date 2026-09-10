package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteNodeGroupV2Request extends BaseBceRequest {

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
    * deleteInstances
    */
    @JsonIgnore
    private Boolean deleteInstances;

    /**
    * releaseAllResource
    */
    @JsonIgnore
    private Boolean releaseAllResource;

    public String getClusterID() {
        return clusterID;
    }

    public DeleteNodeGroupV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getInstanceGroupID() {
        return instanceGroupID;
    }

    public DeleteNodeGroupV2Request setInstanceGroupID(String instanceGroupID) {
        this.instanceGroupID = instanceGroupID;
        return this;
    }

    public Boolean getDeleteInstances() {
        return deleteInstances;
    }

    public DeleteNodeGroupV2Request setDeleteInstances(Boolean deleteInstances) {
        this.deleteInstances = deleteInstances;
        return this;
    }

    public Boolean getReleaseAllResource() {
        return releaseAllResource;
    }

    public DeleteNodeGroupV2Request setReleaseAllResource(Boolean releaseAllResource) {
        this.releaseAllResource = releaseAllResource;
        return this;
    }

}
