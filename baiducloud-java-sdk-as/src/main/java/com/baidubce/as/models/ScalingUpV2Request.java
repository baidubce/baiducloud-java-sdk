package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScalingUpV2Request extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * scalingUp
    */
    @JsonIgnore
    private String scalingUp;

    /**
    * 节点数量
    */
    private Integer nodeCount;

    /**
    * 区域信息
    */
    private List<String> zone;

    /**
    * 扩容策略 ( Priority - 以单独可用区进行创建 ; Balanced - 在选定可用区中均衡创建)
    */
    private String expansionStrategy;

    public String getGroupId() {
        return groupId;
    }

    public ScalingUpV2Request setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getScalingUp() {
        return scalingUp;
    }

    public ScalingUpV2Request setScalingUp(String scalingUp) {
        this.scalingUp = scalingUp;
        return this;
    }

    public Integer getNodeCount() {
        return nodeCount;
    }

    public ScalingUpV2Request setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    public List<String> getZone() {
        return zone;
    }

    public ScalingUpV2Request setZone(List<String> zone) {
        this.zone = zone;
        return this;
    }

    public String getExpansionStrategy() {
        return expansionStrategy;
    }

    public ScalingUpV2Request setExpansionStrategy(String expansionStrategy) {
        this.expansionStrategy = expansionStrategy;
        return this;
    }

}
