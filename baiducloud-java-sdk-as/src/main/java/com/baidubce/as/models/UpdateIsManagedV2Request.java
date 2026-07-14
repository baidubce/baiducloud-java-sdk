package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateIsManagedV2Request extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * updateIsManaged
    */
    @JsonIgnore
    private String updateIsManaged;

    /**
    * 新增托管的节点列表
    */
    private List<String> addManagedNodeIds;

    /**
    * 取消托管的节点列表
    */
    private List<String> delManagedNodeIds;

    public String getGroupId() {
        return groupId;
    }

    public UpdateIsManagedV2Request setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getUpdateIsManaged() {
        return updateIsManaged;
    }

    public UpdateIsManagedV2Request setUpdateIsManaged(String updateIsManaged) {
        this.updateIsManaged = updateIsManaged;
        return this;
    }

    public List<String> getAddManagedNodeIds() {
        return addManagedNodeIds;
    }

    public UpdateIsManagedV2Request setAddManagedNodeIds(List<String> addManagedNodeIds) {
        this.addManagedNodeIds = addManagedNodeIds;
        return this;
    }

    public List<String> getDelManagedNodeIds() {
        return delManagedNodeIds;
    }

    public UpdateIsManagedV2Request setDelManagedNodeIds(List<String> delManagedNodeIds) {
        this.delManagedNodeIds = delManagedNodeIds;
        return this;
    }

}
