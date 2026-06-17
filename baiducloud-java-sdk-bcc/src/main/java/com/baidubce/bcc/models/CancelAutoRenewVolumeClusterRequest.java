package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CancelAutoRenewVolumeClusterRequest extends BaseBceRequest {

    /**
    * 专属集群ID
    */
    private String clusterId;

    public String getClusterId() {
        return clusterId;
    }

    public CancelAutoRenewVolumeClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

}
