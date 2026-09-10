package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetNodeDetailsV2Request extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * instanceID
    */
    @JsonIgnore
    private String instanceID;

    public String getClusterID() {
        return clusterID;
    }

    public GetNodeDetailsV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public GetNodeDetailsV2Request setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

}
