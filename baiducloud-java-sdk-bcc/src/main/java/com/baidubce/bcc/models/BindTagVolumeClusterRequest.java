package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindTagVolumeClusterRequest extends BaseBceRequest {

    /**
    * clusterId
    */
    @JsonIgnore
    private String clusterId;

    /**
    * 待绑定的标签列表
    */
    private List<TagModel> changeTags;

    public String getClusterId() {
        return clusterId;
    }

    public BindTagVolumeClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public List<TagModel> getChangeTags() {
        return changeTags;
    }

    public BindTagVolumeClusterRequest setChangeTags(List<TagModel> changeTags) {
        this.changeTags = changeTags;
        return this;
    }

}
