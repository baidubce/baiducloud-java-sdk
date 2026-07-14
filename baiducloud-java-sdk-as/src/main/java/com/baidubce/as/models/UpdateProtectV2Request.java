package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateProtectV2Request extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * updateProtect
    */
    @JsonIgnore
    private String updateProtect;

    /**
    * 待移入实例短id列表
    */
    private List<String> nodes;

    /**
    * 是否将nodes中节点设置为保护节点
    */
    private Boolean isProtected;

    public String getGroupId() {
        return groupId;
    }

    public UpdateProtectV2Request setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getUpdateProtect() {
        return updateProtect;
    }

    public UpdateProtectV2Request setUpdateProtect(String updateProtect) {
        this.updateProtect = updateProtect;
        return this;
    }

    public List<String> getNodes() {
        return nodes;
    }

    public UpdateProtectV2Request setNodes(List<String> nodes) {
        this.nodes = nodes;
        return this;
    }

    public Boolean getIsProtected() {
        return isProtected;
    }

    public UpdateProtectV2Request setIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
        return this;
    }

}
