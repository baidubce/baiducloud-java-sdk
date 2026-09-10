package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAShrinkingNodeGroupTaskV2Request extends BaseBceRequest {

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
    * 缩容节点组时计划从节点组移除的节点 ID 列表
    */
    private List<String> instancesToBeRemoved;

    /**
    * 缩容节点组时计划从节点组移除的 K8s 节点名称列表。instancesToBeRemoved 和 k8sNodesToBeRemoved 至少填一个
    */
    private List<String> k8sNodesToBeRemoved;

    /**
    * 缩容节点组时是否保留节点对应的实例, 可选 [Remain,Delete]
    */
    private String cleanPolicy;

    /**
    * deleteOption
    */
    private DeleteOption deleteOption;

    public String getClusterID() {
        return clusterID;
    }

    public CreateAShrinkingNodeGroupTaskV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getInstanceGroupID() {
        return instanceGroupID;
    }

    public CreateAShrinkingNodeGroupTaskV2Request setInstanceGroupID(String instanceGroupID) {
        this.instanceGroupID = instanceGroupID;
        return this;
    }

    public List<String> getInstancesToBeRemoved() {
        return instancesToBeRemoved;
    }

    public CreateAShrinkingNodeGroupTaskV2Request setInstancesToBeRemoved(List<String> instancesToBeRemoved) {
        this.instancesToBeRemoved = instancesToBeRemoved;
        return this;
    }

    public List<String> getK8sNodesToBeRemoved() {
        return k8sNodesToBeRemoved;
    }

    public CreateAShrinkingNodeGroupTaskV2Request setK8sNodesToBeRemoved(List<String> k8sNodesToBeRemoved) {
        this.k8sNodesToBeRemoved = k8sNodesToBeRemoved;
        return this;
    }

    public String getCleanPolicy() {
        return cleanPolicy;
    }

    public CreateAShrinkingNodeGroupTaskV2Request setCleanPolicy(String cleanPolicy) {
        this.cleanPolicy = cleanPolicy;
        return this;
    }

    public DeleteOption getDeleteOption() {
        return deleteOption;
    }

    public CreateAShrinkingNodeGroupTaskV2Request setDeleteOption(DeleteOption deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

}
