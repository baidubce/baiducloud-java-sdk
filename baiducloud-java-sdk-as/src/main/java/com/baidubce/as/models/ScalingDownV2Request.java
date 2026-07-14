package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScalingDownV2Request extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * scalingDown
    */
    @JsonIgnore
    private String scalingDown;

    /**
    * 期望缩容的节点列表
    */
    private List<String> nodes;

    public String getGroupId() {
        return groupId;
    }

    public ScalingDownV2Request setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getScalingDown() {
        return scalingDown;
    }

    public ScalingDownV2Request setScalingDown(String scalingDown) {
        this.scalingDown = scalingDown;
        return this;
    }

    public List<String> getNodes() {
        return nodes;
    }

    public ScalingDownV2Request setNodes(List<String> nodes) {
        this.nodes = nodes;
        return this;
    }

}
