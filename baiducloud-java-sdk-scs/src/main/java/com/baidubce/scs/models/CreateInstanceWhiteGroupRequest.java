package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInstanceWhiteGroupRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 白名单分组名称
    */
    private String groupName;

    /**
    * 白名单分组名称
    */
    private List<String> clusterIpList;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateInstanceWhiteGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public CreateInstanceWhiteGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public List<String> getClusterIpList() {
        return clusterIpList;
    }

    public CreateInstanceWhiteGroupRequest setClusterIpList(List<String> clusterIpList) {
        this.clusterIpList = clusterIpList;
        return this;
    }

}
