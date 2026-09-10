package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyTheNumberOfNodeReplicasInANodeGroupV2Request extends BaseBceRequest {

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
    * 期望的节点组节点的副本数. 取值范围是自然数集.
    */
    private Integer replicas;

    /**
    * 指定被添加或是优先被删除的节点 ID 集合
    */
    private List<String> instanceIDs;

    /**
    * 是否删除节点组收缩时被剔除的节点. 默认为 false. 此值的优先级高于节点组CleanPolicy, 被缩容节点使用该配置.
    */
    private Boolean deleteInstance;

    /**
    * deleteOption
    */
    private DeleteOption deleteOption;

    public String getClusterID() {
        return clusterID;
    }

    public ModifyTheNumberOfNodeReplicasInANodeGroupV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getInstanceGroupID() {
        return instanceGroupID;
    }

    public ModifyTheNumberOfNodeReplicasInANodeGroupV2Request setInstanceGroupID(String instanceGroupID) {
        this.instanceGroupID = instanceGroupID;
        return this;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public ModifyTheNumberOfNodeReplicasInANodeGroupV2Request setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public List<String> getInstanceIDs() {
        return instanceIDs;
    }

    public ModifyTheNumberOfNodeReplicasInANodeGroupV2Request setInstanceIDs(List<String> instanceIDs) {
        this.instanceIDs = instanceIDs;
        return this;
    }

    public Boolean getDeleteInstance() {
        return deleteInstance;
    }

    public ModifyTheNumberOfNodeReplicasInANodeGroupV2Request setDeleteInstance(Boolean deleteInstance) {
        this.deleteInstance = deleteInstance;
        return this;
    }

    public DeleteOption getDeleteOption() {
        return deleteOption;
    }

    public ModifyTheNumberOfNodeReplicasInANodeGroupV2Request setDeleteOption(DeleteOption deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

}
