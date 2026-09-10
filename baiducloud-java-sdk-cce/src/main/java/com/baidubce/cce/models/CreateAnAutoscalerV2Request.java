package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAnAutoscalerV2Request extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    public String getClusterID() {
        return clusterID;
    }

    public CreateAnAutoscalerV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

}
