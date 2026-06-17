package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetVolumeClusterRequest extends BaseBceRequest {

    /**
    * clusterId
    */
    @JsonIgnore
    private String clusterId;

    public String getClusterId() {
        return clusterId;
    }

    public GetVolumeClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

}
