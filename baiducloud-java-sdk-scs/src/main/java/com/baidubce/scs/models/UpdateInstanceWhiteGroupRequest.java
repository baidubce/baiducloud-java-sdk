package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInstanceWhiteGroupRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 要修改的分组名称
    */
    private String groupName;

    /**
    * 新的分组名称
    */
    private String newGroupName;

    /**
    * 白名单IP列表
    */
    private List<String> clusterIpList;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateInstanceWhiteGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public UpdateInstanceWhiteGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getNewGroupName() {
        return newGroupName;
    }

    public UpdateInstanceWhiteGroupRequest setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
        return this;
    }

    public List<String> getClusterIpList() {
        return clusterIpList;
    }

    public UpdateInstanceWhiteGroupRequest setClusterIpList(List<String> clusterIpList) {
        this.clusterIpList = clusterIpList;
        return this;
    }

}
