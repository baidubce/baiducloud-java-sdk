package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteNodesClusterScalingV2Request extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * deleteOption
    */
    private DeleteOption deleteOption;

    /**
    * 要删除的节点 ID 列表
    */
    private List<String> instanceIDs;

    /**
    * 是否同时减少被删除节点所在节点组的期望节点数
    */
    private Boolean scaleDown;

    public String getClusterID() {
        return clusterID;
    }

    public DeleteNodesClusterScalingV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public DeleteOption getDeleteOption() {
        return deleteOption;
    }

    public DeleteNodesClusterScalingV2Request setDeleteOption(DeleteOption deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    public List<String> getInstanceIDs() {
        return instanceIDs;
    }

    public DeleteNodesClusterScalingV2Request setInstanceIDs(List<String> instanceIDs) {
        this.instanceIDs = instanceIDs;
        return this;
    }

    public Boolean getScaleDown() {
        return scaleDown;
    }

    public DeleteNodesClusterScalingV2Request setScaleDown(Boolean scaleDown) {
        this.scaleDown = scaleDown;
        return this;
    }

}
