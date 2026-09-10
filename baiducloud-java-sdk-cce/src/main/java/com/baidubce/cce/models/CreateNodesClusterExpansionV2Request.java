package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateNodesClusterExpansionV2Request extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * 为集群增加的节点列表
    */
    @JsonProperty("无（RequestBody 为数组）")
    private List<InstanceSet> 无（requestBody为数组）;

    public String getClusterID() {
        return clusterID;
    }

    public CreateNodesClusterExpansionV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public List<InstanceSet> get无（requestBody为数组）()
    {
        return 无（requestBody为数组）;
    }

    public CreateNodesClusterExpansionV2Request set无（requestBody为数组）(List<InstanceSet> 无（requestBody为数组）)
    {
        this.无（requestBody为数组） = 无（requestBody为数组）;
        return this;
    }

}
