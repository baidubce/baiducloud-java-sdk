package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeVolumeClusterRequest extends BaseBceRequest {

    /**
    * clusterId
    */
    @JsonIgnore
    private String clusterId;

    /**
    * 新扩容专属集群容量大小，必须为大于当前专属集群容量的整数，单位为GB，大小为87040~1039360的正整数。
    */
    private Integer newClusterSizeInGB;

    public String getClusterId() {
        return clusterId;
    }

    public ResizeVolumeClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public Integer getNewClusterSizeInGB() {
        return newClusterSizeInGB;
    }

    public ResizeVolumeClusterRequest setNewClusterSizeInGB(Integer newClusterSizeInGB) {
        this.newClusterSizeInGB = newClusterSizeInGB;
        return this;
    }

}
